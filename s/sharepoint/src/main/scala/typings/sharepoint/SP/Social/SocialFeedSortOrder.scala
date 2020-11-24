package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialFeedSortOrder extends js.Object
/** Specifies whether the sort order is by creation time or modification time. */
@JSGlobal("SP.Social.SocialFeedSortOrder")
@js.native
object SocialFeedSortOrder extends js.Object {
  
  @js.native
  sealed trait byCreatedTime extends SocialFeedSortOrder
  
  @js.native
  sealed trait byModifiedTime extends SocialFeedSortOrder
}
