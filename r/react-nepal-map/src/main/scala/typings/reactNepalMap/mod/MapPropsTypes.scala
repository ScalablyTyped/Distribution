package typings.reactNepalMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapPropsTypes extends js.Object {
  var color: js.UndefOr[String] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var onMapClick: js.UndefOr[js.Function1[/* item */ itemProps, Unit]] = js.native
  var randomSectorColor: js.UndefOr[Boolean] = js.native
  var sectorClassName: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object MapPropsTypes {
  @scala.inline
  def apply(): MapPropsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapPropsTypes]
  }
  @scala.inline
  implicit class MapPropsTypesOps[Self <: MapPropsTypes] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setOnMapClick(value: /* item */ itemProps => Unit): Self = this.set("onMapClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMapClick: Self = this.set("onMapClick", js.undefined)
    @scala.inline
    def setRandomSectorColor(value: Boolean): Self = this.set("randomSectorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomSectorColor: Self = this.set("randomSectorColor", js.undefined)
    @scala.inline
    def setSectorClassName(value: String): Self = this.set("sectorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectorClassName: Self = this.set("sectorClassName", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

