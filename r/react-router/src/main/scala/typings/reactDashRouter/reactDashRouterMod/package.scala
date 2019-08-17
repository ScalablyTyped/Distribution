package typings.reactDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRouterMod {
  import typings.react.reactMod.ComponentType
  import typings.reactDashRouter.Anon_WrappedComponentRef
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type WithRouterProps[C /* <: ComponentType[_] */] = js.Object | Anon_WrappedComponentRef[C]
}
