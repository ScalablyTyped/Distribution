package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizemonitor {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of args
      * @returns Array
      */
    var getArgs: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of callback
      * @returns Object
      */
    var getCallback: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of scope
      * @returns Object
      */
    var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of args
      * @param args Array The new value.
      */
    var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of callback
      * @param callback Object The new value.
      */
    var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of scope
      * @param scope Object The new value.
      */
    var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      inline def setGetArgs(value: () => Array): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      inline def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
      
      inline def setGetCallback(value: () => Any): Self = StObject.set(x, "getCallback", js.Any.fromFunction0(value))
      
      inline def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
      
      inline def setGetElement(value: () => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetScope(value: () => Any): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
      
      inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
      
      inline def setSetArgs(value: /* args */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction1(value))
      
      inline def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
      
      inline def setSetCallback(value: /* callback */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
      
      inline def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
      
      inline def setSetElement(value: /* element */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
      
      inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
      
      inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
      
      inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    }
  }
  
  type IDefault = IAbstract
  
  type IOverflowChange = IAbstract
  
  type IScroll = IAbstract
}
