package typings.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadar extends IPolar {
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IRadar: js.UndefOr[js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], _]] = js.native
}

object IRadar {
  @scala.inline
  def apply(): IRadar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadar]
  }
  @scala.inline
  implicit class IRadarOps[Self <: IRadar] (val x: Self) extends AnyVal {
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
    def setRender(value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any]) => _): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

