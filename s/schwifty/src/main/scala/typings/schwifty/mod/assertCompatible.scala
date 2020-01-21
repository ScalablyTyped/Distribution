package typings.schwifty.mod

import typings.schwifty.TypeofClassModel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", "assertCompatible")
@js.native
object assertCompatible extends js.Object {
  def apply(ModelA: TypeofClassModel, ModelB: TypeofClassModel): Unit | Error = js.native
  def apply(ModelA: TypeofClassModel, ModelB: TypeofClassModel, message: String): Unit | Error = js.native
}

