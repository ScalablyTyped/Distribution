package typings.reactNativePullToRefresh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PTRViewProps extends js.Object {
   // default 80
  // android only
  var colors: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  // iOS only
  var offset: js.UndefOr[Double] = js.undefined
  var onRefresh: js.UndefOr[js.Function0[_]] = js.undefined
   // default #000
  var progressBackgroundColor: js.UndefOr[String] = js.undefined
   // default O
  var style: js.UndefOr[js.Object] = js.undefined
}

object PTRViewProps {
  @scala.inline
  def apply(
    colors: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onRefresh: () => _ = null,
    progressBackgroundColor: String = null,
    style: js.Object = null
  ): PTRViewProps = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction0(onRefresh))
    if (progressBackgroundColor != null) __obj.updateDynamic("progressBackgroundColor")(progressBackgroundColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PTRViewProps]
  }
}

