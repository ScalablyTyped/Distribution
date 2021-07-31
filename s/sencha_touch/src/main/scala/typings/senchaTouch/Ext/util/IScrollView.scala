package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IEvented
import typings.senchaTouch.Ext.scroll.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScrollView
  extends StObject
     with IEvented {
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  var getCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of indicators
    * @returns Object
    */
  var getIndicators: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of indicatorsHidingDelay
    * @returns Number
    */
  var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of indicatorsUi
    * @returns String
    */
  var getIndicatorsUi: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the scroller instance in this view
    * @returns Ext.scroll.View The scroller
    */
  var getScroller: js.UndefOr[js.Function0[IView]] = js.undefined
  
  /** [Config Option] (String) */
  var indicatorsUi: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of indicators
    * @param indicators Object The new value.
    */
  var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of indicatorsHidingDelay
    * @param indicatorsHidingDelay Number The new value.
    */
  var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of indicatorsUi
    * @param indicatorsUi String The new value.
    */
  var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of scroller
    * @param scroller Object The new value.
    */
  var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object IScrollView {
  
  @scala.inline
  def apply(): IScrollView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollView]
  }
  
  @scala.inline
  implicit class IScrollViewMutableBuilder[Self <: IScrollView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    @scala.inline
    def setGetElement(value: () => js.Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
    
    @scala.inline
    def setGetIndicators(value: () => js.Any): Self = StObject.set(x, "getIndicators", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndicatorsHidingDelay(value: () => Double): Self = StObject.set(x, "getIndicatorsHidingDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "getIndicatorsHidingDelay", js.undefined)
    
    @scala.inline
    def setGetIndicatorsUi(value: () => String): Self = StObject.set(x, "getIndicatorsUi", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndicatorsUiUndefined: Self = StObject.set(x, "getIndicatorsUi", js.undefined)
    
    @scala.inline
    def setGetIndicatorsUndefined: Self = StObject.set(x, "getIndicators", js.undefined)
    
    @scala.inline
    def setGetScroller(value: () => IView): Self = StObject.set(x, "getScroller", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollerUndefined: Self = StObject.set(x, "getScroller", js.undefined)
    
    @scala.inline
    def setIndicatorsUi(value: String): Self = StObject.set(x, "indicatorsUi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorsUiUndefined: Self = StObject.set(x, "indicatorsUi", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
    
    @scala.inline
    def setSetIndicators(value: /* indicators */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIndicators", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndicatorsHidingDelay(value: /* indicatorsHidingDelay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIndicatorsHidingDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "setIndicatorsHidingDelay", js.undefined)
    
    @scala.inline
    def setSetIndicatorsUi(value: /* indicatorsUi */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setIndicatorsUi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndicatorsUiUndefined: Self = StObject.set(x, "setIndicatorsUi", js.undefined)
    
    @scala.inline
    def setSetIndicatorsUndefined: Self = StObject.set(x, "setIndicators", js.undefined)
    
    @scala.inline
    def setSetScroller(value: /* scroller */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScroller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollerUndefined: Self = StObject.set(x, "setScroller", js.undefined)
  }
}
