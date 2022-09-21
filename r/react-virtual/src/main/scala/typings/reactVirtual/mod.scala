package typings.reactVirtual

import typings.react.mod.RefObject
import typings.reactVirtual.anon.Measure
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultRangeExtractor(range: Range): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRangeExtractor")(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def useVirtual[T](options: Options[T]): Measure = ^.asInstanceOf[js.Dynamic].applyDynamic("useVirtual")(options.asInstanceOf[js.Any]).asInstanceOf[Measure]
  
  type Key = Double | String
  
  trait Options[T] extends StObject {
    
    var estimateSize: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var initialRect: js.UndefOr[Rect] = js.undefined
    
    var keyExtractor: js.UndefOr[js.Function1[/* index */ Double, Key]] = js.undefined
    
    var onScrollElement: js.UndefOr[RefObject[HTMLElement]] = js.undefined
    
    var overscan: js.UndefOr[Double] = js.undefined
    
    var paddingEnd: js.UndefOr[Double] = js.undefined
    
    var paddingStart: js.UndefOr[Double] = js.undefined
    
    var parentRef: RefObject[T]
    
    var rangeExtractor: js.UndefOr[js.Function1[/* range */ Range, js.Array[Double]]] = js.undefined
    
    var scrollOffsetFn: js.UndefOr[js.Function1[/* event */ js.UndefOr[Event], Double]] = js.undefined
    
    var scrollToFn: js.UndefOr[
        js.Function2[
          /* offset */ Double, 
          /* defaultScrollToFn */ js.UndefOr[js.Function1[/* offset */ Double, Unit]], 
          Unit
        ]
      ] = js.undefined
    
    var size: Double
    
    var useObserver: js.UndefOr[js.Function2[/* ref */ RefObject[T], /* initialRect */ js.UndefOr[Rect], Rect]] = js.undefined
  }
  object Options {
    
    inline def apply[T](parentRef: RefObject[T], size: Double): Options[T] = {
      val __obj = js.Dynamic.literal(parentRef = parentRef.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setEstimateSize(value: /* index */ Double => Double): Self = StObject.set(x, "estimateSize", js.Any.fromFunction1(value))
      
      inline def setEstimateSizeUndefined: Self = StObject.set(x, "estimateSize", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInitialRect(value: Rect): Self = StObject.set(x, "initialRect", value.asInstanceOf[js.Any])
      
      inline def setInitialRectUndefined: Self = StObject.set(x, "initialRect", js.undefined)
      
      inline def setKeyExtractor(value: /* index */ Double => Key): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction1(value))
      
      inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      inline def setOnScrollElement(value: RefObject[HTMLElement]): Self = StObject.set(x, "onScrollElement", value.asInstanceOf[js.Any])
      
      inline def setOnScrollElementUndefined: Self = StObject.set(x, "onScrollElement", js.undefined)
      
      inline def setOverscan(value: Double): Self = StObject.set(x, "overscan", value.asInstanceOf[js.Any])
      
      inline def setOverscanUndefined: Self = StObject.set(x, "overscan", js.undefined)
      
      inline def setPaddingEnd(value: Double): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
      
      inline def setPaddingStart(value: Double): Self = StObject.set(x, "paddingStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingStartUndefined: Self = StObject.set(x, "paddingStart", js.undefined)
      
      inline def setParentRef(value: RefObject[T]): Self = StObject.set(x, "parentRef", value.asInstanceOf[js.Any])
      
      inline def setRangeExtractor(value: /* range */ Range => js.Array[Double]): Self = StObject.set(x, "rangeExtractor", js.Any.fromFunction1(value))
      
      inline def setRangeExtractorUndefined: Self = StObject.set(x, "rangeExtractor", js.undefined)
      
      inline def setScrollOffsetFn(value: /* event */ js.UndefOr[Event] => Double): Self = StObject.set(x, "scrollOffsetFn", js.Any.fromFunction1(value))
      
      inline def setScrollOffsetFnUndefined: Self = StObject.set(x, "scrollOffsetFn", js.undefined)
      
      inline def setScrollToFn(
        value: (/* offset */ Double, /* defaultScrollToFn */ js.UndefOr[js.Function1[/* offset */ Double, Unit]]) => Unit
      ): Self = StObject.set(x, "scrollToFn", js.Any.fromFunction2(value))
      
      inline def setScrollToFnUndefined: Self = StObject.set(x, "scrollToFn", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUseObserver(value: (/* ref */ RefObject[T], /* initialRect */ js.UndefOr[Rect]) => Rect): Self = StObject.set(x, "useObserver", js.Any.fromFunction2(value))
      
      inline def setUseObserverUndefined: Self = StObject.set(x, "useObserver", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var end: Double
    
    var overscan: Double
    
    var size: Double
    
    var start: Double
  }
  object Range {
    
    inline def apply(end: Double, overscan: Double, size: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], overscan = overscan.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setOverscan(value: Double): Self = StObject.set(x, "overscan", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Rect {
    
    inline def apply(height: Double, width: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactVirtual.reactVirtualStrings.start
    - typings.reactVirtual.reactVirtualStrings.center
    - typings.reactVirtual.reactVirtualStrings.end
    - typings.reactVirtual.reactVirtualStrings.auto
  */
  trait ScrollAlignment extends StObject
  object ScrollAlignment {
    
    inline def auto: typings.reactVirtual.reactVirtualStrings.auto = "auto".asInstanceOf[typings.reactVirtual.reactVirtualStrings.auto]
    
    inline def center: typings.reactVirtual.reactVirtualStrings.center = "center".asInstanceOf[typings.reactVirtual.reactVirtualStrings.center]
    
    inline def end: typings.reactVirtual.reactVirtualStrings.end = "end".asInstanceOf[typings.reactVirtual.reactVirtualStrings.end]
    
    inline def start: typings.reactVirtual.reactVirtualStrings.start = "start".asInstanceOf[typings.reactVirtual.reactVirtualStrings.start]
  }
  
  type ScrollToIndexOptions = ScrollToOptions
  
  type ScrollToOffsetOptions = ScrollToOptions
  
  trait ScrollToOptions extends StObject {
    
    var align: ScrollAlignment
  }
  object ScrollToOptions {
    
    inline def apply(align: ScrollAlignment): ScrollToOptions = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollToOptions]
    }
    
    extension [Self <: ScrollToOptions](x: Self) {
      
      inline def setAlign(value: ScrollAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VirtualItem extends StObject {
    
    var end: Double = js.native
    
    var index: Double = js.native
    
    var key: Key = js.native
    
    def measureRef(): Unit = js.native
    def measureRef(el: HTMLElement): Unit = js.native
    
    var size: Double = js.native
    
    var start: Double = js.native
  }
}
