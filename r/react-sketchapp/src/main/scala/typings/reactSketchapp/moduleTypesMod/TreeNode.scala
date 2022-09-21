package typings.reactSketchapp.moduleTypesMod

import typings.reactSketchapp.anon.TextNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNode[Props] extends StObject {
  
  var children: js.UndefOr[js.Array[TreeNode[Any] | String]] = js.undefined
  
  var layout: LayoutInfo
  
  var props: Props & TextNodes
  
  var style: ViewStyle
  
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  
  var `type`: String
}
object TreeNode {
  
  inline def apply[Props](layout: LayoutInfo, props: Props & TextNodes, style: ViewStyle, `type`: String): TreeNode[Props] = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode[Props]]
  }
  
  extension [Self <: TreeNode[?], Props](x: Self & TreeNode[Props]) {
    
    inline def setChildren(value: js.Array[TreeNode[Any] | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (TreeNode[Any] | String)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setLayout(value: LayoutInfo): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Props & TextNodes): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
