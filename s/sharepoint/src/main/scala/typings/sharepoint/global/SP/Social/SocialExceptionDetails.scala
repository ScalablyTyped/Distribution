package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies information about errors that the server has encountered. */
@JSGlobal("SP.Social.SocialExceptionDetails")
@js.native
class SocialExceptionDetails ()
  extends typings.sharepoint.SP.Social.SocialExceptionDetails {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_internalErrorCode(): Double = js.native
  /* CompleteClass */
  override def get_internalMessage(): String = js.native
  /* CompleteClass */
  override def get_internalStackTrace(): String = js.native
  /** Specifies a type name associated with the internal error if a type name is available. */
  /* CompleteClass */
  override def get_internalTypeName(): String = js.native
  /* CompleteClass */
  override def get_status(): typings.sharepoint.SP.Social.SocialStatusCode = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

