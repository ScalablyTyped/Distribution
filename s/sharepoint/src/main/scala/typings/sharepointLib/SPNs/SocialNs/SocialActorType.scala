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
  
  val document: document with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val tag: tag with java.lang.String = js.native
  val user: user with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialActorType with java.lang.String] = js.native
}

