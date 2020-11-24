package typings.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IItemHighlight extends IAbstract {
  
  /** [Method] Placeholder method
    * @param series Object
    * @param item Object
    * @param e Object
    */
  @JSName("onGesture")
  var onGesture_IItemHighlight: js.UndefOr[
    js.Function3[
      /* series */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IItemHighlight {
  
  @scala.inline
  def apply(): IItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemHighlight]
  }
  
  @scala.inline
  implicit class IItemHighlightOps[Self <: IItemHighlight] (val x: Self) extends AnyVal {
    
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
    def setOnGesture(
      value: (/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onGesture", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
  }
}
