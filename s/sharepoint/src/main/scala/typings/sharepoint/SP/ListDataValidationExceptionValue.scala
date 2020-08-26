package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataValidationExceptionValue extends ClientValueObject {
  def get_fieldFailures(): js.Array[ListDataValidationFailure] = js.native
  def get_itemFailure(): ListDataValidationFailure = js.native
}

object ListDataValidationExceptionValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_fieldFailures: () => js.Array[ListDataValidationFailure],
    get_itemFailure: () => ListDataValidationFailure,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListDataValidationExceptionValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_fieldFailures = js.Any.fromFunction0(get_fieldFailures), get_itemFailure = js.Any.fromFunction0(get_itemFailure), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListDataValidationExceptionValue]
  }
  @scala.inline
  implicit class ListDataValidationExceptionValueOps[Self <: ListDataValidationExceptionValue] (val x: Self) extends AnyVal {
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
    def setGet_fieldFailures(value: () => js.Array[ListDataValidationFailure]): Self = this.set("get_fieldFailures", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_itemFailure(value: () => ListDataValidationFailure): Self = this.set("get_itemFailure", js.Any.fromFunction0(value))
  }
  
}

