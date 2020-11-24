package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
