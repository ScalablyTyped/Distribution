package typings.reactJsonTree

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactBase16Styling.typesMod.StylingFunction
import typings.reactJsonTree.typesMod.JSONValueNodeCircularPropsProvidedByJSONNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonvaluenodeMod extends Shortcut {
  
  @JSImport("react-json-tree/lib/types/JSONValueNode", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  /**
    * Renders simple values (eg. strings, numbers, booleans, etc)
    */
  trait Props
    extends StObject
       with JSONValueNodeCircularPropsProvidedByJSONNode {
    
    var nodeType: String
    
    var value: Any
    
    var valueGetter: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
  }
  object Props {
    
    inline def apply(
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      nodeType: String,
      styling: StylingFunction,
      value: Any,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): Props = {
      val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), nodeType = nodeType.asInstanceOf[js.Any], styling = styling.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueGetter(value: /* value */ Any => Any): Self = StObject.set(x, "valueGetter", js.Any.fromFunction1(value))
      
      inline def setValueGetterUndefined: Self = StObject.set(x, "valueGetter", js.undefined)
    }
  }
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `jsonvaluenodeMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
