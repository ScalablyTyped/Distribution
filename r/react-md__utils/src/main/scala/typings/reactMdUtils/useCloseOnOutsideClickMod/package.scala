package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useCloseOnOutsideClickMod {
  type Contains = js.Function2[
    /* container */ typings.reactMdUtils.containsElementMod.CheckableThing, 
    /* child */ typings.reactMdUtils.containsElementMod.CheckableThing, 
    scala.Boolean
  ]
  type OnOutsideClick[E /* <: typings.std.HTMLElement */] = js.Function3[
    /* element */ E | scala.Null, 
    /* target */ typings.std.HTMLElement | scala.Null, 
    /* contains */ typings.reactMdUtils.useCloseOnOutsideClickMod.Contains, 
    scala.Unit
  ]
}
