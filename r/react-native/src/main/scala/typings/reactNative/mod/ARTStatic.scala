package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARTStatic extends js.Object {
  var ClippingRectangle: Instantiable0[typings.reactNative.mod.ClippingRectangle] = js.native
  var Group: Instantiable0[typings.reactNative.mod.Group] = js.native
  var Shape: Instantiable0[typings.reactNative.mod.Shape] = js.native
  var Surface: Instantiable0[typings.reactNative.mod.Surface] = js.native
  var Text: Instantiable0[ARTText] = js.native
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
  @scala.inline
  implicit class ARTStaticOps[Self <: ARTStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClippingRectangle(value: Instantiable0[ClippingRectangle]): Self = this.set("ClippingRectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Instantiable0[Group]): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Instantiable0[Shape]): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurface(value: Instantiable0[Surface]): Self = this.set("Surface", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: Instantiable0[ARTText]): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

