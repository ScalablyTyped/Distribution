package typings.reactDashBootstrap.libSafeAnchorMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeAnchorProps
  extends AllHTMLAttributes[SafeAnchor]
     with ClassAttributes[SafeAnchor] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  @JSName("onClick")
  var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
}

object SafeAnchorProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[SafeAnchor] = null,
    ClassAttributes: ClassAttributes[SafeAnchor] = null,
    componentClass: ReactType[_] = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null
  ): SafeAnchorProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[SafeAnchorProps]
  }
}

