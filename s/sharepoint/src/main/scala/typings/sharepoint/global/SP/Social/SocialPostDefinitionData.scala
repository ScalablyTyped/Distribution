package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about server-generated posts.
  This type can only be specified in a server-to-server call. */
@JSGlobal("SP.Social.SocialPostDefinitionData")
@js.native
class SocialPostDefinitionData ()
  extends typings.sharepoint.SP.Social.SocialPostDefinitionData {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_items(): js.Array[typings.sharepoint.SP.Social.SocialPostDefinitionDataItem] = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_items(value: js.Array[typings.sharepoint.SP.Social.SocialPostDefinitionDataItem]): js.Array[typings.sharepoint.SP.Social.SocialPostDefinitionDataItem] = js.native
  /* CompleteClass */
  override def set_name(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

