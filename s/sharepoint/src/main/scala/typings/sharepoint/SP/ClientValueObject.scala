package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientValueObject extends js.Object {
  def customFromJson(obj: js.Any): Boolean
  def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean
  def fromJson(obj: js.Any): Unit
  def get_typeId(): String
  def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit
}

object ClientValueObject {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ClientValueObject = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ClientValueObject]
  }
}

