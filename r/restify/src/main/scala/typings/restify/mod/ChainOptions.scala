package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainOptions extends StObject {
  
  var onceNext: js.UndefOr[Boolean] = js.undefined
  
  var strictNext: js.UndefOr[Boolean] = js.undefined
}
object ChainOptions {
  
  inline def apply(): ChainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainOptions]
  }
  
  extension [Self <: ChainOptions](x: Self) {
    
    inline def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    inline def setOnceNextUndefined: Self = StObject.set(x, "onceNext", js.undefined)
    
    inline def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
    
    inline def setStrictNextUndefined: Self = StObject.set(x, "strictNext", js.undefined)
  }
}
