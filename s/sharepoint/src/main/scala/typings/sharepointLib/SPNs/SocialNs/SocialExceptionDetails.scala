package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies information about errors that the server has encountered. */
@JSGlobal("SP.Social.SocialExceptionDetails")
@js.native
class SocialExceptionDetails ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_internalErrorCode(): scala.Double = js.native
  def get_internalMessage(): java.lang.String = js.native
  def get_internalStackTrace(): java.lang.String = js.native
  /** Specifies a type name associated with the internal error if a type name is available. */
  def get_internalTypeName(): java.lang.String = js.native
  def get_status(): SocialStatusCode = js.native
}

