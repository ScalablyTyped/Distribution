package typings.reactcss.reactcssMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverProps[T] extends Props[T] {
  var hover: js.UndefOr[Boolean] = js.undefined
}

object HoverProps {
  @scala.inline
  def apply[T](
    children: ReactNode = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: LegacyRef[T] = null
  ): HoverProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverProps[T]]
  }
}

