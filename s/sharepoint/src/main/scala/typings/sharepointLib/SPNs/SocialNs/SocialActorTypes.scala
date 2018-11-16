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
  
  val all: all with java.lang.String = js.native
  val documents: documents with java.lang.String = js.native
  val excludeContentWithoutFeeds: excludeContentWithoutFeeds with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val sites: sites with java.lang.String = js.native
  val tags: tags with java.lang.String = js.native
  val users: users with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialActorTypes with java.lang.String] = js.native
}

