package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldPath extends StObject {
  
  @JSName("$name")
  var $name: String
}
object FieldPath {
  
  @scala.inline
  def apply($name: String): FieldPath = {
    val __obj = js.Dynamic.literal($name = $name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPath]
  }
  
  @scala.inline
  implicit class FieldPathMutableBuilder[Self <: FieldPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
  }
}
