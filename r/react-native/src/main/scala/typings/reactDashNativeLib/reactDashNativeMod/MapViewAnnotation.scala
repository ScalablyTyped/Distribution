package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewAnnotation extends js.Object {
  var animateDrop: js.UndefOr[scala.Boolean] = js.undefined
  var detailCalloutView: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var hasLeftCallout: js.UndefOr[scala.Boolean] = js.undefined
  var hasRightCallout: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[ImageURISource] = js.undefined
  var latitude: scala.Double
  var leftCalloutView: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var longitude: scala.Double
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  var onDragStateChange: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  var onLeftCalloutPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRightCalloutPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var rightCalloutView: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var view: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

object MapViewAnnotation {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    animateDrop: js.UndefOr[scala.Boolean] = js.undefined,
    detailCalloutView: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hasLeftCallout: js.UndefOr[scala.Boolean] = js.undefined,
    hasRightCallout: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    image: ImageURISource = null,
    leftCalloutView: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    onBlur: js.Function0[_] = null,
    onDragStateChange: js.Function0[_] = null,
    onFocus: js.Function0[_] = null,
    onLeftCalloutPress: js.Function0[scala.Unit] = null,
    onRightCalloutPress: js.Function0[scala.Unit] = null,
    rightCalloutView: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    subtitle: java.lang.String = null,
    tintColor: java.lang.String = null,
    title: java.lang.String = null,
    view: reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): MapViewAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    if (!js.isUndefined(animateDrop)) __obj.updateDynamic("animateDrop")(animateDrop)
    if (detailCalloutView != null) __obj.updateDynamic("detailCalloutView")(detailCalloutView)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hasLeftCallout)) __obj.updateDynamic("hasLeftCallout")(hasLeftCallout)
    if (!js.isUndefined(hasRightCallout)) __obj.updateDynamic("hasRightCallout")(hasRightCallout)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (leftCalloutView != null) __obj.updateDynamic("leftCalloutView")(leftCalloutView)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onDragStateChange != null) __obj.updateDynamic("onDragStateChange")(onDragStateChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onLeftCalloutPress != null) __obj.updateDynamic("onLeftCalloutPress")(onLeftCalloutPress)
    if (onRightCalloutPress != null) __obj.updateDynamic("onRightCalloutPress")(onRightCalloutPress)
    if (rightCalloutView != null) __obj.updateDynamic("rightCalloutView")(rightCalloutView)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[MapViewAnnotation]
  }
}

