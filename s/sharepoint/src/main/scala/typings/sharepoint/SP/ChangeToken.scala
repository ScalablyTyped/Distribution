package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeToken extends ClientValueObject {
  
  def get_stringValue(): String = js.native
  
  def set_stringValue(value: String): Unit = js.native
}
object ChangeToken {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_stringValue: () => String,
    get_typeId: () => String,
    set_stringValue: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ChangeToken = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_stringValue = js.Any.fromFunction0(get_stringValue), get_typeId = js.Any.fromFunction0(get_typeId), set_stringValue = js.Any.fromFunction1(set_stringValue), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ChangeToken]
  }
  
  @scala.inline
  implicit class ChangeTokenOps[Self <: ChangeToken] (val x: Self) extends AnyVal {
    
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
    def setGet_stringValue(value: () => String): Self = this.set("get_stringValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_stringValue(value: String => Unit): Self = this.set("set_stringValue", js.Any.fromFunction1(value))
  }
}
