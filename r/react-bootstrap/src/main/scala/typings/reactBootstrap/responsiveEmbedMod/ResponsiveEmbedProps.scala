package typings.reactBootstrap.responsiveEmbedMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveEmbedProps
  extends AllHTMLAttributes[ResponsiveEmbed]
     with ClassAttributes[ResponsiveEmbed] {
  var a16by9: js.UndefOr[Boolean] = js.undefined
  var a4by3: js.UndefOr[Boolean] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
}

object ResponsiveEmbedProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ResponsiveEmbed] = null,
    ClassAttributes: ClassAttributes[ResponsiveEmbed] = null,
    a16by9: js.UndefOr[Boolean] = js.undefined,
    a4by3: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null
  ): ResponsiveEmbedProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(a16by9)) __obj.updateDynamic("a16by9")(a16by9.asInstanceOf[js.Any])
    if (!js.isUndefined(a4by3)) __obj.updateDynamic("a4by3")(a4by3.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveEmbedProps]
  }
}

