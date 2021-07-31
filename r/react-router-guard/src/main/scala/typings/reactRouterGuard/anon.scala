package typings.reactRouterGuard

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default[T /* <: ComponentType[js.Any] */] extends StObject {
    
    var default: T
  }
  object Default {
    
    @scala.inline
    def apply[T /* <: ComponentType[js.Any] */](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[?], T /* <: ComponentType[js.Any] */] (val x: Self & Default[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-router-dom.react-router-dom.BrowserRouterProps> */
  trait ReadonlyBrowserRouterProp extends StObject {
    
    val basename: js.UndefOr[String] = js.undefined
    
    val forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    val getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.undefined
    
    val keyLength: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyBrowserRouterProp {
    
    @scala.inline
    def apply(): ReadonlyBrowserRouterProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyBrowserRouterProp]
    }
    
    @scala.inline
    implicit class ReadonlyBrowserRouterPropMutableBuilder[Self <: ReadonlyBrowserRouterProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.RedirectProps> */
  trait ReadonlyRedirectProps extends StObject {
    
    val exact: js.UndefOr[Boolean] = js.undefined
    
    val from: js.UndefOr[String] = js.undefined
    
    val path: js.UndefOr[String] = js.undefined
    
    val push: js.UndefOr[Boolean] = js.undefined
    
    val strict: js.UndefOr[Boolean] = js.undefined
    
    val to: LocationDescriptor[LocationState]
  }
  object ReadonlyRedirectProps {
    
    @scala.inline
    def apply(to: LocationDescriptor[LocationState]): ReadonlyRedirectProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRedirectProps]
    }
    
    @scala.inline
    implicit class ReadonlyRedirectPropsMutableBuilder[Self <: ReadonlyRedirectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
