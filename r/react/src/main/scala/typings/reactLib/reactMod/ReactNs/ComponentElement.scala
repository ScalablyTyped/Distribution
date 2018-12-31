package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElement[P, T /* <: Component[P, ComponentState, _] */] extends ReactElement[P] {
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
  @JSName("type")
  var type_ComponentElement: ComponentClass[P, ComponentState]
}

