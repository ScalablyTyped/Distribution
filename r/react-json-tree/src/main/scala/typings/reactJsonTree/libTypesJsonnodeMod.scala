package typings.reactJsonTree

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactBase16Styling.libTypesTypesMod.StylingFunction
import typings.reactJsonTree.libTypesTypesMod.CircularPropsPassedThroughJSONNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesJsonnodeMod extends Shortcut {
  
  @JSImport("react-json-tree/lib/types/JSONNode", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  trait Props
    extends StObject
       with CircularPropsPassedThroughJSONNode {
    
    var value: Any
  }
  object Props {
    
    inline def apply(
      collectionLimit: Double,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      value: Any,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): Props = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libTypesJsonnodeMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
