package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait all
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  @js.native
  sealed trait documents
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  /** The set excludes documents and sites that do not have feeds. */
  @js.native
  sealed trait excludeContentWithoutFeeds
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  @js.native
  sealed trait sites
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  @js.native
  sealed trait tags
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  @js.native
  sealed trait users
    extends sharepointLib.SPNs.SocialNs.SocialActorTypes
  
  /* 6 */ val all: all with scala.Double = js.native
  /* 2 */ val documents: documents with scala.Double = js.native
  /* 5 */ val excludeContentWithoutFeeds: excludeContentWithoutFeeds with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val sites: sites with scala.Double = js.native
  /* 4 */ val tags: tags with scala.Double = js.native
  /* 1 */ val users: users with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialActorTypes with scala.Double] = js.native
}

