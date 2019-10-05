package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies information about errors that the server has encountered. */
@JSGlobal("SP.Social.SocialExceptionDetails")
@js.native
class SocialExceptionDetails () extends ClientValueObject {
  def get_internalErrorCode(): Double = js.native
  def get_internalMessage(): String = js.native
  def get_internalStackTrace(): String = js.native
  /** Specifies a type name associated with the internal error if a type name is available. */
  def get_internalTypeName(): String = js.native
  def get_status(): SocialStatusCode = js.native
}

