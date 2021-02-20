package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeNode extends StObject {
  
  var children: js.UndefOr[js.Array[TreeNode]] = js.native
  
  var layout: LayoutInfo = js.native
  
  var props: js.Any = js.native
  
  var style: ViewStyle = js.native
  
  var textStyle: TextStyle = js.native
  
  var `type`: String = js.native
}
object TreeNode {
  
  @scala.inline
  def apply(layout: LayoutInfo, props: js.Any, style: ViewStyle, textStyle: TextStyle, `type`: String): TreeNode = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
  
  @scala.inline
  implicit class TreeNodeMutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: LayoutInfo): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
