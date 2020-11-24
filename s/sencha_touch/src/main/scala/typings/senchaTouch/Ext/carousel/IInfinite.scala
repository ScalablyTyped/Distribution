package typings.senchaTouch.Ext.carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInfinite extends ICarousel {
  
  /** [Method] Returns the value of innerItemConfig
    * @returns Object
    */
  var getInnerItemConfig: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of maxItemIndex
    * @returns Object
    */
  var getMaxItemIndex: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of indicator
    * @param indicator Object The new value.
    */
  @JSName("setIndicator")
  var setIndicator_IInfinite: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of innerItemConfig
    * @param innerItemConfig Object The new value.
    */
  var setInnerItemConfig: js.UndefOr[js.Function1[/* innerItemConfig */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of maxItemIndex
    * @param maxItemIndex Object The new value.
    */
  var setMaxItemIndex: js.UndefOr[js.Function1[/* maxItemIndex */ js.UndefOr[js.Any], Unit]] = js.native
}
object IInfinite {
  
  @scala.inline
  def apply(): IInfinite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInfinite]
  }
  
  @scala.inline
  implicit class IInfiniteOps[Self <: IInfinite] (val x: Self) extends AnyVal {
    
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
    def setGetInnerItemConfig(value: () => _): Self = this.set("getInnerItemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInnerItemConfig: Self = this.set("getInnerItemConfig", js.undefined)
    
    @scala.inline
    def setGetMaxItemIndex(value: () => _): Self = this.set("getMaxItemIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxItemIndex: Self = this.set("getMaxItemIndex", js.undefined)
    
    @scala.inline
    def setSetIndicator(value: /* indicator */ js.UndefOr[js.Any] => Unit): Self = this.set("setIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIndicator: Self = this.set("setIndicator", js.undefined)
    
    @scala.inline
    def setSetInnerItemConfig(value: /* innerItemConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setInnerItemConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInnerItemConfig: Self = this.set("setInnerItemConfig", js.undefined)
    
    @scala.inline
    def setSetMaxItemIndex(value: /* maxItemIndex */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxItemIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxItemIndex: Self = this.set("setMaxItemIndex", js.undefined)
  }
}
