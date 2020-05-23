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
  var onAfterType: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBeforeType: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFinishedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStartedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
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
    onAfterType: () => Unit = null,
    onBeforeType: () => Unit = null,
    onFinishedTyping: () => Unit = null,
    onStartedTyping: () => Unit = null,
    speed: js.UndefOr[Double] = js.undefined,
    startDelay: js.UndefOr[Double] = js.undefined
  ): TypingProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorClassName != null) __obj.updateDynamic("cursorClassName")(cursorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (onAfterType != null) __obj.updateDynamic("onAfterType")(js.Any.fromFunction0(onAfterType))
    if (onBeforeType != null) __obj.updateDynamic("onBeforeType")(js.Any.fromFunction0(onBeforeType))
    if (onFinishedTyping != null) __obj.updateDynamic("onFinishedTyping")(js.Any.fromFunction0(onFinishedTyping))
    if (onStartedTyping != null) __obj.updateDynamic("onStartedTyping")(js.Any.fromFunction0(onStartedTyping))
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startDelay)) __obj.updateDynamic("startDelay")(startDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingProps]
  }
}

