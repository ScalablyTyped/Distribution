package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Social.SocialActorType.document
import typings.sharepoint.SP.Social.SocialActorType.site
import typings.sharepoint.SP.Social.SocialActorType.tag
import typings.sharepoint.SP.Social.SocialActorType.user
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialActorType with Double] = js.native
  /* 1 */ @js.native
  object document extends TopLevel[document with Double]
  
  /* 2 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 3 */ @js.native
  object tag extends TopLevel[tag with Double]
  
  /* 0 */ @js.native
  object user extends TopLevel[user with Double]
  
}

