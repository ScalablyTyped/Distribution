package typings.sharepoint.SP.Social

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.IntResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods for managing a user's list of followed actors.
  Actors can be users, documents, sites, and tags. */
@js.native
trait SocialFollowingManager extends ClientObject {
  
  /** Adds the specified actor to the current user's list of followed items.
    Returns one of the following values, wrapped into the SP.IntResult object:
    0 = ok,
    1 = alreadyFollowing,
    2 = limitReached,
    3 = internalError */
  def follow(actor: SocialActorInfo): IntResult = js.native
  
  def getFollowed(types: SocialActorTypes): js.Array[SocialActor] = js.native
  
  def getFollowedCount(types: SocialActorTypes): IntResult = js.native
  
  /** Returns the users who are followers of the current user. */
  def getFollowers(): js.Array[SocialActor] = js.native
  
  def getSuggestions(): js.Array[SocialActor] = js.native
  
  /** URI to a site  that lists the current user's followed documents. */
  def get_followedDocumentsUri(): String = js.native
  
  /** URI to a site  that lists the current user's followed sites. */
  def get_followedSitesUri(): String = js.native
  
  def isFollowed(actor: SocialActorInfo): BooleanResult = js.native
  
  def stopFollowing(actor: SocialActorInfo): BooleanResult = js.native
}
