package typings.reactDashNativeDashReadDashMoreDashText.reactDashNativeDashReadDashMoreDashTextMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadMoreProps extends js.Object {
  var children: ReactNode
  var numberOfLines: Double
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderRevealedFooter(onPress: js.Function0[Unit]): ReactNode
  def renderTruncatedFooter(onPress: js.Function0[Unit]): ReactNode
}

object ReadMoreProps {
  @scala.inline
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => ReactNode,
    renderTruncatedFooter: js.Function0[Unit] => ReactNode,
    children: ReactNode = null,
    onReady: () => Unit = null
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    __obj.asInstanceOf[ReadMoreProps]
  }
}

