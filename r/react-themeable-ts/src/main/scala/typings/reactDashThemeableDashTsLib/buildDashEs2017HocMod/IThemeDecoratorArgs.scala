package typings
package reactDashThemeableDashTsLib.buildDashEs2017HocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeDecoratorArgs extends js.Object {
  var contextPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var memoizeeOpts: js.UndefOr[js.Any] = js.undefined
  var themeKey: js.UndefOr[java.lang.String] = js.undefined
  var themeProp: js.UndefOr[java.lang.String] = js.undefined
}

object IThemeDecoratorArgs {
  @scala.inline
  def apply(
    contextPath: java.lang.String | js.Array[java.lang.String] = null,
    memoizeeOpts: js.Any = null,
    themeKey: java.lang.String = null,
    themeProp: java.lang.String = null
  ): IThemeDecoratorArgs = {
    val __obj = js.Dynamic.literal()
    if (contextPath != null) __obj.updateDynamic("contextPath")(contextPath.asInstanceOf[js.Any])
    if (memoizeeOpts != null) __obj.updateDynamic("memoizeeOpts")(memoizeeOpts)
    if (themeKey != null) __obj.updateDynamic("themeKey")(themeKey)
    if (themeProp != null) __obj.updateDynamic("themeProp")(themeProp)
    __obj.asInstanceOf[IThemeDecoratorArgs]
  }
}

