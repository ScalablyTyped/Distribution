package typings
package restLib.interceptorTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    template: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Config]
  }
}

