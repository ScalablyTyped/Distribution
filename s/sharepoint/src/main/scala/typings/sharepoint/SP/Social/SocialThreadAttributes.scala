package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialThreadAttributes extends js.Object
/** Specifies properties of the thread. */
@JSGlobal("SP.Social.SocialThreadAttributes")
@js.native
object SocialThreadAttributes extends js.Object {
  
  @js.native
  sealed trait canLock extends SocialThreadAttributes
  
  @js.native
  sealed trait canReply extends SocialThreadAttributes
  
  @js.native
  sealed trait isDigest extends SocialThreadAttributes
  
  @js.native
  sealed trait isLocked extends SocialThreadAttributes
  
  @js.native
  sealed trait none extends SocialThreadAttributes
  
  @js.native
  sealed trait replyLimitReached extends SocialThreadAttributes
}
