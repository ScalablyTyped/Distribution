package typings.reactTestRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactTestRenderer.reactTestRendererStrings.component
import typings.reactTestRenderer.reactTestRendererStrings.host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTestRendererTree extends ReactTestRendererJSON {
  
  var instance: js.Any = js.native
  
  var nodeType: component | host = js.native
  
  var rendered: Null | ReactTestRendererTree | js.Array[ReactTestRendererTree] = js.native
}
object ReactTestRendererTree {
  
  @scala.inline
  def apply(instance: js.Any, nodeType: component | host, props: StringDictionary[js.Any], `type`: String): ReactTestRendererTree = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestRendererTree]
  }
  
  @scala.inline
  implicit class ReactTestRendererTreeOps[Self <: ReactTestRendererTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: component | host): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedVarargs(value: ReactTestRendererTree*): Self = this.set("rendered", js.Array(value :_*))
    
    @scala.inline
    def setRendered(value: ReactTestRendererTree | js.Array[ReactTestRendererTree]): Self = this.set("rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedNull: Self = this.set("rendered", null)
  }
}
