package typings.schwifty.schwiftyMod

import typings.hapi.hapiMod.Plugin
import typings.schwifty.TypeofClassModel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val plugin: Plugin[RegistrationOptions] = js.native
  def assertCompatible(ModelA: TypeofClassModel, ModelB: TypeofClassModel): Unit | Error = js.native
  def assertCompatible(ModelA: TypeofClassModel, ModelB: TypeofClassModel, message: String): Unit | Error = js.native
}

