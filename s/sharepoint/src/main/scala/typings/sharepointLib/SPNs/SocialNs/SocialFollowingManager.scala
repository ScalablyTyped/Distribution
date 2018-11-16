package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods for managing a user's list of followed actors.
            Actors can be users, documents, sites, and tags. */
@JSGlobal("SP.Social.SocialFollowingManager")
@js.native
class SocialFollowingManager protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext) = this()
  /** Adds the specified actor to the current user's list of followed items.
                  Returns one of the following values, wrapped into the SP.IntResult object:
                  0 = ok,
                  1 = alreadyFollowing,
                  2 = limitReached,
                  3 = internalError */
  def follow(actor: SocialActorInfo): sharepointLib.SPNs.IntResult = js.native
  def getFollowed(types: SocialActorTypes): js.Array[SocialActor] = js.native
  def getFollowedCount(types: SocialActorTypes): sharepointLib.SPNs.IntResult = js.native
  /** Returns the users who are followers of the current user. */
  def getFollowers(): js.Array[SocialActor] = js.native
  def getSuggestions(): js.Array[SocialActor] = js.native
  /** URI to a site  that lists the current user's followed documents. */
  def get_followedDocumentsUri(): java.lang.String = js.native
  /** URI to a site  that lists the current user's followed sites. */
  def get_followedSitesUri(): java.lang.String = js.native
  def isFollowed(actor: SocialActorInfo): sharepointLib.SPNs.BooleanResult = js.native
  def stopFollowing(actor: SocialActorInfo): sharepointLib.SPNs.BooleanResult = js.native
}

