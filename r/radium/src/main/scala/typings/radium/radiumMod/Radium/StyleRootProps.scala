package typings.radium.radiumMod.Radium

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleRootProps extends HTMLProps[StyleRoot] {
  var radiumConfig: js.UndefOr[RadiumConfig] = js.undefined
}

object StyleRootProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[StyleRoot] = null, radiumConfig: RadiumConfig = null): StyleRootProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (radiumConfig != null) __obj.updateDynamic("radiumConfig")(radiumConfig)
    __obj.asInstanceOf[StyleRootProps]
  }
}

