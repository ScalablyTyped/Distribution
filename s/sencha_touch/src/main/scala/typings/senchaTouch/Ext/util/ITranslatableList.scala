package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.util.translatable.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITranslatableList extends IAbstract {
  
  /** [Method] Returns the value of items
    * @returns Array
    */
  var getItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Sets the value of items
    * @param items Array The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.native
}
object ITranslatableList {
  
  @scala.inline
  def apply(): ITranslatableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITranslatableList]
  }
  
  @scala.inline
  implicit class ITranslatableListOps[Self <: ITranslatableList] (val x: Self) extends AnyVal {
    
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
    def setGetItems(value: () => Array): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    
    @scala.inline
    def setSetItems(value: /* items */ js.UndefOr[Array] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItems: Self = this.set("setItems", js.undefined)
  }
}
