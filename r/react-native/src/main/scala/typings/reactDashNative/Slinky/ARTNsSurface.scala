package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.ARTSurfaceProps
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ARTNsSurface
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.ARTNs.Surface] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.ARTNs.Surface].asInstanceOf[String | js.Object]
  def apply(height: Double, width: Double, style: StyleProp[ViewStyle] = null): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.ARTNs.Surface] = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ARTSurfaceProps
}

