package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorNodeParams extends StObject {
  
  var data: js.Any = js.native
  
  var depth: Double = js.native
  
  var expanded: Boolean = js.native
  
  var isNonenumerable: Boolean = js.native
  
  var name: String = js.native
}
object InspectorNodeParams {
  
  @scala.inline
  def apply(data: js.Any, depth: Double, expanded: Boolean, isNonenumerable: Boolean, name: String): InspectorNodeParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isNonenumerable = isNonenumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorNodeParams]
  }
  
  @scala.inline
  implicit class InspectorNodeParamsMutableBuilder[Self <: InspectorNodeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNonenumerable(value: Boolean): Self = StObject.set(x, "isNonenumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
