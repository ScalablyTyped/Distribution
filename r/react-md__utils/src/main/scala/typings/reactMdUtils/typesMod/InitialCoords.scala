package typings.reactMdUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialCoords extends js.Object {
  /**
    * The initial x value to use when calculating the position instead of
    * finding the container element to determine the the correct position. All
    * the other positioning logic will still be in effect to ensure the element
    * will be visible within the viewport.
    */
  var initialX: js.UndefOr[Double] = js.native
  /**
    * The initial y value to use when calculating the position instead of
    * finding the container element to determine the the correct position. All
    * the other positioning logic will still be in effect to ensure the element
    * will be visible within the viewport.
    */
  var initialY: js.UndefOr[Double] = js.native
}

object InitialCoords {
  @scala.inline
  def apply(): InitialCoords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialCoords]
  }
  @scala.inline
  implicit class InitialCoordsOps[Self <: InitialCoords] (val x: Self) extends AnyVal {
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
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialX: Self = this.set("initialX", js.undefined)
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialY: Self = this.set("initialY", js.undefined)
  }
  
}

