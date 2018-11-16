package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActor")
@js.native
class SocialActor ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** The AccountName property returns the user account name.
                  This property is only available for social actors of type "user". */
  def get_accountName(): java.lang.String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType = js.native
  /** Specifies whether the actor can be followed by the current user. */
  def get_canFollow(): scala.Boolean = js.native
  /** Returns the URI of the document or site content.
                  This property is only available for social actors of type Document or Site. */
  def get_contentUri(): java.lang.String = js.native
  def get_emailAddress(): java.lang.String = js.native
  /** Returns the URI of the user's followed content folder.
                  This property is only available for social actors of type "user". */
  def get_followedContentUri(): java.lang.String = js.native
  /** Returns the actor's unique identifier. */
  def get_id(): java.lang.String = js.native
  /** Returns the URI of the image representing the actor.
                  This property is only available if actor is User, Document, or Site. */
  def get_imageUri(): java.lang.String = js.native
  /** Returns true if the current user is following the actor; otherwise, it returns false. */
  def get_isFollowed(): scala.Boolean = js.native
  /** Returns the URI of the library containing the document.
                  This property is only available for social actors of type "document". */
  def get_libraryUri(): java.lang.String = js.native
  /** The Name property returns the actor's display name. */
  def get_name(): java.lang.String = js.native
  /** Returns the URI of the user's personal site.
                  This property is only available for social actors of type "user". */
  def get_personalSiteUri(): java.lang.String = js.native
  /** Represents the status of retrieving the actor */
  def get_status(): SocialStatusCode = js.native
  /** The StatusText property returns the most recent post of the user.
                  This property is only available for social actors of type "user". */
  def get_statusText(): java.lang.String = js.native
  /** Returns the GUID of the tag.
                  Only available for social actors of type "tag" */
  def get_tagGuid(): java.lang.String = js.native
  /** Returns the user's title
                  This property is only available for social actors of type "user". */
  def get_title(): java.lang.String = js.native
  /** Returns the URI of the actor. */
  def get_uri(): java.lang.String = js.native
}

