package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled[T] extends StObject {
  
  var disabled: Boolean
  
  var index: Double
  
  var row: T
  
  var size: typings.smallweiAvue.Size
  
  var `type`: String
}
object Disabled {
  
  inline def apply[T](disabled: Boolean, index: Double, row: T, size: typings.smallweiAvue.Size, `type`: String): Disabled[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disabled[?], T] (val x: Self & Disabled[T]) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
