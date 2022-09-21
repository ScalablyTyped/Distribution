package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIsExpanded extends StObject {
  
  var data: IsExpanded
  
  var props: Ariaatomic
}
object DataIsExpanded {
  
  inline def apply(data: IsExpanded, props: Ariaatomic): DataIsExpanded = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIsExpanded]
  }
  
  extension [Self <: DataIsExpanded](x: Self) {
    
    inline def setData(value: IsExpanded): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Ariaatomic): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
