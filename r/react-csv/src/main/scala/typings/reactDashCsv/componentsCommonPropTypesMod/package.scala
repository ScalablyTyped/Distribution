package typings.reactDashCsv

import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsCommonPropTypesMod {
  type AsyncClickHandler = js.Function2[
    /* event */ MouseEventHandler[HTMLAnchorElement], 
    /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  type Data = js.Array[js.Object]
  type Headers = js.Array[LabelKeyObject | String]
  type SyncClickHandler = js.Function1[/* event */ MouseEventHandler[HTMLAnchorElement], Boolean | Unit]
}
