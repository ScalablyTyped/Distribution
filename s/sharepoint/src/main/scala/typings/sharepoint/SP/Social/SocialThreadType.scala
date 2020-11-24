package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialThreadType extends js.Object
@JSGlobal("SP.Social.SocialThreadType")
@js.native
object SocialThreadType extends js.Object {
  
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
