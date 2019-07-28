package typings.sharepoint.SPNs.SocialNs

import typings.sharepoint.SPNs.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActor")
@js.native
class SocialActor () extends ClientValueObject {
  /** The AccountName property returns the user account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType = js.native
  /** Specifies whether the actor can be followed by the current user. */
  def get_canFollow(): Boolean = js.native
  /** Returns the URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String = js.native
  def get_emailAddress(): String = js.native
  /** Returns the URI of the user's followed content folder.
    This property is only available for social actors of type "user". */
  def get_followedContentUri(): String = js.native
  /** Returns the actor's unique identifier. */
  def get_id(): String = js.native
  /** Returns the URI of the image representing the actor.
    This property is only available if actor is User, Document, or Site. */
  def get_imageUri(): String = js.native
  /** Returns true if the current user is following the actor; otherwise, it returns false. */
  def get_isFollowed(): Boolean = js.native
  /** Returns the URI of the library containing the document.
    This property is only available for social actors of type "document". */
  def get_libraryUri(): String = js.native
  /** The Name property returns the actor's display name. */
  def get_name(): String = js.native
  /** Returns the URI of the user's personal site.
    This property is only available for social actors of type "user". */
  def get_personalSiteUri(): String = js.native
  /** Represents the status of retrieving the actor */
  def get_status(): SocialStatusCode = js.native
  /** The StatusText property returns the most recent post of the user.
    This property is only available for social actors of type "user". */
  def get_statusText(): String = js.native
  /** Returns the GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String = js.native
  /** Returns the user's title
    This property is only available for social actors of type "user". */
  def get_title(): String = js.native
  /** Returns the URI of the actor. */
  def get_uri(): String = js.native
}

