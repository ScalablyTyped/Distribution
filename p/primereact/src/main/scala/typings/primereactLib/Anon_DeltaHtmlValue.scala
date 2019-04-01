package typings
package primereactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeltaHtmlValue extends js.Object {
  var delta: js.Any
  var htmlValue: java.lang.String | scala.Null
  var source: java.lang.String
  var textValue: java.lang.String
}

object Anon_DeltaHtmlValue {
  @scala.inline
  def apply(
    delta: js.Any,
    source: java.lang.String,
    textValue: java.lang.String,
    htmlValue: java.lang.String = null
  ): Anon_DeltaHtmlValue = {
    val __obj = js.Dynamic.literal(delta = delta, source = source, textValue = textValue)
    if (htmlValue != null) __obj.updateDynamic("htmlValue")(htmlValue)
    __obj.asInstanceOf[Anon_DeltaHtmlValue]
  }
}

