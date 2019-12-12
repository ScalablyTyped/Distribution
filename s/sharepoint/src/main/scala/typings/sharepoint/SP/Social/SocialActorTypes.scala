package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Social.SocialActorTypes.all
import typings.sharepoint.SP.Social.SocialActorTypes.documents
import typings.sharepoint.SP.Social.SocialActorTypes.excludeContentWithoutFeeds
import typings.sharepoint.SP.Social.SocialActorTypes.none
import typings.sharepoint.SP.Social.SocialActorTypes.sites
import typings.sharepoint.SP.Social.SocialActorTypes.tags
import typings.sharepoint.SP.Social.SocialActorTypes.users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialActorTypes extends js.Object

/** Specifies one or more actor types in a query to the server. */
@JSGlobal("SP.Social.SocialActorTypes")
@js.native
object SocialActorTypes extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialActorTypes with Double] = js.native
  /* 6 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object documents extends TopLevel[documents with Double]
  
  /* 5 */ @js.native
  object excludeContentWithoutFeeds extends TopLevel[excludeContentWithoutFeeds with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object sites extends TopLevel[sites with Double]
  
  /* 4 */ @js.native
  object tags extends TopLevel[tags with Double]
  
  /* 1 */ @js.native
  object users extends TopLevel[users with Double]
  
}

