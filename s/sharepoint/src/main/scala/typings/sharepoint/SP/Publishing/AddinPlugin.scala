package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddinPlugin extends ClientObject {
  def get_description(): String = js.native
  def get_markup(): String = js.native
  def get_title(): String = js.native
  def set_description(value: String): String = js.native
  def set_markup(value: String): String = js.native
  def set_title(value: String): String = js.native
}

