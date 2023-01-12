package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedTemplate extends StObject {
  
  /** If csp mode was used to parse, the map of expression string -> expression functions. */
  var e: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  
  /** If the template includes any partials, the map of partial name -> template nodes. */
  var p: js.UndefOr[StringDictionary[js.Array[Any]]] = js.undefined
  
  /** The array of template nodes. */
  var t: js.Array[Any]
  
  /** The version of the template spec that produced this template. */
  var v: Double
}
object ParsedTemplate {
  
  inline def apply(t: js.Array[Any], v: Double): ParsedTemplate = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedTemplate] (val x: Self) extends AnyVal {
    
    inline def setE(value: StringDictionary[js.Function]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setP(value: StringDictionary[js.Array[Any]]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setT(value: js.Array[Any]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTVarargs(value: Any*): Self = StObject.set(x, "t", js.Array(value*))
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
