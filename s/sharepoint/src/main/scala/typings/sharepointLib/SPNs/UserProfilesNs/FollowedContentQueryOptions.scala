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
  
  val all: all with java.lang.String = js.native
  val defaultOptions: defaultOptions with java.lang.String = js.native
  val documents: documents with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val nonFeed: nonFeed with java.lang.String = js.native
  val sites: sites with java.lang.String = js.native
  val unset: unset with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.UserProfilesNs.FollowedContentQueryOptions with java.lang.String
  ] = js.native
}

