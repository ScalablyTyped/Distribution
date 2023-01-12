package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventRemove extends StObject {
  
  var preventRemove: Boolean
}
object PreventRemove {
  
  inline def apply(preventRemove: Boolean): PreventRemove = {
    val __obj = js.Dynamic.literal(preventRemove = preventRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventRemove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreventRemove] (val x: Self) extends AnyVal {
    
    inline def setPreventRemove(value: Boolean): Self = StObject.set(x, "preventRemove", value.asInstanceOf[js.Any])
  }
}
