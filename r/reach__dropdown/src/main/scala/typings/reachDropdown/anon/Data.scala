package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: Disabled
  
  var props: About
}
object Data {
  
  inline def apply(data: Disabled, props: About): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: Disabled): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setProps(value: About): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
