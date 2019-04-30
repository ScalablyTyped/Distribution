package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourStep extends js.Object {
  /**
    * Action that can be executed on target element of the step
    */
  var action: js.UndefOr[js.Function1[/* domNode */ js.Any, scala.Unit]] = js.undefined
  /**
    * Content of the step
    */
  var content: reactLib.reactMod.ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, reactLib.reactMod.ReactNode])
  /**
    * Position of step content
    */
  var position: js.UndefOr[ReactourStepPosition] = js.undefined
  /**
    * DOM selector to find the target element
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disable interaction for this specific step.
    * Could be enabled passing `true`
    * when `disableInteraction` prop is present in Tour
    */
  var stepInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional styles
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ReactourStep {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, reactLib.reactMod.ReactNode]),
    action: /* domNode */ js.Any => scala.Unit = null,
    position: ReactourStepPosition = null,
    selector: java.lang.String = null,
    stepInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): ReactourStep = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (position != null) __obj.updateDynamic("position")(position)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(stepInteraction)) __obj.updateDynamic("stepInteraction")(stepInteraction)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ReactourStep]
  }
}

