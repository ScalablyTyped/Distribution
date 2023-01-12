package typings.rbx.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsElementType extends StObject {
  
  var as: ElementType[Any]
}
object AsElementType {
  
  inline def apply(as: ElementType[Any]): AsElementType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsElementType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsElementType] (val x: Self) extends AnyVal {
    
    inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
