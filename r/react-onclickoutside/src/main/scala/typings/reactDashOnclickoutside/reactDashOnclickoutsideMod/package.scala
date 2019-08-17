package typings.reactDashOnclickoutside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashOnclickoutsideMod {
  import typings.react.reactMod.ComponentType
  import typings.std.Exclude
  import typings.std.Pick

  type ComponentConstructor[P] = ComponentType[P]
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] with AdditionalProps
  type PropsOf[T] = js.Any
  type WithoutInjectedClickOutProps[P] = Pick[P, Exclude[String, String]]
}
