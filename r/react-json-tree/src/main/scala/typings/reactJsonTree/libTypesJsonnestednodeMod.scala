package typings.reactJsonTree

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBase16Styling.libTypesTypesMod.StylingFunction
import typings.reactJsonTree.anon.CircularCache
import typings.reactJsonTree.anon.CollectionLimit
import typings.reactJsonTree.libTypesTypesMod.CircularPropsPassedThroughJSONNestedNode
import typings.reactJsonTree.libTypesTypesMod.CircularPropsPassedThroughRenderChildNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesJsonnestednodeMod {
  
  @JSImport("react-json-tree/lib/types/JSONNestedNode", JSImport.Default)
  @js.native
  open class default protected () extends JSONNestedNode {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-json-tree/lib/types/JSONNestedNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-tree/lib/types/JSONNestedNode", "default.defaultProps")
    @js.native
    def defaultProps: CircularCache = js.native
    inline def defaultProps_=(x: CircularCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-tree/lib/types/JSONNestedNode", "default.propTypes")
    @js.native
    def propTypes: CollectionLimit = js.native
    inline def propTypes_=(x: CollectionLimit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait JSONNestedNode extends Component[Props, State, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MJSONNestedNode(nextProps: Props): Unit = js.native
    
    def handleClick(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MJSONNestedNode(nextProps: Props, nextState: State): Boolean = js.native
  }
  
  trait Props
    extends StObject
       with CircularPropsPassedThroughJSONNestedNode {
    
    def createItemString(data: Any, collectionLimit: Double): String
    
    var data: Any
    
    var expandable: Boolean
    
    var nodeType: String
    
    var nodeTypeIndicator: String
  }
  object Props {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      createItemString: (Any, Double) => String,
      data: Any,
      expandable: Boolean,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      level: Double,
      nodeType: String,
      nodeTypeIndicator: String,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): Props = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], createItemString = js.Any.fromFunction2(createItemString), data = data.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeTypeIndicator = nodeTypeIndicator.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCreateItemString(value: (Any, Double) => String): Self = StObject.set(x, "createItemString", js.Any.fromFunction2(value))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeIndicator(value: String): Self = StObject.set(x, "nodeTypeIndicator", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderChildNodesProps
    extends StObject
       with CircularPropsPassedThroughRenderChildNodes {
    
    var data: Any
    
    var nodeType: String
  }
  object RenderChildNodesProps {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      data: Any,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      level: Double,
      nodeType: String,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): RenderChildNodesProps = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[RenderChildNodesProps]
    }
    
    extension [Self <: RenderChildNodesProps](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var expanded: Boolean
  }
  object State {
    
    inline def apply(expanded: Boolean): State = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    }
  }
}
