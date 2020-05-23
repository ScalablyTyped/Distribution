package typings.reactTextMarquee.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarqueeProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement] {
  var hoverToStop: js.UndefOr[Boolean] = js.undefined
  var leading: js.UndefOr[Double] = js.undefined
  var text: String
  var trailing: js.UndefOr[Double] = js.undefined
}

object MarqueeProps {
  @scala.inline
  def apply(
    text: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLTextAreaElement] = null,
    ClassAttributes: ClassAttributes[HTMLTextAreaElement] = null,
    hoverToStop: js.UndefOr[Boolean] = js.undefined,
    leading: js.UndefOr[Double] = js.undefined,
    trailing: js.UndefOr[Double] = js.undefined
  ): MarqueeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(hoverToStop)) __obj.updateDynamic("hoverToStop")(hoverToStop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarqueeProps]
  }
}

