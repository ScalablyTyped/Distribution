package typings.sharepoint.SPNs.WebPartsNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.PropertyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts.WebPart")
@js.native
class WebPart () extends ClientObject {
  def get_hidden(): Boolean = js.native
  def get_isClosed(): Boolean = js.native
  def get_properties(): PropertyValues = js.native
  def get_subtitle(): String = js.native
  def get_title(): String = js.native
  def get_titleUrl(): String = js.native
  def get_zoneIndex(): Double = js.native
  def set_hidden(value: Boolean): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_titleUrl(value: String): Unit = js.native
}

