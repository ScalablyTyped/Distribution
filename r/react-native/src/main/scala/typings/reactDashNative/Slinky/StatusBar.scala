package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.StatusBarProps
import typings.reactDashNative.reactDashNativeMod.StatusBarStyle
import typings.reactDashNative.reactDashNativeStrings.fade
import typings.reactDashNative.reactDashNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: hidden */
object StatusBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.StatusBar] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.StatusBar].asInstanceOf[String | js.Object]
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    barStyle: StatusBarStyle = null,
    networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined,
    showHideTransition: fade | slide = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.StatusBar] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (!js.isUndefined(networkActivityIndicatorVisible)) __obj.updateDynamic("networkActivityIndicatorVisible")(networkActivityIndicatorVisible)
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatusBarProps
}

