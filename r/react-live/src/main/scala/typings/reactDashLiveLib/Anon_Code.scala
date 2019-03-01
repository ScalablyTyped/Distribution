package typings
package reactDashLiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var mountStylesheet: js.UndefOr[scala.Boolean] = js.undefined
  var noInline: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ java.lang.String, java.lang.String]] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    mountStylesheet: js.UndefOr[scala.Boolean] = js.undefined,
    noInline: js.UndefOr[scala.Boolean] = js.undefined,
    scope: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    transformCode: js.Function1[/* code */ java.lang.String, java.lang.String] = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(mountStylesheet)) __obj.updateDynamic("mountStylesheet")(mountStylesheet)
    if (!js.isUndefined(noInline)) __obj.updateDynamic("noInline")(noInline)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (transformCode != null) __obj.updateDynamic("transformCode")(transformCode)
    __obj.asInstanceOf[Anon_Code]
  }
}

