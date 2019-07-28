package typings.reactDashBootstrap.libProgressBarMod

import typings.react.reactMod.ReactNode
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/ProgressBar.ProgressBar> ]: P} & {[ P in 'label' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/ProgressBar.ProgressBar>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/ProgressBar.ProgressBar>[P]} */ trait ProgressBarProps extends js.Object {
  // Optional
  var active: js.UndefOr[Boolean] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var interpolatedClass: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
   // TODO: Add more specific type
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var now: js.UndefOr[Double] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    interpolatedClass: js.Any = null,
    label: ReactNode = null,
    max: Int | Double = null,
    min: Int | Double = null,
    now: Int | Double = null,
    srOnly: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (interpolatedClass != null) __obj.updateDynamic("interpolatedClass")(interpolatedClass)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    __obj.asInstanceOf[ProgressBarProps]
  }
}

