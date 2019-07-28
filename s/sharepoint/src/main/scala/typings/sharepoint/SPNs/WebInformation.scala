package typings.sharepoint.SPNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebInformation")
@js.native
class WebInformation () extends ClientObject {
  def get_configuration(): Double = js.native
  def get_created(): Date = js.native
  def get_description(): String = js.native
  def get_id(): Guid = js.native
  def get_language(): Double = js.native
  def get_lastItemModifiedDate(): Date = js.native
  def get_serverRelativeUrl(): String = js.native
  def get_title(): String = js.native
  def get_webTemplate(): String = js.native
  def get_webTemplateId(): Double = js.native
}

