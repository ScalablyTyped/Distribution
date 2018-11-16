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
  
  val actors: actors with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialDataOverlayType with java.lang.String] = js.native
}

