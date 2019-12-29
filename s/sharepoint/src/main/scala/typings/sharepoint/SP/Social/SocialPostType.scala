package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialPostType extends js.Object

@JSGlobal("SP.Social.SocialPostType")
@js.native
object SocialPostType extends js.Object {
  @js.native
  sealed trait reply extends SocialPostType
  
  @js.native
  sealed trait root extends SocialPostType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialPostType with Double] = js.native
  /* 1 */ @js.native
  object reply extends TopLevel[reply with Double]
  
  /* 0 */ @js.native
  object root extends TopLevel[root with Double]
  
}

