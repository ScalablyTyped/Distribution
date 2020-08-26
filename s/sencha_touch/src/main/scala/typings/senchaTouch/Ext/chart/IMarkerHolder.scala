package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarkerHolder extends IBase {
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers], Unit]
  ] = js.native
}

object IMarkerHolder {
  @scala.inline
  def apply(): IMarkerHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkerHolder]
  }
  @scala.inline
  implicit class IMarkerHolderOps[Self <: IMarkerHolder] (val x: Self) extends AnyVal {
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
    def setBindMarker(value: (/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers]) => Unit): Self = this.set("bindMarker", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBindMarker: Self = this.set("bindMarker", js.undefined)
  }
  
}

