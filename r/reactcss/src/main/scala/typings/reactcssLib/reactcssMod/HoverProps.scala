package typings
package reactcssLib.reactcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverProps[T]
  extends reactLib.reactMod.Props[T] {
  var hover: js.UndefOr[scala.Boolean] = js.undefined
}

object HoverProps {
  @scala.inline
  def apply[T](
    children: reactLib.reactMod.ReactNode = null,
    hover: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[T] = null
  ): HoverProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverProps[T]]
  }
}

