package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialFeedType extends js.Object

/** Identifies the kind of post to be retrieved.  */
@JSGlobal("SP.Social.SocialFeedType")
@js.native
object SocialFeedType extends js.Object {
  @js.native
  sealed trait everyone extends SocialFeedType
  
  @js.native
  sealed trait likes extends SocialFeedType
  
  @js.native
  sealed trait news extends SocialFeedType
  
  @js.native
  sealed trait personal extends SocialFeedType
  
  @js.native
  sealed trait timeline extends SocialFeedType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedType with Double] = js.native
  /* 4 */ @js.native
  object everyone extends TopLevel[everyone with Double]
  
  /* 3 */ @js.native
  object likes extends TopLevel[likes with Double]
  
  /* 1 */ @js.native
  object news extends TopLevel[news with Double]
  
  /* 0 */ @js.native
  object personal extends TopLevel[personal with Double]
  
  /* 2 */ @js.native
  object timeline extends TopLevel[timeline with Double]
  
}

