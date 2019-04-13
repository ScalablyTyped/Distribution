package typings
package reactDashBootstrapLib.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>[P]} */ trait PopoverProps extends js.Object {
  // Optional
  var arrowOffsetLeft: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var arrowOffsetTop: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var positionLeft: js.UndefOr[scala.Double | java.lang.String] = js.undefined
   // String support added since v0.30.0
  var positionTop: js.UndefOr[scala.Double | java.lang.String] = js.undefined
   // String support added since v0.30.0
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    arrowOffsetLeft: scala.Double | java.lang.String = null,
    arrowOffsetTop: scala.Double | java.lang.String = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    placement: java.lang.String = null,
    positionLeft: scala.Double | java.lang.String = null,
    positionTop: scala.Double | java.lang.String = null,
    title: reactLib.reactMod.ReactNode = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (arrowOffsetLeft != null) __obj.updateDynamic("arrowOffsetLeft")(arrowOffsetLeft.asInstanceOf[js.Any])
    if (arrowOffsetTop != null) __obj.updateDynamic("arrowOffsetTop")(arrowOffsetTop.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (positionLeft != null) __obj.updateDynamic("positionLeft")(positionLeft.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

