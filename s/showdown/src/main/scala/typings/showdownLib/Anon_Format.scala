package typings
package showdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var parsed: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var raw: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    parsed: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    raw: java.lang.String = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_Format]
  }
}

