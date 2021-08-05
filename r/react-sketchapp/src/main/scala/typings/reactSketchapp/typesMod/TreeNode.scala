package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNode extends StObject {
  
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  
  var layout: LayoutInfo
  
  var props: js.Any
  
  var style: ViewStyle
  
  var textStyle: TextStyle
  
  var `type`: String
}
object TreeNode {
  
  inline def apply(layout: LayoutInfo, props: js.Any, style: ViewStyle, textStyle: TextStyle, `type`: String): TreeNode = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
  
  extension [Self <: TreeNode](x: Self) {
    
    inline def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setLayout(value: LayoutInfo): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
