package typings.reactMapGl.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent
  extends /* key */ StringDictionary[js.Any] {
  var lngLat: js.Tuple2[Double, Double] = js.native
}

object DragEvent {
  @scala.inline
  def apply(lngLat: js.Tuple2[Double, Double]): DragEvent = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent]
  }
  @scala.inline
  implicit class DragEventOps[Self <: DragEvent] (val x: Self) extends AnyVal {
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
    def setLngLat(value: js.Tuple2[Double, Double]): Self = this.set("lngLat", value.asInstanceOf[js.Any])
  }
  
}

