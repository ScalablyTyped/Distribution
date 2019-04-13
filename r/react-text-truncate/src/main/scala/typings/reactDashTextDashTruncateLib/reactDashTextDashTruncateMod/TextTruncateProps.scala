package typings
package reactDashTextDashTruncateLib.reactDashTextDashTruncateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTruncateProps extends js.Object {
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var maxCalculateTimes: js.UndefOr[scala.Double] = js.undefined
  var onCalculated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onToggled: js.UndefOr[js.Function1[/* truncated */ scala.Boolean, scala.Unit]] = js.undefined
  var onTruncated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textElement: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var textTruncateChild: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var truncateText: js.UndefOr[java.lang.String] = js.undefined
}

object TextTruncateProps {
  @scala.inline
  def apply(
    containerClassName: java.lang.String = null,
    element: java.lang.String = null,
    line: scala.Double | scala.Boolean = null,
    maxCalculateTimes: scala.Int | scala.Double = null,
    onCalculated: () => scala.Unit = null,
    onToggled: /* truncated */ scala.Boolean => scala.Unit = null,
    onTruncated: () => scala.Unit = null,
    text: java.lang.String = null,
    textElement: reactLib.reactMod.ReactNode = null,
    textTruncateChild: reactLib.reactMod.ReactNode = null,
    truncateText: java.lang.String = null
  ): TextTruncateProps = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (element != null) __obj.updateDynamic("element")(element)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (maxCalculateTimes != null) __obj.updateDynamic("maxCalculateTimes")(maxCalculateTimes.asInstanceOf[js.Any])
    if (onCalculated != null) __obj.updateDynamic("onCalculated")(js.Any.fromFunction0(onCalculated))
    if (onToggled != null) __obj.updateDynamic("onToggled")(js.Any.fromFunction1(onToggled))
    if (onTruncated != null) __obj.updateDynamic("onTruncated")(js.Any.fromFunction0(onTruncated))
    if (text != null) __obj.updateDynamic("text")(text)
    if (textElement != null) __obj.updateDynamic("textElement")(textElement.asInstanceOf[js.Any])
    if (textTruncateChild != null) __obj.updateDynamic("textTruncateChild")(textTruncateChild.asInstanceOf[js.Any])
    if (truncateText != null) __obj.updateDynamic("truncateText")(truncateText)
    __obj.asInstanceOf[TextTruncateProps]
  }
}

