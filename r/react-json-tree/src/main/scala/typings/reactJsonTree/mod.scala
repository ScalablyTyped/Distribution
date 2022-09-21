package typings.reactJsonTree

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBase16Styling.typesMod.StylingFunction
import typings.reactBase16Styling.typesMod.Theme
import typings.reactJsonTree.anon.Data
import typings.reactJsonTree.anon.GetItemString
import typings.reactJsonTree.typesMod.CircularPropsPassedThroughJSONTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-tree", "JSONTree")
  @js.native
  open class JSONTree protected () extends Component[Props, State, Any] {
    def this(props: Props) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MJSONTree(nextProps: Props): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MJSONTree(nextProps: Props): Boolean = js.native
  }
  /* static members */
  object JSONTree {
    
    @JSImport("react-json-tree", "JSONTree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-json-tree", "JSONTree.defaultProps")
    @js.native
    def defaultProps: GetItemString = js.native
    inline def defaultProps_=(x: GetItemString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-json-tree", "JSONTree.propTypes")
    @js.native
    def propTypes: Data = js.native
    inline def propTypes_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait Props
    extends StObject
       with CircularPropsPassedThroughJSONTree {
    
    var data: Any
    
    var invertTheme: Boolean
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply(
      collectionLimit: Double,
      data: Any,
      getItemString: (String, Any, ReactNode, String, js.Array[String | Double]) => ReactNode,
      hideRoot: Boolean,
      invertTheme: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => ReactNode,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => ReactNode
    ): Props = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], invertTheme = invertTheme.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInvertTheme(value: Boolean): Self = StObject.set(x, "invertTheme", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var styling: StylingFunction
  }
  object State {
    
    inline def apply(styling: StylingFunction): State = {
      val __obj = js.Dynamic.literal(styling = styling.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setStyling(value: StylingFunction): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
    }
  }
}
