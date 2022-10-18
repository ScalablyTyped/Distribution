package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPickAlgorithm(value: (/* algo1 */ String, /* algo2 */ String) => String): Self = StObject.set(x, "pickAlgorithm", js.Any.fromFunction2(value))
    
    inline def setPickAlgorithmUndefined: Self = StObject.set(x, "pickAlgorithm", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
