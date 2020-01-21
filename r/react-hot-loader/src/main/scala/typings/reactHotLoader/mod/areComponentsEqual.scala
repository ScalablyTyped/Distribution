package typings.reactHotLoader.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hot-loader", "areComponentsEqual")
@js.native
object areComponentsEqual extends js.Object {
  def apply[T](typeA: ComponentType[T], typeB: ComponentType[T]): Boolean = js.native
}

