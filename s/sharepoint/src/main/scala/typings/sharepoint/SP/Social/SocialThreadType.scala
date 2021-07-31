package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialThreadType extends StObject
@JSGlobal("SP.Social.SocialThreadType")
@js.native
object SocialThreadType extends StObject {
  
  @js.native
  sealed trait likeReference
    extends StObject
       with SocialThreadType
  
  @js.native
  sealed trait mentionReference
    extends StObject
       with SocialThreadType
  
  @js.native
  sealed trait normal
    extends StObject
       with SocialThreadType
  
  @js.native
  sealed trait replyReference
    extends StObject
       with SocialThreadType
  
  @js.native
  sealed trait tagReference
    extends StObject
       with SocialThreadType
}
