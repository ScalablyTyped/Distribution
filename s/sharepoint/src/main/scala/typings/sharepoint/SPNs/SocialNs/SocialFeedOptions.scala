package typings.sharepoint.SPNs.SocialNs

import typings.sharepoint.SPNs.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Social.SocialFeedOptions")
@js.native
class SocialFeedOptions () extends ClientObject {
  def get_maxThreadCount(): Double = js.native
  def get_newerThan(): String = js.native
  def get_olderThan(): String = js.native
  def get_sortOrder(): SocialFeedSortOrder = js.native
  def set_maxThreadCount(value: Double): Double = js.native
  def set_newerThan(value: String): String = js.native
  def set_olderThan(value: String): String = js.native
  def set_sortOrder(value: SocialFeedSortOrder): SocialFeedSortOrder = js.native
}

