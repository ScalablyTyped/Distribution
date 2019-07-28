package typings.reactDashBootstrap.libResponsiveEmbedMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveEmbedProps extends HTMLProps[ResponsiveEmbed] {
  var a16by9: js.UndefOr[Boolean] = js.undefined
  var a4by3: js.UndefOr[Boolean] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
}

object ResponsiveEmbedProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[ResponsiveEmbed] = null,
    a16by9: js.UndefOr[Boolean] = js.undefined,
    a4by3: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null
  ): ResponsiveEmbedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(a16by9)) __obj.updateDynamic("a16by9")(a16by9)
    if (!js.isUndefined(a4by3)) __obj.updateDynamic("a4by3")(a4by3)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[ResponsiveEmbedProps]
  }
}

