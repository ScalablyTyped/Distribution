package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.util.translatable.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITranslatableGroup extends IAbstract {
  
  /** [Method] Returns the value of activeIndex
    * @returns Number
    */
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of itemLength
    * @returns Object
    */
  var getItemLength: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of items
    * @returns Array
    */
  var getItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Sets the value of activeIndex
    * @param activeIndex Number The new value.
    */
  var setActiveIndex: js.UndefOr[js.Function1[/* activeIndex */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of itemLength
    * @param itemLength Object The new value.
    */
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of items
    * @param items Array The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.native
}
object ITranslatableGroup {
  
  @scala.inline
  def apply(): ITranslatableGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITranslatableGroup]
  }
  
  @scala.inline
  implicit class ITranslatableGroupOps[Self <: ITranslatableGroup] (val x: Self) extends AnyVal {
    
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
    def setGetActiveIndex(value: () => Double): Self = this.set("getActiveIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveIndex: Self = this.set("getActiveIndex", js.undefined)
    
    @scala.inline
    def setGetItemLength(value: () => _): Self = this.set("getItemLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemLength: Self = this.set("getItemLength", js.undefined)
    
    @scala.inline
    def setGetItems(value: () => Array): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    
    @scala.inline
    def setSetActiveIndex(value: /* activeIndex */ js.UndefOr[Double] => Unit): Self = this.set("setActiveIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveIndex: Self = this.set("setActiveIndex", js.undefined)
    
    @scala.inline
    def setSetItemLength(value: /* itemLength */ js.UndefOr[js.Any] => Unit): Self = this.set("setItemLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemLength: Self = this.set("setItemLength", js.undefined)
    
    @scala.inline
    def setSetItems(value: /* items */ js.UndefOr[Array] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItems: Self = this.set("setItems", js.undefined)
  }
}
