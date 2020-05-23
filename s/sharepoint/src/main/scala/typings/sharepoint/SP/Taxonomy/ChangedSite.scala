package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedSite extends ChangedItem {
  def get_siteId(): Guid = js.native
  def get_termId(): Guid = js.native
  def get_termSetId(): Guid = js.native
}

