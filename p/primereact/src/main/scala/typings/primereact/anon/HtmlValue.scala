package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlValue extends js.Object {
  var delta: js.Any
  var htmlValue: String | Null
  var source: String
  var textValue: String
}

object HtmlValue {
  @scala.inline
  def apply(delta: js.Any, source: String, textValue: String, htmlValue: String = null): HtmlValue = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], textValue = textValue.asInstanceOf[js.Any], htmlValue = htmlValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlValue]
  }
}

