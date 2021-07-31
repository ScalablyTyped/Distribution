package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResizeObserverV1Mod {
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getResizeObserverTarget(target: ResizeObserverTarget[HTMLElement]): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResizeObserverTarget")(target.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def isHeightChange(prevSize: Unit, nextSize: ElementSize): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHeightChange")(prevSize.asInstanceOf[js.Any], nextSize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isHeightChange(prevSize: ElementSize, nextSize: ElementSize): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHeightChange")(prevSize.asInstanceOf[js.Any], nextSize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isWidthChange(prevSize: Unit, nextSize: ElementSize): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthChange")(prevSize.asInstanceOf[js.Any], nextSize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isWidthChange(prevSize: ElementSize, nextSize: ElementSize): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthChange")(prevSize.asInstanceOf[js.Any], nextSize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def useResizeObserverV1[E /* <: HTMLElement */](hasDisableHeightDisableWidthOnResizeTarget: UseResizeObserverV1Options[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserverV1")(hasDisableHeightDisableWidthOnResizeTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object warnedOnce {
    
    @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "warnedOnce")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "warnedOnce.comp")
    @js.native
    def comp: Boolean = js.native
    @scala.inline
    def comp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comp")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "warnedOnce.hook")
    @js.native
    def hook: Boolean = js.native
    @scala.inline
    def hook_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hook")(x.asInstanceOf[js.Any])
  }
  
  trait ElementSize extends StObject {
    
    /**
      * The height for the element that was changed.
      */
    var height: Double
    
    /**
      * The scroll height for the element that was changed.
      */
    var scrollHeight: Double
    
    /**
      * The scroll height for the element that was changed.
      */
    var scrollWidth: Double
    
    /**
      * The width for the element that was changed.
      */
    var width: Double
  }
  object ElementSize {
    
    @scala.inline
    def apply(height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ElementSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementSize]
    }
    
    @scala.inline
    implicit class ElementSizeMutableBuilder[Self <: ElementSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A function that will return the resize observer target element. This should
    * return an HTMLElement or null.
    */
  type GetTarget[E /* <: HTMLElement */] = js.Function0[E | Null]
  
  trait ObservedResizeData
    extends StObject
       with ElementSize {
    
    /**
      * The element that was changed due to an observered resize event.
      */
    var element: HTMLElement
  }
  object ObservedResizeData {
    
    @scala.inline
    def apply(element: HTMLElement, height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ObservedResizeData = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObservedResizeData]
    }
    
    @scala.inline
    implicit class ObservedResizeDataMutableBuilder[Self <: ObservedResizeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  type ObservedResizeEventHandler = js.Function1[/* event */ ObservedResizeData, Unit]
  
  type RefTarget[E /* <: HTMLElement */] = MutableRefObject[E | Null]
  
  type ResizeObserverTarget[E /* <: HTMLElement */] = Null | HTMLElement | String | RefTarget[E] | GetTarget[E]
  
  trait UseResizeObserverV1Options[E /* <: HTMLElement */] extends StObject {
    
    var disableHeight: js.UndefOr[Boolean] = js.undefined
    
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    var onResize: ObservedResizeEventHandler
    
    var target: ResizeObserverTarget[E]
  }
  object UseResizeObserverV1Options {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](onResize: /* event */ ObservedResizeData => Unit): UseResizeObserverV1Options[E] = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize), target = null)
      __obj.asInstanceOf[UseResizeObserverV1Options[E]]
    }
    
    @scala.inline
    implicit class UseResizeObserverV1OptionsMutableBuilder[Self <: UseResizeObserverV1Options[?], E /* <: HTMLElement */] (val x: Self & UseResizeObserverV1Options[E]) extends AnyVal {
      
      @scala.inline
      def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      @scala.inline
      def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* event */ ObservedResizeData => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTarget(value: ResizeObserverTarget[E]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFunction0(value: () => E | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
    }
  }
}
