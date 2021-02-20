package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialFeedType extends StObject
/** Identifies the kind of post to be retrieved.  */
@JSGlobal("SP.Social.SocialFeedType")
@js.native
object SocialFeedType extends StObject {
  
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
}
