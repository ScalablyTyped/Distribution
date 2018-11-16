package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActorInfo")
@js.native
class SocialActorInfo ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** User account name.
                  This property is only available for social actors of type "user". */
  def get_accountName(): java.lang.String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType = js.native
  /** URI of the document or site content.
                  This property is only available for social actors of type Document or Site. */
  def get_contentUri(): java.lang.String = js.native
  /** Actor's unique identifier. */
  def get_id(): java.lang.String = js.native
  /** GUID of the tag.
                  Only available for social actors of type "tag" */
  def get_tagGuid(): java.lang.String = js.native
  /** User account name.
                  This property is only available for social actors of type "user". */
  def set_accountName(value: java.lang.String): java.lang.String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def set_actorType(value: SocialActorType): SocialActorType = js.native
  /** URI of the document or site content.
                  This property is only available for social actors of type Document or Site. */
  def set_contentUri(value: java.lang.String): java.lang.String = js.native
  /** Actor's unique identifier. */
  def set_id(value: java.lang.String): java.lang.String = js.native
  /** GUID of the tag.
                  Only available for social actors of type "tag" */
  def set_tagGuid(value: java.lang.String): java.lang.String = js.native
}

