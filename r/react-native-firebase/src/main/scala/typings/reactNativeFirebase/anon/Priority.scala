package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Priority extends StObject {
  
  @JSName(".priority")
  var Dotpriority: String | Double | Null
  
  @JSName(".value")
  var Dotvalue: Any
}
object Priority {
  
  inline def apply(Dotvalue: Any): Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    __obj.updateDynamic(".priority")(null)
    __obj.asInstanceOf[Priority]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
    
    inline def setDotpriority(value: String | Double): Self = StObject.set(x, ".priority", value.asInstanceOf[js.Any])
    
    inline def setDotpriorityNull: Self = StObject.set(x, ".priority", null)
    
    inline def setDotvalue(value: Any): Self = StObject.set(x, ".value", value.asInstanceOf[js.Any])
  }
}
