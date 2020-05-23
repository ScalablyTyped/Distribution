package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashTag extends ClientValueObject {
  def get_name(): String
  def get_useCount(): Double
}

object HashTag {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_name: () => String,
    get_typeId: () => String,
    get_useCount: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): HashTag = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), get_useCount = js.Any.fromFunction0(get_useCount), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[HashTag]
  }
}

