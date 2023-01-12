package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.number
import typings.sinclairTypebox.sinclairTypeboxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TEnumOption[T] extends StObject {
  
  var const: T
  
  var `type`: number | string
}
object TEnumOption {
  
  inline def apply[T](const: T, `type`: number | string): TEnumOption[T] = {
    val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TEnumOption[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TEnumOption[?], T] (val x: Self & TEnumOption[T]) extends AnyVal {
    
    inline def setConst(value: T): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setType(value: number | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
