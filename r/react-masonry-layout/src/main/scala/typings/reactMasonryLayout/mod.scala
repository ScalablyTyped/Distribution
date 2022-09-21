package typings.reactMasonryLayout

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMasonryLayout.mod.ReactMasonryLayoutExport.MasonryLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    trait MasonryLayoutProps extends StObject {
      
      var children: js.Array[ReactElement]
      
      /**
        * The css classname you want to use
        *
        * @default ''
        */
      var className: js.UndefOr[String] = js.undefined
      
      var id: String
      
      /**
        * The function that used to load more data
        *
        * @default () => {}
        */
      var infiniteScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * By default, it will listen to the window's scroll event. If you want to listen to some div's scroll event, please set the container's id to it
        *
        * @default 'window'
        */
      var infiniteScrollContainer: js.UndefOr[String] = js.undefined
      
      /**
        * If you don't want to trigger infiniteScroll, set it to true
        *
        * @default false
        */
      var infiniteScrollDisabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The distance to trigger infiniteScroll
        *
        * @default 200
        */
      var infiniteScrollDistance: js.UndefOr[Double] = js.undefined
      
      /**
        * When no more data, please set it to true, then the infiniteScroll will not trigger
        *
        * @default false
        */
      var infiniteScrollEnd: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Override it if you want to custom the no more data indicator
        *
        * @default <div>no more data</div>
        */
      var infiniteScrollEndIndicator: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * When you are loading data, please set it to true, then the infiniteScroll will not trigger
        *
        * @default false
        */
      var infiniteScrollLoading: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Override it if you want to custom the loading spinner
        *
        * @default <div>this is a loader</div>
        */
      var infiniteScrollSpinner: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * An attribute added to the grid items after they're positioned within the grid. If the attribute is not prefixed with data-, it will be added.
        * @default data-packed
        */
      var packed: js.UndefOr[String] = js.undefined
      
      /**
        * A boolean, defaulting to true, indicating that the grid items should be positioned using the top and left CSS properties.
        *
        * If set to false, the grid items will be positioned using the transform CSS property.
        *
        * @default false
        */
      var position: js.UndefOr[Boolean] = js.undefined
      
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
      var sizes: js.UndefOr[js.Array[MasonryLayoutSizes]] = js.undefined
      
      /**
        * The inline style you want to use
        *
        * @default {}
        */
      var style: js.UndefOr[CSSProperties] = js.undefined
    }
    object MasonryLayoutProps {
      
      inline def apply(children: js.Array[ReactElement], id: String): MasonryLayoutProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[MasonryLayoutProps]
      }
      
      extension [Self <: MasonryLayoutProps](x: Self) {
        
        inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScroll(value: () => Unit): Self = StObject.set(x, "infiniteScroll", js.Any.fromFunction0(value))
        
        inline def setInfiniteScrollContainer(value: String): Self = StObject.set(x, "infiniteScrollContainer", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollContainerUndefined: Self = StObject.set(x, "infiniteScrollContainer", js.undefined)
        
        inline def setInfiniteScrollDisabled(value: Boolean): Self = StObject.set(x, "infiniteScrollDisabled", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollDisabledUndefined: Self = StObject.set(x, "infiniteScrollDisabled", js.undefined)
        
        inline def setInfiniteScrollDistance(value: Double): Self = StObject.set(x, "infiniteScrollDistance", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollDistanceUndefined: Self = StObject.set(x, "infiniteScrollDistance", js.undefined)
        
        inline def setInfiniteScrollEnd(value: Boolean): Self = StObject.set(x, "infiniteScrollEnd", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollEndIndicator(value: ReactNode): Self = StObject.set(x, "infiniteScrollEndIndicator", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollEndIndicatorUndefined: Self = StObject.set(x, "infiniteScrollEndIndicator", js.undefined)
        
        inline def setInfiniteScrollEndUndefined: Self = StObject.set(x, "infiniteScrollEnd", js.undefined)
        
        inline def setInfiniteScrollLoading(value: Boolean): Self = StObject.set(x, "infiniteScrollLoading", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollLoadingUndefined: Self = StObject.set(x, "infiniteScrollLoading", js.undefined)
        
        inline def setInfiniteScrollSpinner(value: ReactNode): Self = StObject.set(x, "infiniteScrollSpinner", value.asInstanceOf[js.Any])
        
        inline def setInfiniteScrollSpinnerUndefined: Self = StObject.set(x, "infiniteScrollSpinner", js.undefined)
        
        inline def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
        
        inline def setPacked(value: String): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
        
        inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
        
        inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setSizes(value: js.Array[MasonryLayoutSizes]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        inline def setSizesVarargs(value: MasonryLayoutSizes*): Self = StObject.set(x, "sizes", js.Array(value*))
        
        inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    trait MasonryLayoutSizes extends StObject {
      
      /**
        * the number of vertical columns
        */
      var columns: Double
      
      /**
        * the space (in px) between the columns and grid items
        */
      var gutter: Double
      
      /**
        * the minimum viewport width (String CSS unit: em, px, rem)
        */
      var mq: js.UndefOr[String] = js.undefined
    }
    object MasonryLayoutSizes {
      
      inline def apply(columns: Double, gutter: Double): MasonryLayoutSizes = {
        val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
        __obj.asInstanceOf[MasonryLayoutSizes]
      }
      
      extension [Self <: MasonryLayoutSizes](x: Self) {
        
        inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
        
        inline def setMq(value: String): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
        
        inline def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
      }
    }
  }
}
