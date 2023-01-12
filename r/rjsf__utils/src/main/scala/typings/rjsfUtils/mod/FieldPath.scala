package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Type describing a name used for a field in the `PathSchema` */
trait FieldPath extends StObject {
  
  /** The name of a field */
  @JSName("$name")
  var $name: String
}
object FieldPath {
  
  inline def apply($name: String): FieldPath = {
    val __obj = js.Dynamic.literal($name = $name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldPath] (val x: Self) extends AnyVal {
    
    inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
  }
}
