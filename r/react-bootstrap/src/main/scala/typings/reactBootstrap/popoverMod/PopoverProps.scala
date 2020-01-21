package typings.reactBootstrap.popoverMod

import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>[P]} */ trait PopoverProps extends js.Object {
  // Optional
  var arrowOffsetLeft: js.UndefOr[Double | String] = js.undefined
  var arrowOffsetTop: js.UndefOr[Double | String] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var positionLeft: js.UndefOr[Double | String] = js.undefined
   // String support added since v0.30.0
  var positionTop: js.UndefOr[Double | String] = js.undefined
   // String support added since v0.30.0
  var title: js.UndefOr[ReactNode] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    arrowOffsetLeft: Double | String = null,
    arrowOffsetTop: Double | String = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    placement: String = null,
    positionLeft: Double | String = null,
    positionTop: Double | String = null,
    title: ReactNode = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (arrowOffsetLeft != null) __obj.updateDynamic("arrowOffsetLeft")(arrowOffsetLeft.asInstanceOf[js.Any])
    if (arrowOffsetTop != null) __obj.updateDynamic("arrowOffsetTop")(arrowOffsetTop.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (positionLeft != null) __obj.updateDynamic("positionLeft")(positionLeft.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

