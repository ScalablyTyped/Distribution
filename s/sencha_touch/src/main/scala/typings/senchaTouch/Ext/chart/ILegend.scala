package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.dataview.IDataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILegend extends IDataView {
  
  /** [Method] Returns the value of disableSelection
    * @returns Boolean
    */
  @JSName("getDisableSelection")
  var getDisableSelection_ILegend: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of horizontalHeight
    * @returns Number
    */
  var getHorizontalHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of inline
    * @returns Boolean
    */
  @JSName("getInline")
  var getInline_ILegend: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of itemTpl
    * @returns Array
    */
  @JSName("getItemTpl")
  var getItemTpl_ILegend: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of padding
    * @returns Number
    */
  @JSName("getPadding")
  var getPadding_ILegend: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of toggleable
    * @returns Boolean
    */
  var getToggleable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of verticalWidth
    * @returns Number
    */
  var getVerticalWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of disableSelection
    * @param disableSelection Boolean The new value.
    */
  @JSName("setDisableSelection")
  var setDisableSelection_ILegend: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of horizontalHeight
    * @param horizontalHeight Number The new value.
    */
  var setHorizontalHeight: js.UndefOr[js.Function1[/* horizontalHeight */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of inline
    * @param inline Boolean The new value.
    */
  @JSName("setInline")
  var setInline_ILegend: js.UndefOr[js.Function1[/* inline */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of itemTpl
    * @param itemTpl Array The new value.
    */
  @JSName("setItemTpl")
  var setItemTpl_ILegend: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of padding
    * @param padding Number The new value.
    */
  @JSName("setPadding")
  var setPadding_ILegend: js.UndefOr[js.Function1[/* padding */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of toggleable
    * @param toggleable Boolean The new value.
    */
  var setToggleable: js.UndefOr[js.Function1[/* toggleable */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of verticalWidth
    * @param verticalWidth Number The new value.
    */
  var setVerticalWidth: js.UndefOr[js.Function1[/* verticalWidth */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var toggleable: js.UndefOr[Boolean] = js.native
}
object ILegend {
  
  @scala.inline
  def apply(): ILegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegend]
  }
  
  @scala.inline
  implicit class ILegendMutableBuilder[Self <: ILegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisableSelection(value: () => Boolean): Self = StObject.set(x, "getDisableSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisableSelectionUndefined: Self = StObject.set(x, "getDisableSelection", js.undefined)
    
    @scala.inline
    def setGetHorizontalHeight(value: () => Double): Self = StObject.set(x, "getHorizontalHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHorizontalHeightUndefined: Self = StObject.set(x, "getHorizontalHeight", js.undefined)
    
    @scala.inline
    def setGetInline(value: () => Boolean): Self = StObject.set(x, "getInline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInlineUndefined: Self = StObject.set(x, "getInline", js.undefined)
    
    @scala.inline
    def setGetItemTpl(value: () => Array): Self = StObject.set(x, "getItemTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemTplUndefined: Self = StObject.set(x, "getItemTpl", js.undefined)
    
    @scala.inline
    def setGetPadding(value: () => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
    
    @scala.inline
    def setGetToggleable(value: () => Boolean): Self = StObject.set(x, "getToggleable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetToggleableUndefined: Self = StObject.set(x, "getToggleable", js.undefined)
    
    @scala.inline
    def setGetVerticalWidth(value: () => Double): Self = StObject.set(x, "getVerticalWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVerticalWidthUndefined: Self = StObject.set(x, "getVerticalWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSetDisableSelection(value: /* disableSelection */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisableSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisableSelectionUndefined: Self = StObject.set(x, "setDisableSelection", js.undefined)
    
    @scala.inline
    def setSetHorizontalHeight(value: /* horizontalHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setHorizontalHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHorizontalHeightUndefined: Self = StObject.set(x, "setHorizontalHeight", js.undefined)
    
    @scala.inline
    def setSetInline(value: /* inline */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setInline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInlineUndefined: Self = StObject.set(x, "setInline", js.undefined)
    
    @scala.inline
    def setSetItemTpl(value: /* itemTpl */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setItemTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemTplUndefined: Self = StObject.set(x, "setItemTpl", js.undefined)
    
    @scala.inline
    def setSetPadding(value: /* padding */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPaddingUndefined: Self = StObject.set(x, "setPadding", js.undefined)
    
    @scala.inline
    def setSetToggleable(value: /* toggleable */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setToggleable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetToggleableUndefined: Self = StObject.set(x, "setToggleable", js.undefined)
    
    @scala.inline
    def setSetVerticalWidth(value: /* verticalWidth */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setVerticalWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticalWidthUndefined: Self = StObject.set(x, "setVerticalWidth", js.undefined)
    
    @scala.inline
    def setToggleable(value: Boolean): Self = StObject.set(x, "toggleable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleableUndefined: Self = StObject.set(x, "toggleable", js.undefined)
  }
}
