package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTStatic extends js.Object {
  var ClippingRectangle: org.scalablytyped.runtime.Instantiable0[ClippingRectangle]
  var Group: org.scalablytyped.runtime.Instantiable0[Group]
  var Shape: org.scalablytyped.runtime.Instantiable0[Shape]
  var Surface: org.scalablytyped.runtime.Instantiable0[Surface]
  var Text: org.scalablytyped.runtime.Instantiable0[ARTText]
}

object ARTStatic {
  @scala.inline
  def apply(
    ClippingRectangle: org.scalablytyped.runtime.Instantiable0[ClippingRectangle],
    Group: org.scalablytyped.runtime.Instantiable0[Group],
    Shape: org.scalablytyped.runtime.Instantiable0[Shape],
    Surface: org.scalablytyped.runtime.Instantiable0[Surface],
    Text: org.scalablytyped.runtime.Instantiable0[ARTText]
  ): ARTStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClippingRectangle")(ClippingRectangle)
    __obj.updateDynamic("Group")(Group)
    __obj.updateDynamic("Shape")(Shape)
    __obj.updateDynamic("Surface")(Surface)
    __obj.updateDynamic("Text")(Text)
    __obj.asInstanceOf[ARTStatic]
  }
}

