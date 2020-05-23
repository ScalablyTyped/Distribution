package typings.sharepoint.SP.Social

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
  
}

