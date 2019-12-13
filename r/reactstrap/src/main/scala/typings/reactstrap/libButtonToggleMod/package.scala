package typings.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonToggleMod {
  import typings.react.reactMod.Component
  import typings.std.Exclude
  import typings.std.Pick

  type ButtonToggle[T] = Component[ButtonToggleProps, js.Object, js.Any]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
