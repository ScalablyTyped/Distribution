package typings.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRect extends IPath {
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_IRect: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}

object IRect {
  @scala.inline
  def apply(): IRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRect]
  }
  @scala.inline
  implicit class IRectOps[Self <: IRect] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = this.set("updatePath", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdatePath: Self = this.set("updatePath", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

