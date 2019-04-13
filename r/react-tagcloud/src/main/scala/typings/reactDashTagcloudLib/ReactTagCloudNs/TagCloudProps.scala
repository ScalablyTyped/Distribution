package typings
package reactDashTagcloudLib.ReactTagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCloudProps
  extends reactLib.reactMod.Props[scala.Unit] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var colorOptions: js.UndefOr[js.Object] = js.undefined
  var disableRandomColor: js.UndefOr[scala.Boolean] = js.undefined
  var maxSize: scala.Double
  var minSize: scala.Double
  var onClick: js.UndefOr[js.Function] = js.undefined
  var renderer: js.UndefOr[js.Function] = js.undefined
  var shuffle: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.Array[_]
}

object TagCloudProps {
  @scala.inline
  def apply(
    maxSize: scala.Double,
    minSize: scala.Double,
    tags: js.Array[_],
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    colorOptions: js.Object = null,
    disableRandomColor: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    onClick: js.Function = null,
    ref: reactLib.reactMod.LegacyRef[scala.Unit] = null,
    renderer: js.Function = null,
    shuffle: js.UndefOr[scala.Boolean] = js.undefined
  ): TagCloudProps = {
    val __obj = js.Dynamic.literal(maxSize = maxSize, minSize = minSize, tags = tags)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (colorOptions != null) __obj.updateDynamic("colorOptions")(colorOptions)
    if (!js.isUndefined(disableRandomColor)) __obj.updateDynamic("disableRandomColor")(disableRandomColor)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle)
    __obj.asInstanceOf[TagCloudProps]
  }
}

