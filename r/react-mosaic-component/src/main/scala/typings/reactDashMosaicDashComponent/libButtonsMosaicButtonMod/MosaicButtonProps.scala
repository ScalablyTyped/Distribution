package typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicButtonProps extends js.Object {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object MosaicButtonProps {
  @scala.inline
  def apply(onClick: () => Unit = null): MosaicButtonProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MosaicButtonProps]
  }
}

