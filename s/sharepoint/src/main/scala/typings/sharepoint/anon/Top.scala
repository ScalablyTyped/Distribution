package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var left: Any
  
  var top: Any
}
object Top {
  
  inline def apply(left: Any, top: Any): Top = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
