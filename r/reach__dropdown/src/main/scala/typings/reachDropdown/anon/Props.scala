package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  var data: ActiveDescendant
  
  var props: AccessKey
}
object Props {
  
  inline def apply(data: ActiveDescendant, props: AccessKey): Props = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  extension [Self <: Props](x: Self) {
    
    inline def setData(value: ActiveDescendant): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setProps(value: AccessKey): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
