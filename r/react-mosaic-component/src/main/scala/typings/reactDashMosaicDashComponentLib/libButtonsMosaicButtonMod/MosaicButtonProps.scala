package typings
package reactDashMosaicDashComponentLib.libButtonsMosaicButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicButtonProps extends js.Object {
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object MosaicButtonProps {
  @scala.inline
  def apply(onClick: () => scala.Unit = null): MosaicButtonProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MosaicButtonProps]
  }
}

