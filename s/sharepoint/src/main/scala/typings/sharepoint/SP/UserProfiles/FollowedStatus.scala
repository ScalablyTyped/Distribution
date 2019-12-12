package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UserProfiles.FollowedStatus.followed
import typings.sharepoint.SP.UserProfiles.FollowedStatus.notFollowable
import typings.sharepoint.SP.UserProfiles.FollowedStatus.notFollowed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedStatus extends js.Object

@JSGlobal("SP.UserProfiles.FollowedStatus")
@js.native
object FollowedStatus extends js.Object {
  @js.native
  sealed trait followed extends FollowedStatus
  
  @js.native
  sealed trait notFollowable extends FollowedStatus
  
  @js.native
  sealed trait notFollowed extends FollowedStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedStatus with Double] = js.native
  /* 0 */ @js.native
  object followed extends TopLevel[followed with Double]
  
  /* 2 */ @js.native
  object notFollowable extends TopLevel[notFollowable with Double]
  
  /* 1 */ @js.native
  object notFollowed extends TopLevel[notFollowed with Double]
  
}

