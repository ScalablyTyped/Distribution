package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  var align: js.UndefOr[String] = js.undefined
  var col: Double
  var hideDesktop: js.UndefOr[Boolean] = js.undefined
  var hidePhone: js.UndefOr[Boolean] = js.undefined
  var hideTablet: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var offsetDesktop: js.UndefOr[Double] = js.undefined
  var offsetPhone: js.UndefOr[Double] = js.undefined
  var offsetTablet: js.UndefOr[Double] = js.undefined
  var phone: js.UndefOr[Double] = js.undefined
  var tablet: js.UndefOr[Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    col: Double,
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    ShadowedComponent: ShadowedComponent = null,
    align: String = null,
    hideDesktop: js.UndefOr[Boolean] = js.undefined,
    hidePhone: js.UndefOr[Boolean] = js.undefined,
    hideTablet: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    offsetDesktop: Int | Double = null,
    offsetPhone: Int | Double = null,
    offsetTablet: Int | Double = null,
    phone: Int | Double = null,
    tablet: Int | Double = null
  ): CellProps = {
    val __obj = js.Dynamic.literal(col = col)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
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

