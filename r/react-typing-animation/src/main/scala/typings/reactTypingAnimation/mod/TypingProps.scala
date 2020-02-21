package typings.reactTypingAnimation.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypingProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[ReactNode] = js.undefined
  var cursorClassName: js.UndefOr[String] = js.undefined
  var hideCursor: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onAfterType: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var onBeforeType: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var onFinishedType: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var onStartedTyping: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var startDelay: js.UndefOr[Double] = js.undefined
}

object TypingProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    cursor: ReactNode = null,
    cursorClassName: String = null,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onAfterType: () => js.Object = null,
    onBeforeType: () => js.Object = null,
    onFinishedType: () => js.Object = null,
    onStartedTyping: () => js.Object = null,
    speed: Int | Double = null,
    startDelay: Int | Double = null
  ): TypingProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorClassName != null) __obj.updateDynamic("cursorClassName")(cursorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onAfterType != null) __obj.updateDynamic("onAfterType")(js.Any.fromFunction0(onAfterType))
    if (onBeforeType != null) __obj.updateDynamic("onBeforeType")(js.Any.fromFunction0(onBeforeType))
    if (onFinishedType != null) __obj.updateDynamic("onFinishedType")(js.Any.fromFunction0(onFinishedType))
    if (onStartedTyping != null) __obj.updateDynamic("onStartedTyping")(js.Any.fromFunction0(onStartedTyping))
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingProps]
  }
}

