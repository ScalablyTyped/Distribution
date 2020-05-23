package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialDataOverlayType extends js.Object

/** Specifies whether the overlay is a link or one or more actors. */
@JSGlobal("SP.Social.SocialDataOverlayType")
@js.native
object SocialDataOverlayType extends js.Object {
  @js.native
  sealed trait actors extends SocialDataOverlayType
  
  @js.native
  sealed trait link extends SocialDataOverlayType
  
}

