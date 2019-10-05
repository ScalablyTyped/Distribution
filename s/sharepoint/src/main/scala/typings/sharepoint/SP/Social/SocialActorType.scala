package typings.sharepoint.SP.Social

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
  sealed trait document extends SocialActorType
  
  @js.native
  sealed trait site extends SocialActorType
  
  @js.native
  sealed trait tag extends SocialActorType
  
  @js.native
  sealed trait user extends SocialActorType
  
  /* 1 */ val document: typings.sharepoint.SP.Social.SocialActorType.document with Double = js.native
  /* 2 */ val site: typings.sharepoint.SP.Social.SocialActorType.site with Double = js.native
  /* 3 */ val tag: typings.sharepoint.SP.Social.SocialActorType.tag with Double = js.native
  /* 0 */ val user: typings.sharepoint.SP.Social.SocialActorType.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialActorType with Double] = js.native
}

