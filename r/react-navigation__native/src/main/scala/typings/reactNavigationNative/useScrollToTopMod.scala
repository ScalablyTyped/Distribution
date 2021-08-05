package typings.reactNavigationNative

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNavigationNative.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollToTopMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useScrollToTop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[ScrollableWrapper]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ScrollOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScrollOptions {
    
    inline def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    extension [Self <: ScrollOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationNative.anon.ScrollToTop
    - typings.reactNavigationNative.anon.ScrollTo
    - typings.reactNavigationNative.anon.ScrollToOffset
    - typings.reactNavigationNative.anon.ScrollResponderScrollTo
  */
  trait ScrollableView
    extends StObject
       with ScrollableWrapper
  object ScrollableView {
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typings.reactNavigationNative.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Unit): typings.reactNavigationNative.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Unit): typings.reactNavigationNative.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: () => Unit): typings.reactNavigationNative.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollToTop]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationNative.anon.GetScrollResponder
    - typings.reactNavigationNative.anon.GetNode
    - typings.reactNavigationNative.useScrollToTopMod.ScrollableView
  */
  trait ScrollableWrapper extends StObject
  object ScrollableWrapper {
    
    inline def GetNode(getNode: () => ScrollableView): typings.reactNavigationNative.anon.GetNode = {
      val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.GetNode]
    }
    
    inline def GetScrollResponder(getScrollResponder: () => ReactNode): typings.reactNavigationNative.anon.GetScrollResponder = {
      val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.GetScrollResponder]
    }
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typings.reactNavigationNative.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Unit): typings.reactNavigationNative.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Unit): typings.reactNavigationNative.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: () => Unit): typings.reactNavigationNative.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typings.reactNavigationNative.anon.ScrollToTop]
    }
  }
}
