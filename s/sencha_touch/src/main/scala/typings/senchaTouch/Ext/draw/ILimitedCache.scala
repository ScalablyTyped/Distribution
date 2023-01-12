package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILimitedCache
  extends StObject
     with IBase {
  
  /** [Method] Clear all the objects  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var feeder: js.UndefOr[Any] = js.undefined
  
  /** [Method] Get a cached object
    * @param id String
    * @param args Mixed... Arguments appended to feeder.
    * @returns Object
    */
  var get: js.UndefOr[js.Function2[/* id */ String, /* repeated */ Any, Any]] = js.undefined
  
  /** [Method] Returns the value of feeder
    * @returns Function
    */
  var getFeeder: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of limit
    * @returns Number
    */
  var getLimit: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of feeder
    * @param feeder Function The new value.
    * @returns Number
    */
  var setFeeder: js.UndefOr[js.Function1[/* feeder */ js.UndefOr[Any], Double]] = js.undefined
  
  /** [Method] Sets the value of limit
    * @param limit Number The new value.
    */
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
}
object ILimitedCache {
  
  inline def apply(): ILimitedCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILimitedCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILimitedCache] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setFeeder(value: Any): Self = StObject.set(x, "feeder", value.asInstanceOf[js.Any])
    
    inline def setFeederUndefined: Self = StObject.set(x, "feeder", js.undefined)
    
    inline def setGet(value: (/* id */ String, /* repeated */ Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetFeeder(value: () => Any): Self = StObject.set(x, "getFeeder", js.Any.fromFunction0(value))
    
    inline def setGetFeederUndefined: Self = StObject.set(x, "getFeeder", js.undefined)
    
    inline def setGetLimit(value: () => Double): Self = StObject.set(x, "getLimit", js.Any.fromFunction0(value))
    
    inline def setGetLimitUndefined: Self = StObject.set(x, "getLimit", js.undefined)
    
    inline def setGetScope(value: () => Any): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
    
    inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSetFeeder(value: /* feeder */ js.UndefOr[Any] => Double): Self = StObject.set(x, "setFeeder", js.Any.fromFunction1(value))
    
    inline def setSetFeederUndefined: Self = StObject.set(x, "setFeeder", js.undefined)
    
    inline def setSetLimit(value: /* limit */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLimit", js.Any.fromFunction1(value))
    
    inline def setSetLimitUndefined: Self = StObject.set(x, "setLimit", js.undefined)
    
    inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
    
    inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
  }
}
