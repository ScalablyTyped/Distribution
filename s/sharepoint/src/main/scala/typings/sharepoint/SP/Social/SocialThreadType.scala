package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialThreadType extends StObject
@JSGlobal("SP.Social.SocialThreadType")
@js.native
object SocialThreadType extends StObject {
  
  @js.native
  sealed trait likeReference extends SocialThreadType
  
  @js.native
  sealed trait mentionReference extends SocialThreadType
  
  @js.native
  sealed trait normal extends SocialThreadType
  
  @js.native
  sealed trait replyReference extends SocialThreadType
  
  @js.native
  sealed trait tagReference extends SocialThreadType
}
