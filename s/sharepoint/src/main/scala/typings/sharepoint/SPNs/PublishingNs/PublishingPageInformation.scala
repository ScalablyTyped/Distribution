package typings.sharepoint.SPNs.PublishingNs

import typings.sharepoint.SPNs.ClientValueObject
import typings.sharepoint.SPNs.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPageInformation")
@js.native
class PublishingPageInformation () extends ClientValueObject {
  def get_folder(): Folder = js.native
  def get_name(): String = js.native
  def get_pageLayoutListItem(): typings.sharepoint.SPNs.ListItem[_] = js.native
  def set_folder(value: Folder): Folder = js.native
  def set_name(value: String): String = js.native
  def set_pageLayoutListItem(value: typings.sharepoint.SPNs.ListItem[_]): typings.sharepoint.SPNs.ListItem[_] = js.native
}

