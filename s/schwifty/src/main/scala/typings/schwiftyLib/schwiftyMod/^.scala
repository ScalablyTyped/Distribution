package typings
package schwiftyLib.schwiftyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val plugin: hapiLib.hapiMod.Plugin[RegistrationOptions] = js.native
  def assertCompatible(ModelA: schwiftyLib.TypeofClassModel, ModelB: schwiftyLib.TypeofClassModel): scala.Unit | stdLib.Error = js.native
  def assertCompatible(
    ModelA: schwiftyLib.TypeofClassModel,
    ModelB: schwiftyLib.TypeofClassModel,
    message: java.lang.String
  ): scala.Unit | stdLib.Error = js.native
}

