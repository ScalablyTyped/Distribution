package typings
package reactDashTypistLib.reactDashTypistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewProps extends js.Object {
  var avgTypingDelay: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cursor: js.UndefOr[reactDashTypistLib.reactDashTypistMod.TreeViewNs.CursorProps] = js.undefined
  var delayGenerator: js.UndefOr[
    js.Function3[
      /* mean */ scala.Double, 
      /* std */ scala.Double, 
      /* current */ reactDashTypistLib.reactDashTypistMod.TreeViewNs.CurrentTextProps, 
      scala.Double
    ]
  ] = js.undefined
  var onCharacterTyped: js.UndefOr[
    js.Function2[/* char */ java.lang.String, /* charIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  var onLineTyped: js.UndefOr[
    js.Function2[/* line */ java.lang.String, /* lineIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  var onTypingDone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var startDelay: js.UndefOr[scala.Double] = js.undefined
  var stdTypingDelay: js.UndefOr[scala.Double] = js.undefined
}

object TreeViewProps {
  @scala.inline
  def apply(
    avgTypingDelay: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    cursor: reactDashTypistLib.reactDashTypistMod.TreeViewNs.CursorProps = null,
    delayGenerator: (/* mean */ scala.Double, /* std */ scala.Double, /* current */ reactDashTypistLib.reactDashTypistMod.TreeViewNs.CurrentTextProps) => scala.Double = null,
    onCharacterTyped: (/* char */ java.lang.String, /* charIndex */ scala.Double) => scala.Unit = null,
    onLineTyped: (/* line */ java.lang.String, /* lineIndex */ scala.Double) => scala.Unit = null,
    onTypingDone: () => scala.Unit = null,
    startDelay: scala.Int | scala.Double = null,
    stdTypingDelay: scala.Int | scala.Double = null
  ): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    if (avgTypingDelay != null) __obj.updateDynamic("avgTypingDelay")(avgTypingDelay.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (delayGenerator != null) __obj.updateDynamic("delayGenerator")(js.Any.fromFunction3(delayGenerator))
    if (onCharacterTyped != null) __obj.updateDynamic("onCharacterTyped")(js.Any.fromFunction2(onCharacterTyped))
    if (onLineTyped != null) __obj.updateDynamic("onLineTyped")(js.Any.fromFunction2(onLineTyped))
    if (onTypingDone != null) __obj.updateDynamic("onTypingDone")(js.Any.fromFunction0(onTypingDone))
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (stdTypingDelay != null) __obj.updateDynamic("stdTypingDelay")(stdTypingDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewProps]
  }
}

