package typings.reactList

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.reactList.reactListStrings.x
import typings.reactList.reactListStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-list", JSImport.Namespace)
  @js.native
  class ^ () extends ReactList
  
  type ItemRenderer = js.Function2[/* index */ Double, /* key */ Double | String, Element]
  
  type ItemSizeEstimator = js.Function2[/* index */ Double, /* cache */ js.Object, Double]
  
  type ItemSizeGetter = js.Function1[/* index */ Double, Double]
  
  type ItemsRenderer = js.Function2[/* items */ js.Array[Element], /* ref */ String, Element]
  
  @js.native
  trait ReactList
    extends Component[ReactListProps, js.Object, js.Any] {
    
    def getVisibleRange(): js.Array[Double] = js.native
    
    def scrollAround(index: Double): Unit = js.native
    
    def scrollTo(index: Double): Unit = js.native
  }
  
  trait ReactListProps
    extends StObject
       with Props[ReactList] {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var itemRenderer: js.UndefOr[ItemRenderer] = js.undefined
    
    var itemSizeEstimator: js.UndefOr[ItemSizeEstimator] = js.undefined
    
    var itemSizeGetter: js.UndefOr[ItemSizeGetter] = js.undefined
    
    var itemsRenderer: js.UndefOr[ItemsRenderer] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var scrollParentGetter: js.UndefOr[ScrollParentGetter] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var useStaticSize: js.UndefOr[Boolean] = js.undefined
    
    var useTranslate3d: js.UndefOr[Boolean] = js.undefined
  }
  object ReactListProps {
    
    @scala.inline
    def apply(): ReactListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactListProps]
    }
    
    @scala.inline
    implicit class ReactListPropsMutableBuilder[Self <: ReactListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: typings.reactList.reactListStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setItemRenderer(value: (/* index */ Double, /* key */ Double | String) => Element): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
      
      @scala.inline
      def setItemSizeEstimator(value: (/* index */ Double, /* cache */ js.Object) => Double): Self = StObject.set(x, "itemSizeEstimator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemSizeEstimatorUndefined: Self = StObject.set(x, "itemSizeEstimator", js.undefined)
      
      @scala.inline
      def setItemSizeGetter(value: /* index */ Double => Double): Self = StObject.set(x, "itemSizeGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemSizeGetterUndefined: Self = StObject.set(x, "itemSizeGetter", js.undefined)
      
      @scala.inline
      def setItemsRenderer(value: (/* items */ js.Array[Element], /* ref */ String) => Element): Self = StObject.set(x, "itemsRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemsRendererUndefined: Self = StObject.set(x, "itemsRenderer", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setScrollParentGetter(value: () => Element): Self = StObject.set(x, "scrollParentGetter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrollParentGetterUndefined: Self = StObject.set(x, "scrollParentGetter", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseStaticSize(value: Boolean): Self = StObject.set(x, "useStaticSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStaticSizeUndefined: Self = StObject.set(x, "useStaticSize", js.undefined)
      
      @scala.inline
      def setUseTranslate3d(value: Boolean): Self = StObject.set(x, "useTranslate3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTranslate3dUndefined: Self = StObject.set(x, "useTranslate3d", js.undefined)
    }
  }
  
  type ScrollParentGetter = js.Function0[Element]
}
