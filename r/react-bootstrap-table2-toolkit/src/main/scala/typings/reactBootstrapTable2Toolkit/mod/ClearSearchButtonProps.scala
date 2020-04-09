package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearSearchButtonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ClearSearchButtonProps {
  @scala.inline
  def apply(className: String = null, onClear: () => Unit = null, text: String = null): ClearSearchButtonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSearchButtonProps]
  }
}

