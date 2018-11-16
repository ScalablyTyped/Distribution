package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Social.SocialFeedOptions")
@js.native
class SocialFeedOptions ()
  extends sharepointLib.SPNs.ClientObject {
  def get_maxThreadCount(): scala.Double = js.native
  def get_newerThan(): java.lang.String = js.native
  def get_olderThan(): java.lang.String = js.native
  def get_sortOrder(): SocialFeedSortOrder = js.native
  def set_maxThreadCount(value: scala.Double): scala.Double = js.native
  def set_newerThan(value: java.lang.String): java.lang.String = js.native
  def set_olderThan(value: java.lang.String): java.lang.String = js.native
  def set_sortOrder(value: SocialFeedSortOrder): SocialFeedSortOrder = js.native
}

