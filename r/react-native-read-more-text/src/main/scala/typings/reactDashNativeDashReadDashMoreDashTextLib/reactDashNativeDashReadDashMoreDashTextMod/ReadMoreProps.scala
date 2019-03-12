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
    renderRevealedFooter: js.Function0[scala.Unit] => reactLib.reactMod.ReactNs.ReactNode,
    renderTruncatedFooter: js.Function0[scala.Unit] => reactLib.reactMod.ReactNs.ReactNode,
    onReady: () => scala.Unit = null
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], numberOfLines = numberOfLines, renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    __obj.asInstanceOf[ReadMoreProps]
  }
}

