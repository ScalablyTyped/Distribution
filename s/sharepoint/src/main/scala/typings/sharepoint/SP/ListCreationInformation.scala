package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreationInformation extends ClientValueObject {
  def get_customSchemaXml(): String
  def get_dataSourceProperties(): js.Any
  def get_description(): String
  def get_documentTemplateType(): Double
  def get_quickLaunchOption(): QuickLaunchOptions
  def get_templateFeatureId(): Guid
  def get_templateType(): Double
  def get_title(): String
  def get_url(): String
  def set_customSchemaXml(value: String): Unit
  def set_dataSourceProperties(value: js.Any): Unit
  def set_description(value: String): Unit
  def set_documentTemplateType(value: Double): Unit
  def set_quickLaunchOption(value: QuickLaunchOptions): Unit
  def set_templateFeatureId(value: Guid): Unit
  def set_templateType(value: Double): Unit
  def set_title(value: String): Unit
  def set_url(value: String): Unit
}

object ListCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_customSchemaXml: () => String,
    get_dataSourceProperties: () => js.Any,
    get_description: () => String,
    get_documentTemplateType: () => Double,
    get_quickLaunchOption: () => QuickLaunchOptions,
    get_templateFeatureId: () => Guid,
    get_templateType: () => Double,
    get_title: () => String,
    get_typeId: () => String,
    get_url: () => String,
    set_customSchemaXml: String => Unit,
    set_dataSourceProperties: js.Any => Unit,
    set_description: String => Unit,
    set_documentTemplateType: Double => Unit,
    set_quickLaunchOption: QuickLaunchOptions => Unit,
    set_templateFeatureId: Guid => Unit,
    set_templateType: Double => Unit,
    set_title: String => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_customSchemaXml = js.Any.fromFunction0(get_customSchemaXml), get_dataSourceProperties = js.Any.fromFunction0(get_dataSourceProperties), get_description = js.Any.fromFunction0(get_description), get_documentTemplateType = js.Any.fromFunction0(get_documentTemplateType), get_quickLaunchOption = js.Any.fromFunction0(get_quickLaunchOption), get_templateFeatureId = js.Any.fromFunction0(get_templateFeatureId), get_templateType = js.Any.fromFunction0(get_templateType), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_customSchemaXml = js.Any.fromFunction1(set_customSchemaXml), set_dataSourceProperties = js.Any.fromFunction1(set_dataSourceProperties), set_description = js.Any.fromFunction1(set_description), set_documentTemplateType = js.Any.fromFunction1(set_documentTemplateType), set_quickLaunchOption = js.Any.fromFunction1(set_quickLaunchOption), set_templateFeatureId = js.Any.fromFunction1(set_templateFeatureId), set_templateType = js.Any.fromFunction1(set_templateType), set_title = js.Any.fromFunction1(set_title), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListCreationInformation]
  }
}

