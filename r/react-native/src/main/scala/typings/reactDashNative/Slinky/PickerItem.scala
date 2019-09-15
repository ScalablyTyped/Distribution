package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: color, label */
object PickerItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.PickerItem] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.PickerItem].asInstanceOf[String | js.Object]
  def apply(testID: String = null, value: js.Any = null): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.PickerItem] = {
    val __obj = js.Dynamic.literal()
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PickerItemProps
}

