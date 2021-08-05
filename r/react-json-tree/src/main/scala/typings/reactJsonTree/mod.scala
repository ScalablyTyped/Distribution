package typings.reactJsonTree

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-tree", JSImport.Default)
  @js.native
  class default ()
    extends Component[JSONTreeProps, js.Object, js.Any]
  
  @js.native
  trait JSONTreeComponent
    extends Component[JSONTreeProps, js.Object, js.Any]
  
  trait JSONTreeProps
    extends StObject
       with Props[JSONTreeComponent] {
    
    var collectionLimit: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[js.Any] | js.Object
    
    var getItemString: js.UndefOr[
        js.Function4[
          /* type */ String, 
          /* data */ js.Array[js.Any] | js.Object, 
          /* itemType */ String, 
          /* itemString */ String, 
          Element
        ]
      ] = js.undefined
    
    var hideRoot: js.UndefOr[Boolean] = js.undefined
    
    var invertTheme: js.UndefOr[Boolean] = js.undefined
    
    var isCustomNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var keyPath: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var labelRenderer: js.UndefOr[
        js.Function4[
          /* keyPath */ js.Array[String], 
          /* nodeType */ js.UndefOr[String], 
          /* expanded */ js.UndefOr[Boolean], 
          /* expandable */ js.UndefOr[Boolean], 
          Element
        ]
      ] = js.undefined
    
    var postprocessValue: js.UndefOr[js.Function1[/* raw */ String, Element]] = js.undefined
    
    var shouldExpandNode: js.UndefOr[
        js.Function3[
          /* keyPath */ js.Array[String | Double], 
          /* data */ js.Array[js.Any] | js.Object, 
          /* level */ Double, 
          Boolean
        ]
      ] = js.undefined
    
    var sortObjectKeys: js.UndefOr[js.Function | Boolean] = js.undefined
    
    var theme: js.UndefOr[js.Object | String] = js.undefined
    
    var valueRenderer: js.UndefOr[
        js.Function3[
          /* displayValue */ String | Double, 
          /* rawValue */ js.UndefOr[String | Double | Boolean | Null], 
          /* repeated */ String | Double, 
          Element
        ]
      ] = js.undefined
  }
  object JSONTreeProps {
    
    inline def apply(data: js.Array[js.Any] | js.Object): JSONTreeProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONTreeProps]
    }
    
    extension [Self <: JSONTreeProps](x: Self) {
      
      inline def setCollectionLimit(value: Double): Self = StObject.set(x, "collectionLimit", value.asInstanceOf[js.Any])
      
      inline def setCollectionLimitUndefined: Self = StObject.set(x, "collectionLimit", js.undefined)
      
      inline def setData(value: js.Array[js.Any] | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setGetItemString(
        value: (/* type */ String, /* data */ js.Array[js.Any] | js.Object, /* itemType */ String, /* itemString */ String) => Element
      ): Self = StObject.set(x, "getItemString", js.Any.fromFunction4(value))
      
      inline def setGetItemStringUndefined: Self = StObject.set(x, "getItemString", js.undefined)
      
      inline def setHideRoot(value: Boolean): Self = StObject.set(x, "hideRoot", value.asInstanceOf[js.Any])
      
      inline def setHideRootUndefined: Self = StObject.set(x, "hideRoot", js.undefined)
      
      inline def setInvertTheme(value: Boolean): Self = StObject.set(x, "invertTheme", value.asInstanceOf[js.Any])
      
      inline def setInvertThemeUndefined: Self = StObject.set(x, "invertTheme", js.undefined)
      
      inline def setIsCustomNode(value: () => Boolean): Self = StObject.set(x, "isCustomNode", js.Any.fromFunction0(value))
      
      inline def setIsCustomNodeUndefined: Self = StObject.set(x, "isCustomNode", js.undefined)
      
      inline def setKeyPath(value: js.Array[String | Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
      
      inline def setKeyPathVarargs(value: (String | Double)*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
      
      inline def setLabelRenderer(
        value: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => Element
      ): Self = StObject.set(x, "labelRenderer", js.Any.fromFunction4(value))
      
      inline def setLabelRendererUndefined: Self = StObject.set(x, "labelRenderer", js.undefined)
      
      inline def setPostprocessValue(value: /* raw */ String => Element): Self = StObject.set(x, "postprocessValue", js.Any.fromFunction1(value))
      
      inline def setPostprocessValueUndefined: Self = StObject.set(x, "postprocessValue", js.undefined)
      
      inline def setShouldExpandNode(
        value: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[js.Any] | js.Object, /* level */ Double) => Boolean
      ): Self = StObject.set(x, "shouldExpandNode", js.Any.fromFunction3(value))
      
      inline def setShouldExpandNodeUndefined: Self = StObject.set(x, "shouldExpandNode", js.undefined)
      
      inline def setSortObjectKeys(value: js.Function | Boolean): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setSortObjectKeysUndefined: Self = StObject.set(x, "sortObjectKeys", js.undefined)
      
      inline def setTheme(value: js.Object | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValueRenderer(
        value: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => Element
      ): Self = StObject.set(x, "valueRenderer", js.Any.fromFunction3(value))
      
      inline def setValueRendererUndefined: Self = StObject.set(x, "valueRenderer", js.undefined)
    }
  }
}
