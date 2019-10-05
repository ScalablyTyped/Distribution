package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTabsProps
  extends HTMLProps[js.Any]
     with RippleComponent {
  var activeTab: js.UndefOr[Double] = js.undefined
  @JSName("onChange")
  var onChange_HeaderTabsProps: js.UndefOr[FormEventHandler[Header]] = js.undefined
}

object HeaderTabsProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    activeTab: Int | Double = null,
    onChange: FormEvent[Header] => Unit = null
  ): HeaderTabsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[HeaderTabsProps]
  }
}

