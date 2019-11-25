package typings.rest.interceptorTemplateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(params: StringDictionary[js.Any] = null, template: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

