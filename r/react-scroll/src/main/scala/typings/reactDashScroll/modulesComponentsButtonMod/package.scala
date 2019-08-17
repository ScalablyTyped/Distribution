package typings.reactDashScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modulesComponentsButtonMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.HTMLProps
  import typings.reactDashScroll.modulesComponentsLinkMod.ReactScrollLinkProps
  import typings.std.HTMLButtonElement

  type Button = Component[ButtonProps, js.Object, js.Any]
  type ButtonProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}
