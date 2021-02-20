package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mapping extends StObject {
  
  var generated: Position = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var original: Position = js.native
  
  var source: String = js.native
}
object Mapping {
  
  @scala.inline
  def apply(generated: Position, original: Position, source: String): Mapping = {
    val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  
  @scala.inline
  implicit class MappingMutableBuilder[Self <: Mapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerated(value: Position): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginal(value: Position): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
