package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppInstanceErrorDetails")
@js.native
class AppInstanceErrorDetails () extends ClientObject {
  def get_correlationId(): Guid = js.native
  def get_errorDetail(): java.lang.String = js.native
  def get_errorType(): AppInstanceErrorType = js.native
  def get_errorTypeName(): java.lang.String = js.native
  def get_exceptionMessage(): java.lang.String = js.native
  def get_source(): AppInstanceErrorSource = js.native
  def get_sourceName(): java.lang.String = js.native
  def set_correlationId(value: Guid): scala.Unit = js.native
  def set_errorType(value: AppInstanceErrorType): scala.Unit = js.native
  def set_source(value: AppInstanceErrorSource): scala.Unit = js.native
}

