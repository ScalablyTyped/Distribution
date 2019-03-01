package typings
package reactDashBootstrapLib.libResponsiveEmbedMod.ResponsiveEmbedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveEmbedProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libResponsiveEmbedMod.ResponsiveEmbed] {
  var a16by9: js.UndefOr[scala.Boolean] = js.undefined
  var a4by3: js.UndefOr[scala.Boolean] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object ResponsiveEmbedProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libResponsiveEmbedMod.ResponsiveEmbed] = null,
    a16by9: js.UndefOr[scala.Boolean] = js.undefined,
    a4by3: js.UndefOr[scala.Boolean] = js.undefined,
    bsClass: java.lang.String = null
  ): ResponsiveEmbedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(a16by9)) __obj.updateDynamic("a16by9")(a16by9)
    if (!js.isUndefined(a4by3)) __obj.updateDynamic("a4by3")(a4by3)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[ResponsiveEmbedProps]
  }
}

