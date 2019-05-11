package typings
package reactDashThemeableDashTsLib.buildDashEs2015ThemeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticFnOptionalReturn extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object IStaticFnOptionalReturn {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    style: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IStaticFnOptionalReturn = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IStaticFnOptionalReturn]
  }
}

