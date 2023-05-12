package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prop extends StObject {
  
  var label: String
  
  var prop: String
}
object Prop {
  
  inline def apply(label: String, prop: String): Prop = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prop] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
  }
}
