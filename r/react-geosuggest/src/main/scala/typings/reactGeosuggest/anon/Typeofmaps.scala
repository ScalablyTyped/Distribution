package typings.reactGeosuggest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmaps extends js.Object {
  val Data: js.Any = js.native
  // TODO find source documentation
  val adsense: js.Any = js.native
  val drawing: js.Any = js.native
  val event: js.Any = js.native
  val geometry: Typeofgeometry = js.native
  val places: js.Any = js.native
  val visualization: js.Any = js.native
}

object Typeofmaps {
  @scala.inline
  def apply(
    Data: js.Any,
    adsense: js.Any,
    drawing: js.Any,
    event: js.Any,
    geometry: Typeofgeometry,
    places: js.Any,
    visualization: js.Any
  ): Typeofmaps = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmaps]
  }
  @scala.inline
  implicit class TypeofmapsOps[Self <: Typeofmaps] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdsense(value: js.Any): Self = this.set("adsense", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawing(value: js.Any): Self = this.set("drawing", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: Typeofgeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaces(value: js.Any): Self = this.set("places", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualization(value: js.Any): Self = this.set("visualization", value.asInstanceOf[js.Any])
  }
  
}

