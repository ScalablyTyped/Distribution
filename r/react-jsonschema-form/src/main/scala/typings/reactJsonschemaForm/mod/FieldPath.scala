package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldPath extends StObject {
  
  @JSName("$name")
  var $name: String
}
object FieldPath {
  
  inline def apply($name: String): FieldPath = {
    val __obj = js.Dynamic.literal($name = $name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPath]
  }
  
  extension [Self <: FieldPath](x: Self) {
    
    inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
  }
}
