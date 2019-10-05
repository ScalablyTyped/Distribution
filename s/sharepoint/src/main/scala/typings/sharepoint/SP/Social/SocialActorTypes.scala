package typings.sharepoint.SP.Social

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
  
  /* 6 */ val all: typings.sharepoint.SP.Social.SocialActorTypes.all with Double = js.native
  /* 2 */ val documents: typings.sharepoint.SP.Social.SocialActorTypes.documents with Double = js.native
  /* 5 */ val excludeContentWithoutFeeds: typings.sharepoint.SP.Social.SocialActorTypes.excludeContentWithoutFeeds with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.Social.SocialActorTypes.none with Double = js.native
  /* 3 */ val sites: typings.sharepoint.SP.Social.SocialActorTypes.sites with Double = js.native
  /* 4 */ val tags: typings.sharepoint.SP.Social.SocialActorTypes.tags with Double = js.native
  /* 1 */ val users: typings.sharepoint.SP.Social.SocialActorTypes.users with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialActorTypes with Double] = js.native
}

