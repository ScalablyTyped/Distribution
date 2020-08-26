package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreationInformation extends ClientValueObject {
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
  @scala.inline
  implicit class ListCreationInformationOps[Self <: ListCreationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet_customSchemaXml(value: () => String): Self = this.set("get_customSchemaXml", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_dataSourceProperties(value: () => js.Any): Self = this.set("get_dataSourceProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_description(value: () => String): Self = this.set("get_description", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_documentTemplateType(value: () => Double): Self = this.set("get_documentTemplateType", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_quickLaunchOption(value: () => QuickLaunchOptions): Self = this.set("get_quickLaunchOption", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_templateFeatureId(value: () => Guid): Self = this.set("get_templateFeatureId", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_templateType(value: () => Double): Self = this.set("get_templateType", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_url(value: () => String): Self = this.set("get_url", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_customSchemaXml(value: String => Unit): Self = this.set("set_customSchemaXml", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_dataSourceProperties(value: js.Any => Unit): Self = this.set("set_dataSourceProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_description(value: String => Unit): Self = this.set("set_description", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_documentTemplateType(value: Double => Unit): Self = this.set("set_documentTemplateType", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_quickLaunchOption(value: QuickLaunchOptions => Unit): Self = this.set("set_quickLaunchOption", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_templateFeatureId(value: Guid => Unit): Self = this.set("set_templateFeatureId", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_templateType(value: Double => Unit): Self = this.set("set_templateType", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_title(value: String => Unit): Self = this.set("set_title", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_url(value: String => Unit): Self = this.set("set_url", js.Any.fromFunction1(value))
  }
  
}

