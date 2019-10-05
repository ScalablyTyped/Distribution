package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ContentTypeCreationInformation")
@js.native
class ContentTypeCreationInformation () extends ClientValueObject {
  def get_description(): String = js.native
  def get_group(): String = js.native
  def get_name(): String = js.native
  def get_parentContentType(): ContentType = js.native
  def set_description(value: String): Unit = js.native
  def set_group(value: String): Unit = js.native
  def set_name(value: String): Unit = js.native
  def set_parentContentType(value: ContentType): Unit = js.native
}

