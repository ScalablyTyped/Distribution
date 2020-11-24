package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialFeedOptions extends ClientObject {
  
  def get_maxThreadCount(): Double = js.native
  
  def get_newerThan(): String = js.native
  
  def get_olderThan(): String = js.native
  
  def get_sortOrder(): SocialFeedSortOrder = js.native
  
  def set_maxThreadCount(value: Double): Double = js.native
  
  def set_newerThan(value: String): String = js.native
  
  def set_olderThan(value: String): String = js.native
  
  def set_sortOrder(value: SocialFeedSortOrder): SocialFeedSortOrder = js.native
}
