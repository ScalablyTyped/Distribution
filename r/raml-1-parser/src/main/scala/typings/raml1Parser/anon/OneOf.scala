package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOf extends StObject {
  
  var oneOf: js.Array[Conditions | ToChildren]
}
object OneOf {
  
  inline def apply(oneOf: js.Array[Conditions | ToChildren]): OneOf = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneOf] (val x: Self) extends AnyVal {
    
    inline def setOneOf(value: js.Array[Conditions | ToChildren]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfVarargs(value: (Conditions | ToChildren)*): Self = StObject.set(x, "oneOf", js.Array(value*))
  }
}
