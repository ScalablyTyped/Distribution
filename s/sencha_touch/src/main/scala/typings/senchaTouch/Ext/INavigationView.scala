package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavigationView extends IContainer {
  
  /** [Config Option] (String) */
  var defaultBackButtonText: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of defaultBackButtonText
    * @returns String
    */
  var getDefaultBackButtonText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of navigationBar
    * @returns Boolean/Object
    */
  var getNavigationBar: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the previous item if one exists
    * @returns Mixed The previous view
    */
  var getPreviousItem: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of useTitleForBackButtonText
    * @returns Boolean
    */
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[js.Any] = js.native
  
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
    * @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
    * @returns Ext.Component The new active item
    */
  var pop: js.UndefOr[js.Function1[/* count */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
    * @param view Object The view to push.
    * @returns Ext.Component The new item you just pushed.
    */
  var push: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Method] Resets the view by removing all items between the first and last item
    * @returns Ext.Component The view that is now active
    */
  var reset: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Sets the value of defaultBackButtonText
    * @param defaultBackButtonText String The new value.
    */
  var setDefaultBackButtonText: js.UndefOr[js.Function1[/* defaultBackButtonText */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of navigationBar
    * @param navigationBar Boolean/Object The new value.
    */
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of useTitleForBackButtonText
    * @param useTitleForBackButtonText Boolean The new value.
    */
  var setUseTitleForBackButtonText: js.UndefOr[js.Function1[/* useTitleForBackButtonText */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[Boolean] = js.native
}
object INavigationView {
  
  @scala.inline
  def apply(): INavigationView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationView]
  }
  
  @scala.inline
  implicit class INavigationViewMutableBuilder[Self <: INavigationView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBackButtonText(value: java.lang.String): Self = StObject.set(x, "defaultBackButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBackButtonTextUndefined: Self = StObject.set(x, "defaultBackButtonText", js.undefined)
    
    @scala.inline
    def setGetDefaultBackButtonText(value: () => java.lang.String): Self = StObject.set(x, "getDefaultBackButtonText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultBackButtonTextUndefined: Self = StObject.set(x, "getDefaultBackButtonText", js.undefined)
    
    @scala.inline
    def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    @scala.inline
    def setGetNavigationBar(value: () => _): Self = StObject.set(x, "getNavigationBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigationBarUndefined: Self = StObject.set(x, "getNavigationBar", js.undefined)
    
    @scala.inline
    def setGetPreviousItem(value: () => _): Self = StObject.set(x, "getPreviousItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousItemUndefined: Self = StObject.set(x, "getPreviousItem", js.undefined)
    
    @scala.inline
    def setGetUseTitleForBackButtonText(value: () => Boolean): Self = StObject.set(x, "getUseTitleForBackButtonText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseTitleForBackButtonTextUndefined: Self = StObject.set(x, "getUseTitleForBackButtonText", js.undefined)
    
    @scala.inline
    def setNavigationBar(value: js.Any): Self = StObject.set(x, "navigationBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationBarUndefined: Self = StObject.set(x, "navigationBar", js.undefined)
    
    @scala.inline
    def setPop(value: /* count */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    @scala.inline
    def setPush(value: /* view */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setReset(value: () => IComponent): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSetDefaultBackButtonText(value: /* defaultBackButtonText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDefaultBackButtonText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultBackButtonTextUndefined: Self = StObject.set(x, "setDefaultBackButtonText", js.undefined)
    
    @scala.inline
    def setSetNavigationBar(value: /* navigationBar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setNavigationBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigationBarUndefined: Self = StObject.set(x, "setNavigationBar", js.undefined)
    
    @scala.inline
    def setSetUseTitleForBackButtonText(value: /* useTitleForBackButtonText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseTitleForBackButtonText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseTitleForBackButtonTextUndefined: Self = StObject.set(x, "setUseTitleForBackButtonText", js.undefined)
    
    @scala.inline
    def setUseTitleForBackButtonText(value: Boolean): Self = StObject.set(x, "useTitleForBackButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTitleForBackButtonTextUndefined: Self = StObject.set(x, "useTitleForBackButtonText", js.undefined)
  }
}
