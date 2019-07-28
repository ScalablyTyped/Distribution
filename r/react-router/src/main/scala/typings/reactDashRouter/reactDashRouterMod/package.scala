package typings.reactDashRouter

import typings.react.reactMod.ComponentType
import typings.reactDashRouter.Anon_WrappedComponentRef
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRouterMod {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type WithRouterProps[C /* <: ComponentType[_] */] = js.Object | Anon_WrappedComponentRef[C]
}
