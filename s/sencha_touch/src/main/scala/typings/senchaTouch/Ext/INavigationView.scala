package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INavigationView
  extends StObject
     with IContainer {
  
  /** [Config Option] (String) */
  var defaultBackButtonText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of defaultBackButtonText
    * @returns String
    */
  var getDefaultBackButtonText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of navigationBar
    * @returns Boolean/Object
    */
  var getNavigationBar: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the previous item if one exists
    * @returns Mixed The previous view
    */
  var getPreviousItem: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of useTitleForBackButtonText
    * @returns Boolean
    */
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[Any] = js.undefined
  
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
    * @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
    * @returns Ext.Component The new active item
    */
  var pop: js.UndefOr[js.Function1[/* count */ js.UndefOr[Any], IComponent]] = js.undefined
  
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
    * @param view Object The view to push.
    * @returns Ext.Component The new item you just pushed.
    */
  var push: js.UndefOr[js.Function1[/* view */ js.UndefOr[Any], IComponent]] = js.undefined
  
  /** [Method] Resets the view by removing all items between the first and last item
    * @returns Ext.Component The view that is now active
    */
  var reset: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the value of defaultBackButtonText
    * @param defaultBackButtonText String The new value.
    */
  var setDefaultBackButtonText: js.UndefOr[js.Function1[/* defaultBackButtonText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of navigationBar
    * @param navigationBar Boolean/Object The new value.
    */
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of useTitleForBackButtonText
    * @param useTitleForBackButtonText Boolean The new value.
    */
  var setUseTitleForBackButtonText: js.UndefOr[js.Function1[/* useTitleForBackButtonText */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[Boolean] = js.undefined
}
object INavigationView {
  
  inline def apply(): INavigationView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationView]
  }
  
  extension [Self <: INavigationView](x: Self) {
    
    inline def setDefaultBackButtonText(value: java.lang.String): Self = StObject.set(x, "defaultBackButtonText", value.asInstanceOf[js.Any])
    
    inline def setDefaultBackButtonTextUndefined: Self = StObject.set(x, "defaultBackButtonText", js.undefined)
    
    inline def setGetDefaultBackButtonText(value: () => java.lang.String): Self = StObject.set(x, "getDefaultBackButtonText", js.Any.fromFunction0(value))
    
    inline def setGetDefaultBackButtonTextUndefined: Self = StObject.set(x, "getDefaultBackButtonText", js.undefined)
    
    inline def setGetLayout(value: () => Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    inline def setGetNavigationBar(value: () => Any): Self = StObject.set(x, "getNavigationBar", js.Any.fromFunction0(value))
    
    inline def setGetNavigationBarUndefined: Self = StObject.set(x, "getNavigationBar", js.undefined)
    
    inline def setGetPreviousItem(value: () => Any): Self = StObject.set(x, "getPreviousItem", js.Any.fromFunction0(value))
    
    inline def setGetPreviousItemUndefined: Self = StObject.set(x, "getPreviousItem", js.undefined)
    
    inline def setGetUseTitleForBackButtonText(value: () => Boolean): Self = StObject.set(x, "getUseTitleForBackButtonText", js.Any.fromFunction0(value))
    
    inline def setGetUseTitleForBackButtonTextUndefined: Self = StObject.set(x, "getUseTitleForBackButtonText", js.undefined)
    
    inline def setNavigationBar(value: Any): Self = StObject.set(x, "navigationBar", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarUndefined: Self = StObject.set(x, "navigationBar", js.undefined)
    
    inline def setPop(value: /* count */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setPush(value: /* view */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setReset(value: () => IComponent): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetDefaultBackButtonText(value: /* defaultBackButtonText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDefaultBackButtonText", js.Any.fromFunction1(value))
    
    inline def setSetDefaultBackButtonTextUndefined: Self = StObject.set(x, "setDefaultBackButtonText", js.undefined)
    
    inline def setSetNavigationBar(value: /* navigationBar */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setNavigationBar", js.Any.fromFunction1(value))
    
    inline def setSetNavigationBarUndefined: Self = StObject.set(x, "setNavigationBar", js.undefined)
    
    inline def setSetUseTitleForBackButtonText(value: /* useTitleForBackButtonText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseTitleForBackButtonText", js.Any.fromFunction1(value))
    
    inline def setSetUseTitleForBackButtonTextUndefined: Self = StObject.set(x, "setUseTitleForBackButtonText", js.undefined)
    
    inline def setUseTitleForBackButtonText(value: Boolean): Self = StObject.set(x, "useTitleForBackButtonText", value.asInstanceOf[js.Any])
    
    inline def setUseTitleForBackButtonTextUndefined: Self = StObject.set(x, "useTitleForBackButtonText", js.undefined)
  }
}
