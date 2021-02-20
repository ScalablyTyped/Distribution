package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialFeedSortOrder extends StObject
/** Specifies whether the sort order is by creation time or modification time. */
@JSGlobal("SP.Social.SocialFeedSortOrder")
@js.native
object SocialFeedSortOrder extends StObject {
  
  @js.native
  sealed trait byCreatedTime extends SocialFeedSortOrder
  
  @js.native
  sealed trait byModifiedTime extends SocialFeedSortOrder
}
