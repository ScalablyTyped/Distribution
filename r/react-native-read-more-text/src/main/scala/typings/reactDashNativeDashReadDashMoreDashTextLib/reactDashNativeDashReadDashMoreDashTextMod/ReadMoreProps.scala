package typings
package reactDashNativeDashReadDashMoreDashTextLib.reactDashNativeDashReadDashMoreDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadMoreProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var numberOfLines: scala.Double
  var onReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def renderRevealedFooter(onPress: js.Function0[scala.Unit]): reactLib.reactMod.ReactNs.ReactNode
  def renderTruncatedFooter(onPress: js.Function0[scala.Unit]): reactLib.reactMod.ReactNs.ReactNode
}

object ReadMoreProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    numberOfLines: scala.Double,
    renderRevealedFooter: js.Function1[js.Function0[scala.Unit], reactLib.reactMod.ReactNs.ReactNode],
    renderTruncatedFooter: js.Function1[js.Function0[scala.Unit], reactLib.reactMod.ReactNs.ReactNode],
    onReady: js.Function0[scala.Unit] = null
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("numberOfLines")(numberOfLines)
    __obj.updateDynamic("renderRevealedFooter")(renderRevealedFooter)
    __obj.updateDynamic("renderTruncatedFooter")(renderTruncatedFooter)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    __obj.asInstanceOf[ReadMoreProps]
  }
}

