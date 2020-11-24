package typings.senchaTouch.Ext.draw.modifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighlight extends IModifier {
  
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] Filter modifier changes if overriding source attributes
    * @param attr Object The source attributes.
    * @param changes Object The modifier changes.
    * @returns * The filtered changes.
    */
  var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of enabled
    * @returns Boolean
    */
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of highlightStyle
    * @returns Object
    */
  var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Object) */
  var highlightStyle: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of enabled
    * @param enabled Boolean The new value.
    */
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of highlightStyle
    * @param highlightStyle Object The new value.
    */
  var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], Unit]] = js.native
}
object IHighlight {
  
  @scala.inline
  def apply(): IHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlight]
  }
  
  @scala.inline
  implicit class IHighlightOps[Self <: IHighlight] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFilterChanges(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _): Self = this.set("filterChanges", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterChanges: Self = this.set("filterChanges", js.undefined)
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("getEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnabled: Self = this.set("getEnabled", js.undefined)
    
    @scala.inline
    def setGetHighlightStyle(value: () => _): Self = this.set("getHighlightStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHighlightStyle: Self = this.set("getHighlightStyle", js.undefined)
    
    @scala.inline
    def setHighlightStyle(value: js.Any): Self = this.set("highlightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightStyle: Self = this.set("highlightStyle", js.undefined)
    
    @scala.inline
    def setSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnabled: Self = this.set("setEnabled", js.undefined)
    
    @scala.inline
    def setSetHighlightStyle(value: /* highlightStyle */ js.UndefOr[js.Any] => Unit): Self = this.set("setHighlightStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHighlightStyle: Self = this.set("setHighlightStyle", js.undefined)
  }
}
