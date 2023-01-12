package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultIndex extends StObject {
  
  var defaultIndex: Double
  
  var `type`: String
}
object DefaultIndex {
  
  inline def apply(defaultIndex: Double, `type`: String): DefaultIndex = {
    val __obj = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultIndex] (val x: Self) extends AnyVal {
    
    inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
