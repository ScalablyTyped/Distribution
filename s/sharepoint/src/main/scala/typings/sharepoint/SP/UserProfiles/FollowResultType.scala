package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowResultType extends js.Object

@JSGlobal("SP.UserProfiles.FollowResultType")
@js.native
object FollowResultType extends js.Object {
  /** The request failed. */
  @js.native
  sealed trait failed extends FollowResultType
  
  /** The request succeeded and the item is being followed. */
  @js.native
  sealed trait followed extends FollowResultType
  
  /** The request encountered the maximum follow limit. */
  @js.native
  sealed trait hitFollowLimit extends FollowResultType
  
  /** The item was already being followed by the current user so there is no change in status. */
  @js.native
  sealed trait refollowed extends FollowResultType
  
  /** Result is unknown */
  @js.native
  sealed trait unknown extends FollowResultType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowResultType with Double] = js.native
  /* 4 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 1 */ @js.native
  object followed extends TopLevel[followed with Double]
  
  /* 3 */ @js.native
  object hitFollowLimit extends TopLevel[hitFollowLimit with Double]
  
  /* 2 */ @js.native
  object refollowed extends TopLevel[refollowed with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

