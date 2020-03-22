package typings.schwifty.mod

import typings.schwifty.TypeofModel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", "assertCompatible")
@js.native
object assertCompatible extends js.Object {
  def apply(ModelA: TypeofModel, ModelB: TypeofModel): Unit | Error = js.native
  def apply(ModelA: TypeofModel, ModelB: TypeofModel, message: String): Unit | Error = js.native
}

