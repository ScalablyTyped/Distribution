package typings.showdown

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
  var raw: js.UndefOr[String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: String = null, parsed: StringDictionary[String] = null, raw: String = null): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

