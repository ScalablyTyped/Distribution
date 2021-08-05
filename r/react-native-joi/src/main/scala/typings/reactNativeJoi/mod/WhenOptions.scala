package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenOptions extends StObject {
  
  /**
    * the required condition joi type.
    */
  var is: SchemaLike
  
  /**
    * the alternative schema type if the condition is false. Required if then is missing
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}
object WhenOptions {
  
  inline def apply(): WhenOptions = {
    val __obj = js.Dynamic.literal(is = null)
    __obj.asInstanceOf[WhenOptions]
  }
  
  extension [Self <: WhenOptions](x: Self) {
    
    inline def setIs(value: SchemaLike): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsNull: Self = StObject.set(x, "is", null)
    
    inline def setOtherwise(value: SchemaLike): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    inline def setOtherwiseNull: Self = StObject.set(x, "otherwise", null)
    
    inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    inline def setThen(value: SchemaLike): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenNull: Self = StObject.set(x, "then", null)
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
