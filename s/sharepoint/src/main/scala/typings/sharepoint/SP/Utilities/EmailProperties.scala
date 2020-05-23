package typings.sharepoint.SP.Utilities

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailProperties extends ClientValueObject {
  def get_additionalHeaders(): js.Any
  def get_bCC(): js.Array[String]
  def get_body(): String
  def get_cC(): js.Array[String]
  def get_from(): String
  def get_subject(): String
  def get_to(): js.Array[String]
  def set_additionalHeaders(value: js.Any): Unit
  def set_bCC(value: js.Array[String]): Unit
  def set_body(value: String): Unit
  def set_cC(value: js.Array[String]): Unit
  def set_from(value: String): Unit
  def set_subject(value: String): Unit
  def set_to(value: js.Array[String]): Unit
}

object EmailProperties {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_additionalHeaders: () => js.Any,
    get_bCC: () => js.Array[String],
    get_body: () => String,
    get_cC: () => js.Array[String],
    get_from: () => String,
    get_subject: () => String,
    get_to: () => js.Array[String],
    get_typeId: () => String,
    set_additionalHeaders: js.Any => Unit,
    set_bCC: js.Array[String] => Unit,
    set_body: String => Unit,
    set_cC: js.Array[String] => Unit,
    set_from: String => Unit,
    set_subject: String => Unit,
    set_to: js.Array[String] => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): EmailProperties = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_additionalHeaders = js.Any.fromFunction0(get_additionalHeaders), get_bCC = js.Any.fromFunction0(get_bCC), get_body = js.Any.fromFunction0(get_body), get_cC = js.Any.fromFunction0(get_cC), get_from = js.Any.fromFunction0(get_from), get_subject = js.Any.fromFunction0(get_subject), get_to = js.Any.fromFunction0(get_to), get_typeId = js.Any.fromFunction0(get_typeId), set_additionalHeaders = js.Any.fromFunction1(set_additionalHeaders), set_bCC = js.Any.fromFunction1(set_bCC), set_body = js.Any.fromFunction1(set_body), set_cC = js.Any.fromFunction1(set_cC), set_from = js.Any.fromFunction1(set_from), set_subject = js.Any.fromFunction1(set_subject), set_to = js.Any.fromFunction1(set_to), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[EmailProperties]
  }
}

