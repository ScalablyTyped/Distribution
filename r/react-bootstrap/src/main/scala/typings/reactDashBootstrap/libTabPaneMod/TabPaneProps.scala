package typings.reactDashBootstrap.libTabPaneMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashBootstrap.reactDashBootstrapMod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPaneProps
  extends AllHTMLAttributes[TabPane]
     with TransitionCallbacks
     with ClassAttributes[TabPane] {
  var animation: js.UndefOr[Boolean | (ComponentClass[_, ComponentState])] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object TabPaneProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[TabPane] = null,
    ClassAttributes: ClassAttributes[TabPane] = null,
    TransitionCallbacks: TransitionCallbacks = null,
    animation: Boolean | (ComponentClass[_, ComponentState]) = null,
    `aria-labelledby`: String = null,
    bsClass: String = null,
    eventKey: js.Any = null,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, TransitionCallbacks)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[TabPaneProps]
  }
}

