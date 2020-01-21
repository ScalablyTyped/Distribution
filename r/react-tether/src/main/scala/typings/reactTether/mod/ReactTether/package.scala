package typings.reactTether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTether {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactTether.reactTetherStrings.window
    - typings.reactTether.reactTetherStrings.scrollParent
    - typings.std.HTMLElement
  */
  type ContraintsTo = typings.reactTether.mod.ReactTether._ContraintsTo | java.lang.String | typings.std.HTMLElement
  type RenderProp = js.Function1[
    /* ref */ typings.react.mod.RefObject[typings.std.Element], 
    typings.react.mod.ReactNode
  ]
}
