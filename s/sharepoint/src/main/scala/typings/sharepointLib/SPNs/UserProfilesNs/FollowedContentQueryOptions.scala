package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedContentQueryOptions extends js.Object

@JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
@js.native
object FollowedContentQueryOptions extends js.Object {
  @js.native
  sealed trait all
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  @js.native
  sealed trait defaultOptions
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  @js.native
  sealed trait documents
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  @js.native
  sealed trait hidden
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  @js.native
  sealed trait nonFeed
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  @js.native
  sealed trait sites
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  @js.native
  sealed trait unset
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions
  
  /* 6 */ val all: all with scala.Double = js.native
  /* 5 */ val defaultOptions: defaultOptions with scala.Double = js.native
  /* 2 */ val documents: documents with scala.Double = js.native
  /* 3 */ val hidden: hidden with scala.Double = js.native
  /* 4 */ val nonFeed: nonFeed with scala.Double = js.native
  /* 1 */ val sites: sites with scala.Double = js.native
  /* 0 */ val unset: unset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions with scala.Double] = js.native
}

