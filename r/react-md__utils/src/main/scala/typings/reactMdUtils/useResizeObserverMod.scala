package typings.reactMdUtils

import typings.react.mod.Ref
import typings.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typings.reactMdUtils.useResizeObserverV1Mod.UseResizeObserverV1Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResizeObserverMod {
  
  @JSImport("@react-md/utils/types/sizing/useResizeObserver", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils/types/sizing/useResizeObserver", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils/types/sizing/useResizeObserver", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = js.native
  
  type OnResizeObserverChange[E /* <: HTMLElement */] = js.Function1[/* resizeData */ ResizeObserverElementData[E], Unit]
  
  @js.native
  trait ResizeObserverElementData[E /* <: HTMLElement */] extends ResizeObserverElementSize {
    
    /**
      * The element that changed due to the resize observer.
      */
    var element: E = js.native
  }
  object ResizeObserverElementData {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](element: E, height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ResizeObserverElementData[E] = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverElementData[E]]
    }
    
    @scala.inline
    implicit class ResizeObserverElementDataMutableBuilder[Self <: ResizeObserverElementData[_], E /* <: HTMLElement */] (val x: Self with ResizeObserverElementData[E]) extends AnyVal {
      
      @scala.inline
      def setElement(value: E): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizeObserverElementSize extends StObject {
    
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
  object ResizeObserverElementSize {
    
    @scala.inline
    def apply(height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ResizeObserverElementSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverElementSize]
    }
    
    @scala.inline
    implicit class ResizeObserverElementSizeMutableBuilder[Self <: ResizeObserverElementSize] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait UseResizeObserverOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the `onResize` callback should not be triggered if only the
      * height has changed for the watched element.
      */
    var disableHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the `onResize` callback should not be triggered if only the
      * width has changed for the watched element.
      */
    var disableWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional ref to merge with the returned ref handler function
      */
    var ref: js.UndefOr[Ref[E | Null]] = js.native
  }
  object UseResizeObserverOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): UseResizeObserverOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseResizeObserverOptions[E]]
    }
    
    @scala.inline
    implicit class UseResizeObserverOptionsMutableBuilder[Self <: UseResizeObserverOptions[_], E /* <: HTMLElement */] (val x: Self with UseResizeObserverOptions[E]) extends AnyVal {
      
      @scala.inline
      def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      @scala.inline
      def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[E | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ (E | Null) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
