package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldCalculatedErrorValue extends ClientValueObject {
  def get_errorMessage(): String = js.native
}

object FieldCalculatedErrorValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorMessage: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldCalculatedErrorValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldCalculatedErrorValue]
  }
  @scala.inline
  implicit class FieldCalculatedErrorValueOps[Self <: FieldCalculatedErrorValue] (val x: Self) extends AnyVal {
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
    def setGet_errorMessage(value: () => String): Self = this.set("get_errorMessage", js.Any.fromFunction0(value))
  }
  
}

