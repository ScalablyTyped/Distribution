package typings.reactDashThemeableDashTs.buildDashEs5ThemeableMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticFnOptionalReturn extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object IStaticFnOptionalReturn {
  @scala.inline
  def apply(className: String = null, style: StringDictionary[js.Any] = null): IStaticFnOptionalReturn = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IStaticFnOptionalReturn]
  }
}

