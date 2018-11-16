package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialFeedSortOrder extends js.Object

/** Specifies whether the sort order is by creation time or modification time. */
@JSGlobal("SP.Social.SocialFeedSortOrder")
@js.native
object SocialFeedSortOrder extends js.Object {
  @js.native
  sealed trait byCreatedTime
    extends sharepointLib.SPNs.SocialNs.SocialFeedSortOrder
  
  @js.native
  sealed trait byModifiedTime
    extends sharepointLib.SPNs.SocialNs.SocialFeedSortOrder
  
  val byCreatedTime: byCreatedTime with java.lang.String = js.native
  val byModifiedTime: byModifiedTime with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialFeedSortOrder with java.lang.String] = js.native
}

