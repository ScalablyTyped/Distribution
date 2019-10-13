package typings.radium.radiumMod.Radium

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (radiumConfig != null) __obj.updateDynamic("radiumConfig")(radiumConfig)
    __obj.asInstanceOf[StyleRootProps]
  }
}

