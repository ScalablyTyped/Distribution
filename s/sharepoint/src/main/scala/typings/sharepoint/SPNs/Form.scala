package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Form")
@js.native
class Form () extends ClientObject {
  def get_formType(): PageType = js.native
  def get_id(): Guid = js.native
  def get_serverRelativeUrl(): String = js.native
}

