package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTStatic extends js.Object {
  var ClippingRectangle: Instantiable0[typings.reactNative.mod.ClippingRectangle]
  var Group: Instantiable0[typings.reactNative.mod.Group]
  var Shape: Instantiable0[typings.reactNative.mod.Shape]
  var Surface: Instantiable0[typings.reactNative.mod.Surface]
  var Text: Instantiable0[ARTText]
}

object ARTStatic {
  @scala.inline
  def apply(
    ClippingRectangle: Instantiable0[ClippingRectangle],
    Group: Instantiable0[Group],
    Shape: Instantiable0[Shape],
    Surface: Instantiable0[Surface],
    Text: Instantiable0[ARTText]
  ): ARTStatic = {
    val __obj = js.Dynamic.literal(ClippingRectangle = ClippingRectangle.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Surface = Surface.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTStatic]
  }
}

