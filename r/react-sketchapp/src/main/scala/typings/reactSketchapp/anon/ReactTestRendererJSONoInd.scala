package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactTestRenderer.mod.ReactTestRendererNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-test-renderer.react-test-renderer.ReactTestRendererJSON & {  oIndex :number} */
trait ReactTestRendererJSONoInd extends StObject {
  
  var children: Null | js.Array[ReactTestRendererNode]
  
  var oIndex: Double
  
  var props: StringDictionary[Any]
  
  var `type`: String
}
object ReactTestRendererJSONoInd {
  
  inline def apply(oIndex: Double, props: StringDictionary[Any], `type`: String): ReactTestRendererJSONoInd = {
    val __obj = js.Dynamic.literal(oIndex = oIndex.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestRendererJSONoInd]
  }
  
  extension [Self <: ReactTestRendererJSONoInd](x: Self) {
    
    inline def setChildren(value: js.Array[ReactTestRendererNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: ReactTestRendererNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setOIndex(value: Double): Self = StObject.set(x, "oIndex", value.asInstanceOf[js.Any])
    
    inline def setProps(value: StringDictionary[Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
