package typings
package reactDashNativeDashDialogLib.reactDashNativeDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var blurComponentIOS: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var children: js.Array[reactLib.reactMod.ReactNs.ReactNode]
  /**
    * default: false
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactNode],
    blurComponentIOS: reactLib.reactMod.ReactNs.ReactNode = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (blurComponentIOS != null) __obj.updateDynamic("blurComponentIOS")(blurComponentIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ContainerProps]
  }
}

