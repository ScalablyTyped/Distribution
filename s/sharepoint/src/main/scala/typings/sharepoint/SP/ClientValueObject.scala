package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientValueObject extends js.Object {
  def customFromJson(obj: js.Any): Boolean = js.native
  def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  def fromJson(obj: js.Any): Unit = js.native
  def get_typeId(): String = js.native
  def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
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
  @scala.inline
  implicit class ClientValueObjectOps[Self <: ClientValueObject] (val x: Self) extends AnyVal {
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
    def setCustomFromJson(value: js.Any => Boolean): Self = this.set("customFromJson", js.Any.fromFunction1(value))
    @scala.inline
    def setCustomWriteToXml(value: (XmlWriter, SerializationContext) => Boolean): Self = this.set("customWriteToXml", js.Any.fromFunction2(value))
    @scala.inline
    def setFromJson(value: js.Any => Unit): Self = this.set("fromJson", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_typeId(value: () => String): Self = this.set("get_typeId", js.Any.fromFunction0(value))
    @scala.inline
    def setWriteToXml(value: (XmlWriter, SerializationContext) => Unit): Self = this.set("writeToXml", js.Any.fromFunction2(value))
  }
  
}

