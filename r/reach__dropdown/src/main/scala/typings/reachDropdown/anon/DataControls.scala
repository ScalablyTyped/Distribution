package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataControls extends StObject {
  
  var data: Controls
  
  var props: Ariaatomic
}
object DataControls {
  
  inline def apply(data: Controls, props: Ariaatomic): DataControls = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataControls]
  }
  
  extension [Self <: DataControls](x: Self) {
    
    inline def setData(value: Controls): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Ariaatomic): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
