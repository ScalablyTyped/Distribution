package typings
package reactDashNativeDashReadDashMoreDashTextLib.reactDashNativeDashReadDashMoreDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadMoreProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var numberOfLines: scala.Double
  var onReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def renderRevealedFooter(onPress: js.Function0[scala.Unit]): reactLib.reactMod.ReactNode
  def renderTruncatedFooter(onPress: js.Function0[scala.Unit]): reactLib.reactMod.ReactNode
}

object ReadMoreProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    numberOfLines: scala.Double,
    renderRevealedFooter: js.Function0[scala.Unit] => reactLib.reactMod.ReactNode,
    renderTruncatedFooter: js.Function0[scala.Unit] => reactLib.reactMod.ReactNode,
    onReady: () => scala.Unit = null
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], numberOfLines = numberOfLines, renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    __obj.asInstanceOf[ReadMoreProps]
  }
}

