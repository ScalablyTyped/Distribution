package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppInstanceErrorDetails")
@js.native
class AppInstanceErrorDetails () extends ClientObject {
  def get_correlationId(): Guid = js.native
  def get_errorDetail(): String = js.native
  def get_errorType(): AppInstanceErrorType = js.native
  def get_errorTypeName(): String = js.native
  def get_exceptionMessage(): String = js.native
  def get_source(): AppInstanceErrorSource = js.native
  def get_sourceName(): String = js.native
  def set_correlationId(value: Guid): Unit = js.native
  def set_errorType(value: AppInstanceErrorType): Unit = js.native
  def set_source(value: AppInstanceErrorSource): Unit = js.native
}

