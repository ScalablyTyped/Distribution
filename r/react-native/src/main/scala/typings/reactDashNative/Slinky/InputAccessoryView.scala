package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.InputAccessoryViewProps
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputAccessoryView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.InputAccessoryView] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.InputAccessoryView].asInstanceOf[String | js.Object]
  def apply(backgroundColor: String = null, nativeID: String = null, style: StyleProp[ViewStyle] = null): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.InputAccessoryView] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InputAccessoryViewProps
}

