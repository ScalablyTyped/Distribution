package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestInfo extends ClientValueObject {
  def get_body(): String
  def get_headers(): js.Any
  def get_method(): String
  def get_url(): String
  def set_body(value: String): Unit
  def set_headers(value: js.Any): Unit
  def set_method(value: String): Unit
  def set_url(value: String): Unit
}

object WebRequestInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_body: () => String,
    get_headers: () => js.Any,
    get_method: () => String,
    get_typeId: () => String,
    get_url: () => String,
    set_body: String => Unit,
    set_headers: js.Any => Unit,
    set_method: String => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WebRequestInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_body = js.Any.fromFunction0(get_body), get_headers = js.Any.fromFunction0(get_headers), get_method = js.Any.fromFunction0(get_method), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_body = js.Any.fromFunction1(set_body), set_headers = js.Any.fromFunction1(set_headers), set_method = js.Any.fromFunction1(set_method), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WebRequestInfo]
  }
}

