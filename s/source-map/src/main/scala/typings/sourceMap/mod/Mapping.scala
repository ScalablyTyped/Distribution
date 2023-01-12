package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mapping extends StObject {
  
  var generated: Position
  
  var name: js.UndefOr[String] = js.undefined
  
  var original: Position
  
  var source: String
}
object Mapping {
  
  inline def apply(generated: Position, original: Position, source: String): Mapping = {
    val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mapping] (val x: Self) extends AnyVal {
    
    inline def setGenerated(value: Position): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginal(value: Position): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
