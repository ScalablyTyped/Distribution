package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.ButtonProps
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.NativeTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: color, disabled, title */
object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.Button] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.Button].asInstanceOf[String | js.Object]
  def apply(
    onPress: NativeSyntheticEvent[NativeTouchEvent] => Unit,
    accessibilityLabel: String = null,
    testID: String = null
  ): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.Button] = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress))
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ButtonProps
}

