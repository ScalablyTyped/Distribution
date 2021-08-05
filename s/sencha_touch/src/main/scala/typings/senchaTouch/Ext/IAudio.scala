package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAudio
  extends StObject
     with IMedia {
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IAudio: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IAudio: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}
object IAudio {
  
  inline def apply(): IAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAudio]
  }
  
  extension [Self <: IAudio](x: Self) {
    
    inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
  }
}
