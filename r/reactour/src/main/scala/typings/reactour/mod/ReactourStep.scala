package typings.reactour.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourStep extends js.Object {
  /**
    * Action that can be executed on target element of the step
    */
  var action: js.UndefOr[js.Function1[/* domNode */ js.Any, Unit]] = js.undefined
  /**
    * Content of the step
    */
  var content: ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, ReactNode])
  /**
    * Text read to screen reader software for this step's navigation dot
    */
  var navDotAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Position of step content
    */
  var position: js.UndefOr[ReactourStepPosition | (js.Tuple2[Double, Double])] = js.undefined
  /**
    * DOM selector to find the target element
    */
  var selector: js.UndefOr[String] = js.undefined
  /**
    * Disable interaction for this specific step.
    * Could be enabled passing `true`
    * when `disableInteraction` prop is present in Tour
    */
  var stepInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional styles
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ReactourStep {
  @scala.inline
  def apply(
    action: /* domNode */ js.Any => Unit = null,
    content: ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, ReactNode]) = null,
    navDotAriaLabel: String = null,
    position: ReactourStepPosition | (js.Tuple2[Double, Double]) = null,
    selector: String = null,
    stepInteraction: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ReactourStep = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (navDotAriaLabel != null) __obj.updateDynamic("navDotAriaLabel")(navDotAriaLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(stepInteraction)) __obj.updateDynamic("stepInteraction")(stepInteraction.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourStep]
  }
}

