package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var indices: js.Array[js.Array[Double]]
  
  var value: String
}
object Indices {
  
  @scala.inline
  def apply(indices: js.Array[js.Array[Double]], value: String): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit class IndicesMutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
