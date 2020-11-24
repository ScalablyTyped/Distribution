package typings.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScatter extends ICartesian {
  
  /** [Method] Render the given visible clip range
    * @param surface Object
    * @param ctx Object
    * @param clip Object
    * @param clipRegion Object
    */
  @JSName("renderClipped")
  var renderClipped_IScatter: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IScatter {
  
  @scala.inline
  def apply(): IScatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScatter]
  }
  
  @scala.inline
  implicit class IScatterOps[Self <: IScatter] (val x: Self) extends AnyVal {
    
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
    def setRenderClipped(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("renderClipped", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteRenderClipped: Self = this.set("renderClipped", js.undefined)
  }
}
