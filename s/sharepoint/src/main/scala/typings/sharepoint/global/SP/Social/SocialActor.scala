package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActor")
@js.native
class SocialActor ()
  extends typings.sharepoint.SP.Social.SocialActor {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** The AccountName property returns the user account name.
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def get_accountName(): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  /* CompleteClass */
  override def get_actorType(): typings.sharepoint.SP.Social.SocialActorType = js.native
  /** Specifies whether the actor can be followed by the current user. */
  /* CompleteClass */
  override def get_canFollow(): Boolean = js.native
  /** Returns the URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  /* CompleteClass */
  override def get_contentUri(): String = js.native
  /* CompleteClass */
  override def get_emailAddress(): String = js.native
  /** Returns the URI of the user's followed content folder.
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def get_followedContentUri(): String = js.native
  /** Returns the actor's unique identifier. */
  /* CompleteClass */
  override def get_id(): String = js.native
  /** Returns the URI of the image representing the actor.
    This property is only available if actor is User, Document, or Site. */
  /* CompleteClass */
  override def get_imageUri(): String = js.native
  /** Returns true if the current user is following the actor; otherwise, it returns false. */
  /* CompleteClass */
  override def get_isFollowed(): Boolean = js.native
  /** Returns the URI of the library containing the document.
    This property is only available for social actors of type "document". */
  /* CompleteClass */
  override def get_libraryUri(): String = js.native
  /** The Name property returns the actor's display name. */
  /* CompleteClass */
  override def get_name(): String = js.native
  /** Returns the URI of the user's personal site.
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def get_personalSiteUri(): String = js.native
  /** Represents the status of retrieving the actor */
  /* CompleteClass */
  override def get_status(): typings.sharepoint.SP.Social.SocialStatusCode = js.native
  /** The StatusText property returns the most recent post of the user.
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def get_statusText(): String = js.native
  /** Returns the GUID of the tag.
    Only available for social actors of type "tag" */
  /* CompleteClass */
  override def get_tagGuid(): String = js.native
  /** Returns the user's title
    This property is only available for social actors of type "user". */
  /* CompleteClass */
  override def get_title(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Returns the URI of the actor. */
  /* CompleteClass */
  override def get_uri(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

