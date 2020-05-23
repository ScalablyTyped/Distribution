package typings.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorOptions extends js.Object {
  var colorEnd: js.UndefOr[String] = js.undefined
  var colorStart: js.UndefOr[String] = js.undefined
  var colorTrigger: js.UndefOr[String] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[ElementOrSelector] = js.undefined
}

object IndicatorOptions {
  @scala.inline
  def apply(
    colorEnd: String = null,
    colorStart: String = null,
    colorTrigger: String = null,
    indent: js.UndefOr[Double] = js.undefined,
    name: String = null,
    parent: ElementOrSelector = null
  ): IndicatorOptions = {
    val __obj = js.Dynamic.literal()
    if (colorEnd != null) __obj.updateDynamic("colorEnd")(colorEnd.asInstanceOf[js.Any])
    if (colorStart != null) __obj.updateDynamic("colorStart")(colorStart.asInstanceOf[js.Any])
    if (colorTrigger != null) __obj.updateDynamic("colorTrigger")(colorTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorOptions]
  }
}

