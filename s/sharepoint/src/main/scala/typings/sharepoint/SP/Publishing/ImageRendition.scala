package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRendition extends ClientValueObject {
  def get_height(): Double
  def get_id(): Double
  def get_name(): String
  def get_version(): Double
  def get_width(): Double
  def set_height(value: Double): Double
  def set_name(value: String): String
  def set_width(value: Double): Double
}

object ImageRendition {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_height: () => Double,
    get_id: () => Double,
    get_name: () => String,
    get_typeId: () => String,
    get_version: () => Double,
    get_width: () => Double,
    set_height: Double => Double,
    set_name: String => String,
    set_width: Double => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ImageRendition = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_height = js.Any.fromFunction0(get_height), get_id = js.Any.fromFunction0(get_id), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), get_version = js.Any.fromFunction0(get_version), get_width = js.Any.fromFunction0(get_width), set_height = js.Any.fromFunction1(set_height), set_name = js.Any.fromFunction1(set_name), set_width = js.Any.fromFunction1(set_width), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ImageRendition]
  }
}

