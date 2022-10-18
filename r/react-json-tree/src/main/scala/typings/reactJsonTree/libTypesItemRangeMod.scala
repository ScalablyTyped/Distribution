package typings.reactJsonTree

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBase16Styling.libTypesTypesMod.StylingFunction
import typings.reactJsonTree.anon.From
import typings.reactJsonTree.libTypesTypesMod.CircularPropsPassedThroughItemRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesItemRangeMod {
  
  @JSImport("react-json-tree/lib/types/ItemRange", JSImport.Default)
  @js.native
  open class default protected () extends ItemRange {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-json-tree/lib/types/ItemRange", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-tree/lib/types/ItemRange", "default.propTypes")
    @js.native
    def propTypes: From = js.native
    inline def propTypes_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ItemRange extends Component[Props, State, Any] {
    
    def handleClick(): Unit = js.native
  }
  
  trait Props
    extends StObject
       with CircularPropsPassedThroughItemRange {
    
    var data: Any
    
    var from: Double
    
    var nodeType: String
    
    def renderChildNodes(props: Props, from: Double, to: Double): ReactNode
    
    var to: Double
  }
  object Props {
    
    inline def apply(
      circularCache: js.Array[Any],
      collectionLimit: Double,
      data: Any,
      from: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      level: Double,
      nodeType: String,
      postprocessValue: Any => Any,
      renderChildNodes: (Props, Double, Double) => ReactNode,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      to: Double,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): Props = {
      val __obj = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), renderChildNodes = js.Any.fromFunction3(renderChildNodes), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setRenderChildNodes(value: (Props, Double, Double) => ReactNode): Self = StObject.set(x, "renderChildNodes", js.Any.fromFunction3(value))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
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
