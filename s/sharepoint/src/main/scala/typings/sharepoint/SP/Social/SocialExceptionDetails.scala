package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies information about errors that the server has encountered. */
@js.native
trait SocialExceptionDetails extends ClientValueObject {
  def get_internalErrorCode(): Double = js.native
  def get_internalMessage(): String = js.native
  def get_internalStackTrace(): String = js.native
  /** Specifies a type name associated with the internal error if a type name is available. */
  def get_internalTypeName(): String = js.native
  def get_status(): SocialStatusCode = js.native
}

object SocialExceptionDetails {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_internalErrorCode: () => Double,
    get_internalMessage: () => String,
    get_internalStackTrace: () => String,
    get_internalTypeName: () => String,
    get_status: () => SocialStatusCode,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialExceptionDetails = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_internalErrorCode = js.Any.fromFunction0(get_internalErrorCode), get_internalMessage = js.Any.fromFunction0(get_internalMessage), get_internalStackTrace = js.Any.fromFunction0(get_internalStackTrace), get_internalTypeName = js.Any.fromFunction0(get_internalTypeName), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialExceptionDetails]
  }
  @scala.inline
  implicit class SocialExceptionDetailsOps[Self <: SocialExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet_internalErrorCode(value: () => Double): Self = this.set("get_internalErrorCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_internalMessage(value: () => String): Self = this.set("get_internalMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_internalStackTrace(value: () => String): Self = this.set("get_internalStackTrace", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_internalTypeName(value: () => String): Self = this.set("get_internalTypeName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_status(value: () => SocialStatusCode): Self = this.set("get_status", js.Any.fromFunction0(value))
  }
  
}

