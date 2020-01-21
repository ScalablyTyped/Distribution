package typings.radium.mod.Radium

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleRootProps
  extends AllHTMLAttributes[StyleRoot]
     with ClassAttributes[StyleRoot] {
  var radiumConfig: js.UndefOr[RadiumConfig] = js.undefined
}

object StyleRootProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[StyleRoot] = null,
    ClassAttributes: ClassAttributes[StyleRoot] = null,
    radiumConfig: RadiumConfig = null
  ): StyleRootProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (radiumConfig != null) __obj.updateDynamic("radiumConfig")(radiumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleRootProps]
  }
}

