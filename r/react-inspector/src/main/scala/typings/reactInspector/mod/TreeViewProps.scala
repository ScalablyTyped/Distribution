package typings.reactInspector.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewProps extends StObject {
  
  /**
    * Not required prop because we also allow undefined value.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * An integer specifying to which level the tree should be initially expanded.
    */
  var expandLevel: js.UndefOr[Double] = js.native
  
  /**
    * An array containing all the paths that should be expanded when the component is initialized, or a string of just one path.
    */
  var expandPaths: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Provide a custom nodeRenderer.
    */
  var nodeRenderer: js.UndefOr[InspectorNodeRenderer] = js.native
}
object TreeViewProps {
  
  @scala.inline
  def apply(): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewProps]
  }
  
  @scala.inline
  implicit class TreeViewPropsMutableBuilder[Self <: TreeViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExpandLevel(value: Double): Self = StObject.set(x, "expandLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandLevelUndefined: Self = StObject.set(x, "expandLevel", js.undefined)
    
    @scala.inline
    def setExpandPaths(value: String | js.Array[String]): Self = StObject.set(x, "expandPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandPathsUndefined: Self = StObject.set(x, "expandPaths", js.undefined)
    
    @scala.inline
    def setExpandPathsVarargs(value: String*): Self = StObject.set(x, "expandPaths", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodeRenderer(value: /* params */ InspectorNodeParams => ReactNode): Self = StObject.set(x, "nodeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNodeRendererUndefined: Self = StObject.set(x, "nodeRenderer", js.undefined)
  }
}
