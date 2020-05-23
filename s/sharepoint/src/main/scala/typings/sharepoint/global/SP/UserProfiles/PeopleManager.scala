package typings.sharepoint.global.SP.UserProfiles

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientRuntimeContext
import typings.sharepoint.SP.UserProfiles.HashTagCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for operations related to people.
  Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
  However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
@JSGlobal("SP.UserProfiles.PeopleManager")
@js.native
class PeopleManager protected ()
  extends typings.sharepoint.SP.UserProfiles.PeopleManager {
  def this(context: ClientRuntimeContext) = this()
}

/* static members */
@JSGlobal("SP.UserProfiles.PeopleManager")
@js.native
object PeopleManager extends js.Object {
  def getTrendingTags(context: ClientRuntimeContext): HashTagCollection = js.native
  /** Checks whether the first user is following the second user. */
  def isFollowing(
    context: ClientRuntimeContext,
    possibleFollowerAccountName: String,
    possibleFolloweeAccountName: String
  ): BooleanResult = js.native
}

