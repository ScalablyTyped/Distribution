package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IAjax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRestProxy
  extends StObject
     with IAjax {
  
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of actionMethods
    * @returns Object
    */
  var getActionMethods: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of appendId
    * @returns Boolean
    */
  var getAppendId: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of format
    * @returns String
    */
  var getFormat: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Sets the value of actionMethods
    * @param actionMethods Object The new value.
    */
  var setActionMethods: js.UndefOr[js.Function1[/* actionMethods */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of appendId
    * @param appendId Boolean The new value.
    */
  var setAppendId: js.UndefOr[js.Function1[/* appendId */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of format
    * @param format String The new value.
    */
  var setFormat: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], Unit]] = js.undefined
}
object IRestProxy {
  
  inline def apply(): IRestProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestProxy]
  }
  
  extension [Self <: IRestProxy](x: Self) {
    
    inline def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
    
    inline def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGetActionMethods(value: () => js.Any): Self = StObject.set(x, "getActionMethods", js.Any.fromFunction0(value))
    
    inline def setGetActionMethodsUndefined: Self = StObject.set(x, "getActionMethods", js.undefined)
    
    inline def setGetAppendId(value: () => Boolean): Self = StObject.set(x, "getAppendId", js.Any.fromFunction0(value))
    
    inline def setGetAppendIdUndefined: Self = StObject.set(x, "getAppendId", js.undefined)
    
    inline def setGetFormat(value: () => String): Self = StObject.set(x, "getFormat", js.Any.fromFunction0(value))
    
    inline def setGetFormatUndefined: Self = StObject.set(x, "getFormat", js.undefined)
    
    inline def setSetActionMethods(value: /* actionMethods */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActionMethods", js.Any.fromFunction1(value))
    
    inline def setSetActionMethodsUndefined: Self = StObject.set(x, "setActionMethods", js.undefined)
    
    inline def setSetAppendId(value: /* appendId */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAppendId", js.Any.fromFunction1(value))
    
    inline def setSetAppendIdUndefined: Self = StObject.set(x, "setAppendId", js.undefined)
    
    inline def setSetFormat(value: /* format */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFormat", js.Any.fromFunction1(value))
    
    inline def setSetFormatUndefined: Self = StObject.set(x, "setFormat", js.undefined)
  }
}
