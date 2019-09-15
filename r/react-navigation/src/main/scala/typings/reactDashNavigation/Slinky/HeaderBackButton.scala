package typings.reactDashNavigation.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNavigation.reactDashNavigationMod.HeaderBackButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: title */
object HeaderBackButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNavigation.reactDashNavigationMod.HeaderBackButton] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNavigation.reactDashNavigationMod.HeaderBackButton].asInstanceOf[String | js.Object]
  def apply(
    onPress: () => Unit = null,
    pressColorAndroid: String = null,
    tintColor: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    truncatedTitle: String = null,
    width: Int | Double = null
  ): BuildingComponent[tag.type, typings.reactDashNavigation.reactDashNavigationMod.HeaderBackButton] = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeaderBackButtonProps
}

