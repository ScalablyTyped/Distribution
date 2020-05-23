package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyValues extends ClientObject {
  def get_fieldValues(): js.Any = js.native
  def get_item(fieldName: String): js.Any = js.native
  def set_item(fieldName: String, value: js.Any): Unit = js.native
}

