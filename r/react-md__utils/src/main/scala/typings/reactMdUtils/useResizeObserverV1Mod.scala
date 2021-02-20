package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResizeObserverV1Mod {
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "getResizeObserverTarget")
  @js.native
  def getResizeObserverTarget(target: ResizeObserverTarget[HTMLElement]): HTMLElement | Null = js.native
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "isHeightChange")
  @js.native
  def isHeightChange(prevSize: js.UndefOr[scala.Nothing], nextSize: ElementSize): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "isHeightChange")
  @js.native
  def isHeightChange(prevSize: ElementSize, nextSize: ElementSize): Boolean = js.native
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "isWidthChange")
  @js.native
  def isWidthChange(prevSize: js.UndefOr[scala.Nothing], nextSize: ElementSize): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "isWidthChange")
  @js.native
  def isWidthChange(prevSize: ElementSize, nextSize: ElementSize): Boolean = js.native
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserverV1", "useResizeObserverV1")
  @js.native
  def useResizeObserverV1[E /* <: HTMLElement */](hasDisableHeightDisableWidthOnResizeTarget: UseResizeObserverV1Options[E]): Unit = js.native
  
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
  
  @js.native
  trait ElementSize extends StObject {
    
    /**
      * The height for the element that was changed.
      */
    var height: Double = js.native
    
    /**
      * The scroll height for the element that was changed.
      */
    var scrollHeight: Double = js.native
    
    /**
      * The scroll height for the element that was changed.
      */
    var scrollWidth: Double = js.native
    
    /**
      * The width for the element that was changed.
      */
    var width: Double = js.native
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
  
  @js.native
  trait ObservedResizeData extends ElementSize {
    
    /**
      * The element that was changed due to an observered resize event.
      */
    var element: HTMLElement = js.native
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
  
  @js.native
  trait UseResizeObserverV1Options[E /* <: HTMLElement */] extends StObject {
    
    var disableHeight: js.UndefOr[Boolean] = js.native
    
    var disableWidth: js.UndefOr[Boolean] = js.native
    
    var onResize: ObservedResizeEventHandler = js.native
    
    var target: ResizeObserverTarget[E] = js.native
  }
  object UseResizeObserverV1Options {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](onResize: /* event */ ObservedResizeData => Unit): UseResizeObserverV1Options[E] = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[UseResizeObserverV1Options[E]]
    }
    
    @scala.inline
    implicit class UseResizeObserverV1OptionsMutableBuilder[Self <: UseResizeObserverV1Options[_], E /* <: HTMLElement */] (val x: Self with UseResizeObserverV1Options[E]) extends AnyVal {
      
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
