package typings.senchaTouch.Ext.layout

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlexBox extends IBox {
  
  /** [Method] Sets the flex of an item in this box layout
    * @param item Ext.Component The item of this layout which you want to update the flex of.
    * @param flex Number The flex to set on this method
    */
  var setItemFlex: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[IComponent], /* flex */ js.UndefOr[Double], Unit]
  ] = js.native
}
object IFlexBox {
  
  @scala.inline
  def apply(): IFlexBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlexBox]
  }
  
  @scala.inline
  implicit class IFlexBoxOps[Self <: IFlexBox] (val x: Self) extends AnyVal {
    
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
    def setSetItemFlex(value: (/* item */ js.UndefOr[IComponent], /* flex */ js.UndefOr[Double]) => Unit): Self = this.set("setItemFlex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetItemFlex: Self = this.set("setItemFlex", js.undefined)
  }
}
