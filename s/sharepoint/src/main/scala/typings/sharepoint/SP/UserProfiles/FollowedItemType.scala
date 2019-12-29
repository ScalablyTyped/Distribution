package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedItemType extends js.Object

@JSGlobal("SP.UserProfiles.FollowedItemType")
@js.native
object FollowedItemType extends js.Object {
  @js.native
  sealed trait all extends FollowedItemType
  
  @js.native
  sealed trait document extends FollowedItemType
  
  @js.native
  sealed trait site extends FollowedItemType
  
  @js.native
  sealed trait unknown extends FollowedItemType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedItemType with Double] = js.native
  /* 3 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object document extends TopLevel[document with Double]
  
  /* 2 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

