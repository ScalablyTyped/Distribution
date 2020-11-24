package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.dataview.IDataView
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
  implicit class ILegendOps[Self <: ILegend] (val x: Self) extends AnyVal {
    
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
    def setGetDisableSelection(value: () => Boolean): Self = this.set("getDisableSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisableSelection: Self = this.set("getDisableSelection", js.undefined)
    
    @scala.inline
    def setGetHorizontalHeight(value: () => Double): Self = this.set("getHorizontalHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHorizontalHeight: Self = this.set("getHorizontalHeight", js.undefined)
    
    @scala.inline
    def setGetInline(value: () => Boolean): Self = this.set("getInline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInline: Self = this.set("getInline", js.undefined)
    
    @scala.inline
    def setGetItemTpl(value: () => Array): Self = this.set("getItemTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemTpl: Self = this.set("getItemTpl", js.undefined)
    
    @scala.inline
    def setGetPadding(value: () => Double): Self = this.set("getPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPadding: Self = this.set("getPadding", js.undefined)
    
    @scala.inline
    def setGetToggleable(value: () => Boolean): Self = this.set("getToggleable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetToggleable: Self = this.set("getToggleable", js.undefined)
    
    @scala.inline
    def setGetVerticalWidth(value: () => Double): Self = this.set("getVerticalWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVerticalWidth: Self = this.set("getVerticalWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSetDisableSelection(value: /* disableSelection */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisableSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisableSelection: Self = this.set("setDisableSelection", js.undefined)
    
    @scala.inline
    def setSetHorizontalHeight(value: /* horizontalHeight */ js.UndefOr[Double] => Unit): Self = this.set("setHorizontalHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHorizontalHeight: Self = this.set("setHorizontalHeight", js.undefined)
    
    @scala.inline
    def setSetInline(value: /* inline */ js.UndefOr[Boolean] => Unit): Self = this.set("setInline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInline: Self = this.set("setInline", js.undefined)
    
    @scala.inline
    def setSetItemTpl(value: /* itemTpl */ js.UndefOr[Array] => Unit): Self = this.set("setItemTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemTpl: Self = this.set("setItemTpl", js.undefined)
    
    @scala.inline
    def setSetPadding(value: /* padding */ js.UndefOr[Double] => Unit): Self = this.set("setPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPadding: Self = this.set("setPadding", js.undefined)
    
    @scala.inline
    def setSetToggleable(value: /* toggleable */ js.UndefOr[Boolean] => Unit): Self = this.set("setToggleable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetToggleable: Self = this.set("setToggleable", js.undefined)
    
    @scala.inline
    def setSetVerticalWidth(value: /* verticalWidth */ js.UndefOr[Double] => Unit): Self = this.set("setVerticalWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVerticalWidth: Self = this.set("setVerticalWidth", js.undefined)
    
    @scala.inline
    def setToggleable(value: Boolean): Self = this.set("toggleable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleable: Self = this.set("toggleable", js.undefined)
  }
}
