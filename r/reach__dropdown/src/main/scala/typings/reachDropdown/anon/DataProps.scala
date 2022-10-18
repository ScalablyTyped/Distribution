package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProps extends StObject {
  
  var data: IsExpanded
  
  var props: Ariaactivedescendant
}
object DataProps {
  
  inline def apply(data: IsExpanded, props: Ariaactivedescendant): DataProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProps]
  }
  
  extension [Self <: DataProps](x: Self) {
    
    inline def setData(value: IsExpanded): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Ariaactivedescendant): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
