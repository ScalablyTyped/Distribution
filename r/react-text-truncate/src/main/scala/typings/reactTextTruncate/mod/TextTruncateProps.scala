package typings.reactTextTruncate.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTruncateProps extends js.Object {
  var containerClassName: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Double | Boolean] = js.undefined
  var maxCalculateTimes: js.UndefOr[Double] = js.undefined
  var onCalculated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onToggled: js.UndefOr[js.Function1[/* truncated */ Boolean, Unit]] = js.undefined
  var onTruncated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textElement: js.UndefOr[ReactNode] = js.undefined
  var textTruncateChild: js.UndefOr[ReactNode] = js.undefined
  var truncateText: js.UndefOr[String] = js.undefined
}

object TextTruncateProps {
  @scala.inline
  def apply(
    containerClassName: String = null,
    element: String = null,
    line: Double | Boolean = null,
    maxCalculateTimes: Int | Double = null,
    onCalculated: () => Unit = null,
    onToggled: /* truncated */ Boolean => Unit = null,
    onTruncated: () => Unit = null,
    text: String = null,
    textElement: ReactNode = null,
    textTruncateChild: ReactNode = null,
    truncateText: String = null
  ): TextTruncateProps = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (maxCalculateTimes != null) __obj.updateDynamic("maxCalculateTimes")(maxCalculateTimes.asInstanceOf[js.Any])
    if (onCalculated != null) __obj.updateDynamic("onCalculated")(js.Any.fromFunction0(onCalculated))
    if (onToggled != null) __obj.updateDynamic("onToggled")(js.Any.fromFunction1(onToggled))
    if (onTruncated != null) __obj.updateDynamic("onTruncated")(js.Any.fromFunction0(onTruncated))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textElement != null) __obj.updateDynamic("textElement")(textElement.asInstanceOf[js.Any])
    if (textTruncateChild != null) __obj.updateDynamic("textTruncateChild")(textTruncateChild.asInstanceOf[js.Any])
    if (truncateText != null) __obj.updateDynamic("truncateText")(truncateText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTruncateProps]
  }
}

