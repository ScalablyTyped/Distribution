package typings.select2.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select2RequireConfig extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var config: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  
  var map: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.undefined
}
object Select2RequireConfig {
  
  inline def apply(): Select2RequireConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select2RequireConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Select2RequireConfig] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* repeated */ Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setConfig(value: StringDictionary[js.Object]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setMap(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
