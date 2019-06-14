package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait actors
    extends sharepointLib.SPNs.SocialNs.SocialDataOverlayType
  
  @js.native
  sealed trait link
    extends sharepointLib.SPNs.SocialNs.SocialDataOverlayType
  
  /* 1 */ val actors: actors with scala.Double = js.native
  /* 0 */ val link: link with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialDataOverlayType with scala.Double] = js.native
}

