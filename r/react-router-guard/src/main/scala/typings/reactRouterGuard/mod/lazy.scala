package typings.reactRouterGuard.mod

import typings.react.mod.ComponentType
import typings.react.mod.LazyExoticComponent
import typings.reactRouterGuard.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-guard", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[T /* <: ComponentType[_] */](factory: js.Function0[js.Promise[AnonDefault[T]]]): LazyExoticComponent[T] = js.native
}

