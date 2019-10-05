package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActorInfo")
@js.native
class SocialActorInfo () extends ClientValueObject {
  /** User account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType = js.native
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String = js.native
  /** Actor's unique identifier. */
  def get_id(): String = js.native
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String = js.native
  /** User account name.
    This property is only available for social actors of type "user". */
  def set_accountName(value: String): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def set_actorType(value: SocialActorType): SocialActorType = js.native
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def set_contentUri(value: String): String = js.native
  /** Actor's unique identifier. */
  def set_id(value: String): String = js.native
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def set_tagGuid(value: String): String = js.native
}

