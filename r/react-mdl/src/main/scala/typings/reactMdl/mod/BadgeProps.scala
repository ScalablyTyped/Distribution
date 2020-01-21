package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends ClassAttributes[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var noBackground: js.UndefOr[Boolean] = js.undefined
  var overlap: js.UndefOr[Boolean] = js.undefined
  var text: String | Double
}

object BadgeProps {
  @scala.inline
  def apply(
    text: String | Double,
    className: String = null,
    key: Key = null,
    noBackground: js.UndefOr[Boolean] = js.undefined,
    overlap: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[js.Any] = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noBackground)) __obj.updateDynamic("noBackground")(noBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

