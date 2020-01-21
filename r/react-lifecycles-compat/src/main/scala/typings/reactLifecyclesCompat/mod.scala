package typings.reactLifecyclesCompat

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycles-compat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def polyfill[T /* <: ComponentType[_] */](Comp: T): T with typings.reactLifecyclesCompat.reactLifecyclesCompatStrings.polyfill = js.native
}

