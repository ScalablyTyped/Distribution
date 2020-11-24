package typings.senchaTouch.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICard extends IDefault {
  
  /** [Method]
    * @param item Object
    * @param isInner Object
    * @param destroying Object
    */
  @JSName("onItemInnerStateChange")
  var onItemInnerStateChange_ICard: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* isInner */ js.UndefOr[js.Any], 
      /* destroying */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object ICard {
  
  @scala.inline
  def apply(): ICard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICard]
  }
  
  @scala.inline
  implicit class ICardOps[Self <: ICard] (val x: Self) extends AnyVal {
    
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
    def setOnItemInnerStateChange(
      value: (/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any], /* destroying */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onItemInnerStateChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemInnerStateChange: Self = this.set("onItemInnerStateChange", js.undefined)
  }
}
