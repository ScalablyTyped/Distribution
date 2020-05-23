package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends ClientObject {
  def get_formType(): PageType = js.native
  def get_id(): Guid = js.native
  def get_serverRelativeUrl(): String = js.native
}

