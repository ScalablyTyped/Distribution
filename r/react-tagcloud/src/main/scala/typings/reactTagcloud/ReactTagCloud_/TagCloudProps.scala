package typings.reactTagcloud.ReactTagCloud_

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCloudProps extends Props[Unit] {
  var className: js.UndefOr[String] = js.undefined
  var colorOptions: js.UndefOr[js.Object] = js.undefined
  var disableRandomColor: js.UndefOr[Boolean] = js.undefined
  var maxSize: Double
  var minSize: Double
  var onClick: js.UndefOr[js.Function] = js.undefined
  var renderer: js.UndefOr[js.Function] = js.undefined
  var shuffle: js.UndefOr[Boolean] = js.undefined
  var tags: js.Array[_]
}

object TagCloudProps {
  @scala.inline
  def apply(
    maxSize: Double,
    minSize: Double,
    tags: js.Array[_],
    children: ReactNode = null,
    className: String = null,
    colorOptions: js.Object = null,
    disableRandomColor: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onClick: js.Function = null,
    ref: LegacyRef[Unit] = null,
    renderer: js.Function = null,
    shuffle: js.UndefOr[Boolean] = js.undefined
  ): TagCloudProps = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorOptions != null) __obj.updateDynamic("colorOptions")(colorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRandomColor)) __obj.updateDynamic("disableRandomColor")(disableRandomColor.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCloudProps]
  }
}

