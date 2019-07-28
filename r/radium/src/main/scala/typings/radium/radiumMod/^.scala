package typings.radium.radiumMod

import typings.radium.radiumMod.RadiumNs.RadiumConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radium", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[js.Any], _] = js.native
  // @Radium decorator
  def default[TElement /* <: js.Function */](component: TElement): TElement = js.native
}

