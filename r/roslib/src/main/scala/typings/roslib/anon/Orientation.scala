package typings.roslib.anon

import typings.roslib.mod.QuaternionLike
import typings.roslib.mod.Vector3Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Orientation extends js.Object {
  var orientation: js.UndefOr[QuaternionLike | Null] = js.native
  var position: js.UndefOr[Vector3Like | Null] = js.native
}

object Orientation {
  @scala.inline
  def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  @scala.inline
  implicit class OrientationOps[Self <: Orientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrientation(value: QuaternionLike): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOrientationNull: Self = this.set("orientation", null)
    @scala.inline
    def setPosition(value: Vector3Like): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
  
}

