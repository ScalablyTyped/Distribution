package typings.sqlDashFormatter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[StringDictionary[String] | js.Array[String]] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(
    indent: String = null,
    language: String = null,
    params: StringDictionary[String] | js.Array[String] = null
  ): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indent]
  }
}

