package typings.reactInspector.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewProps extends StObject {
  
  /**
    * Not required prop because we also allow undefined value.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * An integer specifying to which level the tree should be initially expanded.
    */
  var expandLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * An array containing all the paths that should be expanded when the component is initialized, or a string of just one path.
    */
  var expandPaths: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Provide a custom nodeRenderer.
    */
  var nodeRenderer: js.UndefOr[InspectorNodeRenderer] = js.undefined
}
object TreeViewProps {
  
  inline def apply(): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewProps]
  }
  
  extension [Self <: TreeViewProps](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExpandLevel(value: Double): Self = StObject.set(x, "expandLevel", value.asInstanceOf[js.Any])
    
    inline def setExpandLevelUndefined: Self = StObject.set(x, "expandLevel", js.undefined)
    
    inline def setExpandPaths(value: String | js.Array[String]): Self = StObject.set(x, "expandPaths", value.asInstanceOf[js.Any])
    
    inline def setExpandPathsUndefined: Self = StObject.set(x, "expandPaths", js.undefined)
    
    inline def setExpandPathsVarargs(value: String*): Self = StObject.set(x, "expandPaths", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeRenderer(value: /* params */ InspectorNodeParams => ReactNode): Self = StObject.set(x, "nodeRenderer", js.Any.fromFunction1(value))
    
    inline def setNodeRendererUndefined: Self = StObject.set(x, "nodeRenderer", js.undefined)
  }
}
