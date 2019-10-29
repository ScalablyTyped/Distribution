package typings.reactDashTether.reactDashTetherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTether {
  import typings.react.reactMod.ReactNode
  import typings.react.reactMod.RefObject
  import typings.std.HTMLElement

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactDashTether.reactDashTetherStrings.window
    - typings.reactDashTether.reactDashTetherStrings.scrollParent
    - typings.std.HTMLElement
  */
  type ContraintsTo = _ContraintsTo | String | HTMLElement
  type RenderProp = js.Function1[/* ref */ RefObject[HTMLElement], ReactNode]
}
