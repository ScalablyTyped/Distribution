package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneProps extends StObject {
  
  var maxSize: Double | String
  
  var minSize: Double | String
  
  var size: Double | String
}
object PaneProps {
  
  inline def apply(maxSize: Double | String, minSize: Double | String, size: Double | String): PaneProps = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneProps]
  }
  
  extension [Self <: PaneProps](x: Self) {
    
    inline def setMaxSize(value: Double | String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: Double | String): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
