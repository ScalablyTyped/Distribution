package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubwebQuery extends ClientValueObject {
  def get_configurationFilter(): Double = js.native
  def get_webTemplateFilter(): Double = js.native
  def set_configurationFilter(value: Double): Unit = js.native
  def set_webTemplateFilter(value: Double): Unit = js.native
}

object SubwebQuery {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_configurationFilter: () => Double,
    get_typeId: () => String,
    get_webTemplateFilter: () => Double,
    set_configurationFilter: Double => Unit,
    set_webTemplateFilter: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SubwebQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_configurationFilter = js.Any.fromFunction0(get_configurationFilter), get_typeId = js.Any.fromFunction0(get_typeId), get_webTemplateFilter = js.Any.fromFunction0(get_webTemplateFilter), set_configurationFilter = js.Any.fromFunction1(set_configurationFilter), set_webTemplateFilter = js.Any.fromFunction1(set_webTemplateFilter), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SubwebQuery]
  }
  @scala.inline
  implicit class SubwebQueryOps[Self <: SubwebQuery] (val x: Self) extends AnyVal {
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
    def setGet_configurationFilter(value: () => Double): Self = this.set("get_configurationFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_webTemplateFilter(value: () => Double): Self = this.set("get_webTemplateFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_configurationFilter(value: Double => Unit): Self = this.set("set_configurationFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_webTemplateFilter(value: Double => Unit): Self = this.set("set_webTemplateFilter", js.Any.fromFunction1(value))
  }
  
}

