package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActorInfo")
@js.native
class SocialActorInfo ()
  extends typings.sharepoint.SP.Social.SocialActorInfo {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** User account name.
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def get_accountName(): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  /* CompleteClass */
  override def get_actorType(): typings.sharepoint.SP.Social.SocialActorType = js.native
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  /* CompleteClass */
  override def get_contentUri(): String = js.native
  /** Actor's unique identifier. */
  /* CompleteClass */
  override def get_id(): String = js.native
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  /* CompleteClass */
  override def get_tagGuid(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** User account name.
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def set_accountName(value: String): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  /* CompleteClass */
  override def set_actorType(value: typings.sharepoint.SP.Social.SocialActorType): typings.sharepoint.SP.Social.SocialActorType = js.native
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  /* CompleteClass */
  override def set_contentUri(value: String): String = js.native
  /** Actor's unique identifier. */
  /* CompleteClass */
  override def set_id(value: String): String = js.native
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  /* CompleteClass */
  override def set_tagGuid(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

