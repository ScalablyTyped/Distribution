package typings.scrolltofixed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollToFixed {
  
  trait ScrollToFixedOptions extends StObject {
    
    var baseClassName: js.UndefOr[String] = js.undefined
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.undefined
    
    var dontSetWidth: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var limit: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var marginTop: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var offsets: js.UndefOr[Boolean] = js.undefined
    
    var postAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var postFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var postUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeOffsets: js.UndefOr[Boolean] = js.undefined
    
    var spacerClass: js.UndefOr[String] = js.undefined
    
    var unfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ScrollToFixedOptions {
    
    @scala.inline
    def apply(): ScrollToFixedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollToFixedOptions]
    }
    
    @scala.inline
    implicit class ScrollToFixedOptionsMutableBuilder[Self <: ScrollToFixedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseClassName(value: String): Self = StObject.set(x, "baseClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClassNameUndefined: Self = StObject.set(x, "baseClassName", js.undefined)
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDontCheckForPositionFixedSupport(value: Boolean): Self = StObject.set(x, "dontCheckForPositionFixedSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontCheckForPositionFixedSupportUndefined: Self = StObject.set(x, "dontCheckForPositionFixedSupport", js.undefined)
      
      @scala.inline
      def setDontSetWidth(value: Boolean): Self = StObject.set(x, "dontSetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontSetWidthUndefined: Self = StObject.set(x, "dontSetWidth", js.undefined)
      
      @scala.inline
      def setFixed(value: () => Unit): Self = StObject.set(x, "fixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | js.Function0[Double]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitFunction0(value: () => Double): Self = StObject.set(x, "limit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMarginTop(value: Double | js.Function0[Double]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopFunction0(value: () => Double): Self = StObject.set(x, "marginTop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
      
      @scala.inline
      def setPostAbsolute(value: () => Unit): Self = StObject.set(x, "postAbsolute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPostAbsoluteUndefined: Self = StObject.set(x, "postAbsolute", js.undefined)
      
      @scala.inline
      def setPostFixed(value: () => Unit): Self = StObject.set(x, "postFixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPostFixedUndefined: Self = StObject.set(x, "postFixed", js.undefined)
      
      @scala.inline
      def setPostUnfixed(value: () => Unit): Self = StObject.set(x, "postUnfixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPostUnfixedUndefined: Self = StObject.set(x, "postUnfixed", js.undefined)
      
      @scala.inline
      def setPreAbsolute(value: () => Unit): Self = StObject.set(x, "preAbsolute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreAbsoluteUndefined: Self = StObject.set(x, "preAbsolute", js.undefined)
      
      @scala.inline
      def setPreFixed(value: () => Unit): Self = StObject.set(x, "preFixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreFixedUndefined: Self = StObject.set(x, "preFixed", js.undefined)
      
      @scala.inline
      def setPreUnfixed(value: () => Unit): Self = StObject.set(x, "preUnfixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreUnfixedUndefined: Self = StObject.set(x, "preUnfixed", js.undefined)
      
      @scala.inline
      def setRemoveOffsets(value: Boolean): Self = StObject.set(x, "removeOffsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOffsetsUndefined: Self = StObject.set(x, "removeOffsets", js.undefined)
      
      @scala.inline
      def setSpacerClass(value: String): Self = StObject.set(x, "spacerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacerClassUndefined: Self = StObject.set(x, "spacerClass", js.undefined)
      
      @scala.inline
      def setUnfixed(value: () => Unit): Self = StObject.set(x, "unfixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnfixedUndefined: Self = StObject.set(x, "unfixed", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
