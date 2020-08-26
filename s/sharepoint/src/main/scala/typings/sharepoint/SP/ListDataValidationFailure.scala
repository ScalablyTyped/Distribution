package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataValidationFailure extends ClientValueObject {
  def get_displayName(): String = js.native
  def get_message(): String = js.native
  def get_name(): String = js.native
  def get_reason(): ListDataValidationFailureReason = js.native
  def get_validationType(): ListDataValidationType = js.native
}

object ListDataValidationFailure {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_displayName: () => String,
    get_message: () => String,
    get_name: () => String,
    get_reason: () => ListDataValidationFailureReason,
    get_typeId: () => String,
    get_validationType: () => ListDataValidationType,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListDataValidationFailure = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_displayName = js.Any.fromFunction0(get_displayName), get_message = js.Any.fromFunction0(get_message), get_name = js.Any.fromFunction0(get_name), get_reason = js.Any.fromFunction0(get_reason), get_typeId = js.Any.fromFunction0(get_typeId), get_validationType = js.Any.fromFunction0(get_validationType), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListDataValidationFailure]
  }
  @scala.inline
  implicit class ListDataValidationFailureOps[Self <: ListDataValidationFailure] (val x: Self) extends AnyVal {
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
    def setGet_displayName(value: () => String): Self = this.set("get_displayName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_message(value: () => String): Self = this.set("get_message", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_reason(value: () => ListDataValidationFailureReason): Self = this.set("get_reason", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_validationType(value: () => ListDataValidationType): Self = this.set("get_validationType", js.Any.fromFunction0(value))
  }
  
}

