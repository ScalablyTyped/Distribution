package typings.reactJsonTree

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-tree", JSImport.Default)
  @js.native
  class default ()
    extends Component[JSONTreeProps, js.Object, js.Any]
  
  @js.native
  trait JSONTreeComponent
    extends Component[JSONTreeProps, js.Object, js.Any]
  
  @js.native
  trait JSONTreeProps extends Props[JSONTreeComponent] {
    
    var collectionLimit: js.UndefOr[Double] = js.native
    
    var data: js.Array[_] | js.Object = js.native
    
    var getItemString: js.UndefOr[
        js.Function4[
          /* type */ String, 
          /* data */ js.Array[_] | js.Object, 
          /* itemType */ String, 
          /* itemString */ String, 
          Element
        ]
      ] = js.native
    
    var hideRoot: js.UndefOr[Boolean] = js.native
    
    var invertTheme: js.UndefOr[Boolean] = js.native
    
    var isCustomNode: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var keyPath: js.UndefOr[js.Array[String | Double]] = js.native
    
    var labelRenderer: js.UndefOr[
        js.Function4[
          /* keyPath */ js.Array[String], 
          /* nodeType */ js.UndefOr[String], 
          /* expanded */ js.UndefOr[Boolean], 
          /* expandable */ js.UndefOr[Boolean], 
          Element
        ]
      ] = js.native
    
    var postprocessValue: js.UndefOr[js.Function1[/* raw */ String, Element]] = js.native
    
    var shouldExpandNode: js.UndefOr[
        js.Function3[
          /* keyPath */ js.Array[String | Double], 
          /* data */ js.Array[_] | js.Object, 
          /* level */ Double, 
          Boolean
        ]
      ] = js.native
    
    var sortObjectKeys: js.UndefOr[js.Function | Boolean] = js.native
    
    var theme: js.UndefOr[js.Object | String] = js.native
    
    var valueRenderer: js.UndefOr[
        js.Function3[
          /* displayValue */ String | Double, 
          /* rawValue */ js.UndefOr[String | Double | Boolean | Null], 
          /* repeated */ String | Double, 
          Element
        ]
      ] = js.native
  }
  object JSONTreeProps {
    
    @scala.inline
    def apply(data: js.Array[_] | js.Object): JSONTreeProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONTreeProps]
    }
    
    @scala.inline
    implicit class JSONTreePropsMutableBuilder[Self <: JSONTreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollectionLimit(value: Double): Self = StObject.set(x, "collectionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionLimitUndefined: Self = StObject.set(x, "collectionLimit", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[_] | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGetItemString(
        value: (/* type */ String, /* data */ js.Array[_] | js.Object, /* itemType */ String, /* itemString */ String) => Element
      ): Self = StObject.set(x, "getItemString", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetItemStringUndefined: Self = StObject.set(x, "getItemString", js.undefined)
      
      @scala.inline
      def setHideRoot(value: Boolean): Self = StObject.set(x, "hideRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideRootUndefined: Self = StObject.set(x, "hideRoot", js.undefined)
      
      @scala.inline
      def setInvertTheme(value: Boolean): Self = StObject.set(x, "invertTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertThemeUndefined: Self = StObject.set(x, "invertTheme", js.undefined)
      
      @scala.inline
      def setIsCustomNode(value: () => Boolean): Self = StObject.set(x, "isCustomNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCustomNodeUndefined: Self = StObject.set(x, "isCustomNode", js.undefined)
      
      @scala.inline
      def setKeyPath(value: js.Array[String | Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
      
      @scala.inline
      def setKeyPathVarargs(value: (String | Double)*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
      
      @scala.inline
      def setLabelRenderer(
        value: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => Element
      ): Self = StObject.set(x, "labelRenderer", js.Any.fromFunction4(value))
      
      @scala.inline
      def setLabelRendererUndefined: Self = StObject.set(x, "labelRenderer", js.undefined)
      
      @scala.inline
      def setPostprocessValue(value: /* raw */ String => Element): Self = StObject.set(x, "postprocessValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostprocessValueUndefined: Self = StObject.set(x, "postprocessValue", js.undefined)
      
      @scala.inline
      def setShouldExpandNode(
        value: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[_] | js.Object, /* level */ Double) => Boolean
      ): Self = StObject.set(x, "shouldExpandNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShouldExpandNodeUndefined: Self = StObject.set(x, "shouldExpandNode", js.undefined)
      
      @scala.inline
      def setSortObjectKeys(value: js.Function | Boolean): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortObjectKeysUndefined: Self = StObject.set(x, "sortObjectKeys", js.undefined)
      
      @scala.inline
      def setTheme(value: js.Object | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValueRenderer(
        value: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => Element
      ): Self = StObject.set(x, "valueRenderer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValueRendererUndefined: Self = StObject.set(x, "valueRenderer", js.undefined)
    }
  }
}
