package typings.reactMasonryLayout

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactMasonryLayout.mod.ReactMasonryLayoutExport.MasonryLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("react-masonry-layout", JSImport.Default)
    @js.native
    val ^ : ComponentType[MasonryLayoutProps] = js.native
    
    type _To = ComponentType[MasonryLayoutProps]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[MasonryLayoutProps] = ^
  }
  
  object ReactMasonryLayoutExport {
    
    @js.native
    trait MasonryLayoutProps extends StObject {
      
      /**
        * The css classname you want to use
        *
        * @default ''
        */
      var className: js.UndefOr[String] = js.native
      
      var id: String = js.native
      
      /**
        * The function that used to load more data
        *
        * @default () => {}
        */
      var infiniteScroll: js.UndefOr[js.Function0[Unit]] = js.native
      
      /**
        * By default, it will listen to the window's scroll event. If you want to listen to some div's scroll event, please set the container's id to it
        *
        * @default 'window'
        */
      var infiniteScrollContainer: js.UndefOr[String] = js.native
      
      /**
        * If you don't want to trigger infiniteScroll, set it to true
        *
        * @default false
        */
      var infiniteScrollDisabled: js.UndefOr[Boolean] = js.native
      
      /**
        * The distance to trigger infiniteScroll
        *
        * @default 200
        */
      var infiniteScrollDistance: js.UndefOr[Double] = js.native
      
      /**
        * When no more data, please set it to true, then the infiniteScroll will not trigger
        *
        * @default false
        */
      var infiniteScrollEnd: js.UndefOr[Boolean] = js.native
      
      /**
        * Override it if you want to custom the no more data indicator
        *
        * @default <div>no more data</div>
        */
      var infiniteScrollEndIndicator: js.UndefOr[ReactNode] = js.native
      
      /**
        * When you are loading data, please set it to true, then the infiniteScroll will not trigger
        *
        * @default false
        */
      var infiniteScrollLoading: js.UndefOr[Boolean] = js.native
      
      /**
        * Override it if you want to custom the loading spinner
        *
        * @default <div>this is a loader</div>
        */
      var infiniteScrollSpinner: js.UndefOr[ReactNode] = js.native
      
      /**
        * An attribute added to the grid items after they're positioned within the grid. If the attribute is not prefixed with data-, it will be added.
        * @default data-packed
        */
      var packed: js.UndefOr[String] = js.native
      
      /**
        * A boolean, defaulting to true, indicating that the grid items should be positioned using the top and left CSS properties.
        *
        * If set to false, the grid items will be positioned using the transform CSS property.
        *
        * @default false
        */
      var position: js.UndefOr[Boolean] = js.native
      
      /**
        * An array of objects describing the grid's properties at different breakpoints.
        *
        * When defining your sizes, note the following:
        *
        * - Sizes must be listed smallest to largest
        * - Sizes must use min-width media queries (any unit)
        * - Width of the grid items at each breakpoint should be set in your CSS (in px)
        * - The size without the mq property is assumed to be your smallest breakpoint, and must appear first
        * @default [ { columns: 2, gutter: 20 }, { mq: '768px', columns: 3, gutter: 20 }, { mq: '1024px', columns: 6, gutter: 20 } ]
        */
      var sizes: js.UndefOr[js.Array[MasonryLayoutSizes]] = js.native
      
      /**
        * The inline style you want to use
        *
        * @default {}
        */
      var style: js.UndefOr[CSSProperties] = js.native
    }
    object MasonryLayoutProps {
      
      @scala.inline
      def apply(id: String): MasonryLayoutProps = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[MasonryLayoutProps]
      }
      
      @scala.inline
      implicit class MasonryLayoutPropsMutableBuilder[Self <: MasonryLayoutProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScroll(value: () => Unit): Self = StObject.set(x, "infiniteScroll", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInfiniteScrollContainer(value: String): Self = StObject.set(x, "infiniteScrollContainer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollContainerUndefined: Self = StObject.set(x, "infiniteScrollContainer", js.undefined)
        
        @scala.inline
        def setInfiniteScrollDisabled(value: Boolean): Self = StObject.set(x, "infiniteScrollDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollDisabledUndefined: Self = StObject.set(x, "infiniteScrollDisabled", js.undefined)
        
        @scala.inline
        def setInfiniteScrollDistance(value: Double): Self = StObject.set(x, "infiniteScrollDistance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollDistanceUndefined: Self = StObject.set(x, "infiniteScrollDistance", js.undefined)
        
        @scala.inline
        def setInfiniteScrollEnd(value: Boolean): Self = StObject.set(x, "infiniteScrollEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollEndIndicator(value: ReactNode): Self = StObject.set(x, "infiniteScrollEndIndicator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollEndIndicatorUndefined: Self = StObject.set(x, "infiniteScrollEndIndicator", js.undefined)
        
        @scala.inline
        def setInfiniteScrollEndUndefined: Self = StObject.set(x, "infiniteScrollEnd", js.undefined)
        
        @scala.inline
        def setInfiniteScrollLoading(value: Boolean): Self = StObject.set(x, "infiniteScrollLoading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollLoadingUndefined: Self = StObject.set(x, "infiniteScrollLoading", js.undefined)
        
        @scala.inline
        def setInfiniteScrollSpinner(value: ReactNode): Self = StObject.set(x, "infiniteScrollSpinner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfiniteScrollSpinnerUndefined: Self = StObject.set(x, "infiniteScrollSpinner", js.undefined)
        
        @scala.inline
        def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
        
        @scala.inline
        def setPacked(value: String): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
        
        @scala.inline
        def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setSizes(value: js.Array[MasonryLayoutSizes]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        @scala.inline
        def setSizesVarargs(value: MasonryLayoutSizes*): Self = StObject.set(x, "sizes", js.Array(value :_*))
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    @js.native
    trait MasonryLayoutSizes extends StObject {
      
      /**
        * the number of vertical columns
        */
      var columns: Double = js.native
      
      /**
        * the space (in px) between the columns and grid items
        */
      var gutter: Double = js.native
      
      /**
        * the minimum viewport width (String CSS unit: em, px, rem)
        */
      var mq: js.UndefOr[String] = js.native
    }
    object MasonryLayoutSizes {
      
      @scala.inline
      def apply(columns: Double, gutter: Double): MasonryLayoutSizes = {
        val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
        __obj.asInstanceOf[MasonryLayoutSizes]
      }
      
      @scala.inline
      implicit class MasonryLayoutSizesMutableBuilder[Self <: MasonryLayoutSizes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMq(value: String): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
      }
    }
  }
}
