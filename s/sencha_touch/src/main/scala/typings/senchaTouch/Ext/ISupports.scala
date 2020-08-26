package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISupports extends js.Object {
  /** [Property] (Object) */
  var AudioTag: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var GeoLocation: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var SVG: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var Transitions: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var VML: js.UndefOr[js.Any] = js.native
}

object ISupports {
  @scala.inline
  def apply(): ISupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupports]
  }
  @scala.inline
  implicit class ISupportsOps[Self <: ISupports] (val x: Self) extends AnyVal {
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
    def setAudioTag(value: js.Any): Self = this.set("AudioTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioTag: Self = this.set("AudioTag", js.undefined)
    @scala.inline
    def setGeoLocation(value: js.Any): Self = this.set("GeoLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoLocation: Self = this.set("GeoLocation", js.undefined)
    @scala.inline
    def setSVG(value: js.Any): Self = this.set("SVG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSVG: Self = this.set("SVG", js.undefined)
    @scala.inline
    def setTransitions(value: js.Any): Self = this.set("Transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("Transitions", js.undefined)
    @scala.inline
    def setVML(value: js.Any): Self = this.set("VML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVML: Self = this.set("VML", js.undefined)
  }
  
}

