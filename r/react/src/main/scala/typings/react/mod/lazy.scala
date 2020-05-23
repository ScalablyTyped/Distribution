package typings.react.mod

import typings.react.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[T /* <: ComponentType[_] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = js.native
}

