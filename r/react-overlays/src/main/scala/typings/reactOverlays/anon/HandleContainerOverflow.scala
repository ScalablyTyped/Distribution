package typings.reactOverlays.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleContainerOverflow extends StObject {
  
  var handleContainerOverflow: js.UndefOr[Boolean] = js.undefined
  
  var hideSiblingNodes: js.UndefOr[Boolean] = js.undefined
}
object HandleContainerOverflow {
  
  inline def apply(): HandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleContainerOverflow]
  }
  
  extension [Self <: HandleContainerOverflow](x: Self) {
    
    inline def setHandleContainerOverflow(value: Boolean): Self = StObject.set(x, "handleContainerOverflow", value.asInstanceOf[js.Any])
    
    inline def setHandleContainerOverflowUndefined: Self = StObject.set(x, "handleContainerOverflow", js.undefined)
    
    inline def setHideSiblingNodes(value: Boolean): Self = StObject.set(x, "hideSiblingNodes", value.asInstanceOf[js.Any])
    
    inline def setHideSiblingNodesUndefined: Self = StObject.set(x, "hideSiblingNodes", js.undefined)
  }
}
