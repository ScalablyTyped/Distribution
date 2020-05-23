package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a link that includes a URI and text representation.
  This class is used to represent the location of a web site.  */
@JSGlobal("SP.Social.SocialLink")
@js.native
class SocialLink ()
  extends typings.sharepoint.SP.Social.SocialLink {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_text(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def get_uri(): String = js.native
  /* CompleteClass */
  override def set_text(value: String): String = js.native
  /* CompleteClass */
  override def set_uri(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

