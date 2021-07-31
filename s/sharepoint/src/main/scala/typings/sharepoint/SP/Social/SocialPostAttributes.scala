package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialPostAttributes extends StObject
/** Specifies attributes of the post, such as whether the current user can like or delete the post. */
@JSGlobal("SP.Social.SocialPostAttributes")
@js.native
object SocialPostAttributes extends StObject {
  
  @js.native
  sealed trait canDelete
    extends StObject
       with SocialPostAttributes
  
  @js.native
  sealed trait canFollowUp
    extends StObject
       with SocialPostAttributes
  
  @js.native
  sealed trait canLike
    extends StObject
       with SocialPostAttributes
  
  @js.native
  sealed trait none
    extends StObject
       with SocialPostAttributes
  
  @js.native
  sealed trait useAuthorImage
    extends StObject
       with SocialPostAttributes
  
  @js.native
  sealed trait useSmallImage
    extends StObject
       with SocialPostAttributes
}
