package typings
package reactDashBootstrapLib.libTabMod.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab>[P]} */ trait TabProps
  extends reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var tabClassName: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
   // TODO: Add more specific type
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    `aria-labelledby`: java.lang.String = null,
    bsClass: java.lang.String = null,
    eventKey: js.Any = null,
    onEnter: /* node */ stdLib.HTMLElement => _ = null,
    onEntered: /* node */ stdLib.HTMLElement => _ = null,
    onEntering: /* node */ stdLib.HTMLElement => _ = null,
    onExit: /* node */ stdLib.HTMLElement => _ = null,
    onExited: /* node */ stdLib.HTMLElement => _ = null,
    onExiting: /* node */ stdLib.HTMLElement => _ = null,
    tabClassName: java.lang.String = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (tabClassName != null) __obj.updateDynamic("tabClassName")(tabClassName)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[TabProps]
  }
}

