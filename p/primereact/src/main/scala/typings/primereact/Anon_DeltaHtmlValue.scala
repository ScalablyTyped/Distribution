package typings.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeltaHtmlValue extends js.Object {
  var delta: js.Any
  var htmlValue: String | Null
  var source: String
  var textValue: String
}

object Anon_DeltaHtmlValue {
  @scala.inline
  def apply(delta: js.Any, source: String, textValue: String, htmlValue: String = null): Anon_DeltaHtmlValue = {
    val __obj = js.Dynamic.literal(delta = delta, source = source, textValue = textValue)
    if (htmlValue != null) __obj.updateDynamic("htmlValue")(htmlValue)
    __obj.asInstanceOf[Anon_DeltaHtmlValue]
  }
}

