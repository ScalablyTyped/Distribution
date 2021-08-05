package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var indices: js.Array[js.Array[Double]]
  
  var value: String
}
object Indices {
  
  inline def apply(indices: js.Array[js.Array[Double]], value: String): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  extension [Self <: Indices](x: Self) {
    
    inline def setIndices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
