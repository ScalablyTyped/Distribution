package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends reactLib.reactMod.HTMLProps[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var col: scala.Double
  var hideDesktop: js.UndefOr[scala.Boolean] = js.undefined
  var hidePhone: js.UndefOr[scala.Boolean] = js.undefined
  var hideTablet: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var offsetDesktop: js.UndefOr[scala.Double] = js.undefined
  var offsetPhone: js.UndefOr[scala.Double] = js.undefined
  var offsetTablet: js.UndefOr[scala.Double] = js.undefined
  var phone: js.UndefOr[scala.Double] = js.undefined
  var tablet: js.UndefOr[scala.Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    col: scala.Double,
    CustomRenderedComponent: CustomRenderedComponent = null,
    HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null,
    ShadowedComponent: ShadowedComponent = null,
    align: java.lang.String = null,
    hideDesktop: js.UndefOr[scala.Boolean] = js.undefined,
    hidePhone: js.UndefOr[scala.Boolean] = js.undefined,
    hideTablet: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    offsetDesktop: scala.Int | scala.Double = null,
    offsetPhone: scala.Int | scala.Double = null,
    offsetTablet: scala.Int | scala.Double = null,
    phone: scala.Int | scala.Double = null,
    tablet: scala.Int | scala.Double = null
  ): CellProps = {
    val __obj = js.Dynamic.literal(col = col)
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(hideDesktop)) __obj.updateDynamic("hideDesktop")(hideDesktop)
    if (!js.isUndefined(hidePhone)) __obj.updateDynamic("hidePhone")(hidePhone)
    if (!js.isUndefined(hideTablet)) __obj.updateDynamic("hideTablet")(hideTablet)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetDesktop != null) __obj.updateDynamic("offsetDesktop")(offsetDesktop.asInstanceOf[js.Any])
    if (offsetPhone != null) __obj.updateDynamic("offsetPhone")(offsetPhone.asInstanceOf[js.Any])
    if (offsetTablet != null) __obj.updateDynamic("offsetTablet")(offsetTablet.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

