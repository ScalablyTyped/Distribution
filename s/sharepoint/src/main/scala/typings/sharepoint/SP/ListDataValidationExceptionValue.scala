package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataValidationExceptionValue extends ClientValueObject {
  def get_fieldFailures(): js.Array[ListDataValidationFailure]
  def get_itemFailure(): ListDataValidationFailure
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
}

