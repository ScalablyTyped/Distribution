package typings.ssri.anon

import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmsOptions extends StObject {
  
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object AlgorithmsOptions {
  
  inline def apply(): AlgorithmsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmsOptions]
  }
  
  extension [Self <: AlgorithmsOptions](x: Self) {
    
    inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPromise(value: PromiseConstructorLike): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
