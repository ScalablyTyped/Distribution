package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialActorType extends js.Object

/** Identifies an actor as a user, document, site, or tag. */
@JSGlobal("SP.Social.SocialActorType")
@js.native
object SocialActorType extends js.Object {
  @js.native
  sealed trait document
    extends sharepointLib.SPNs.SocialNs.SocialActorType
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.SocialNs.SocialActorType
  
  @js.native
  sealed trait tag
    extends sharepointLib.SPNs.SocialNs.SocialActorType
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.SocialNs.SocialActorType
  
  /* 1 */ val document: document with scala.Double = js.native
  /* 2 */ val site: site with scala.Double = js.native
  /* 3 */ val tag: tag with scala.Double = js.native
  /* 0 */ val user: user with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialActorType with scala.Double] = js.native
}

