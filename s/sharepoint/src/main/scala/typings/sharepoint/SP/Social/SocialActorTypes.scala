package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialActorTypes extends StObject
/** Specifies one or more actor types in a query to the server. */
@JSGlobal("SP.Social.SocialActorTypes")
@js.native
object SocialActorTypes extends StObject {
  
  @js.native
  sealed trait all extends SocialActorTypes
  
  @js.native
  sealed trait documents extends SocialActorTypes
  
  /** The set excludes documents and sites that do not have feeds. */
  @js.native
  sealed trait excludeContentWithoutFeeds extends SocialActorTypes
  
  @js.native
  sealed trait none extends SocialActorTypes
  
  @js.native
  sealed trait sites extends SocialActorTypes
  
  @js.native
  sealed trait tags extends SocialActorTypes
  
  @js.native
  sealed trait users extends SocialActorTypes
}
