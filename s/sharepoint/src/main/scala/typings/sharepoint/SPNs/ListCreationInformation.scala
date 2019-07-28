package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListCreationInformation")
@js.native
class ListCreationInformation () extends ClientValueObject {
  def get_customSchemaXml(): String = js.native
  def get_dataSourceProperties(): js.Any = js.native
  def get_description(): String = js.native
  def get_documentTemplateType(): Double = js.native
  def get_quickLaunchOption(): QuickLaunchOptions = js.native
  def get_templateFeatureId(): Guid = js.native
  def get_templateType(): Double = js.native
  def get_title(): String = js.native
  def get_url(): String = js.native
  def set_customSchemaXml(value: String): Unit = js.native
  def set_dataSourceProperties(value: js.Any): Unit = js.native
  def set_description(value: String): Unit = js.native
  def set_documentTemplateType(value: Double): Unit = js.native
  def set_quickLaunchOption(value: QuickLaunchOptions): Unit = js.native
  def set_templateFeatureId(value: Guid): Unit = js.native
  def set_templateType(value: Double): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_url(value: String): Unit = js.native
}

