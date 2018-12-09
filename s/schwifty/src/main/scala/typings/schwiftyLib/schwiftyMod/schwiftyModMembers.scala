package typings
package schwiftyLib.schwiftyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", JSImport.Namespace)
@js.native
object schwiftyModMembers extends js.Object {
  val plugin: hapiLib.hapiMod.Plugin[RegistrationOptions] = js.native
  def assertCompatible(
    ModelA: ScalablyTyped.runtime.Instantiable0[Model],
    ModelB: ScalablyTyped.runtime.Instantiable0[Model]
  ): scala.Unit | nodeLib.Error = js.native
  def assertCompatible(
    ModelA: ScalablyTyped.runtime.Instantiable0[Model],
    ModelB: ScalablyTyped.runtime.Instantiable0[Model],
    message: java.lang.String
  ): scala.Unit | nodeLib.Error = js.native
}

