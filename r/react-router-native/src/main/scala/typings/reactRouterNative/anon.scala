package typings.reactRouterNative

import typings.history.mod.Action
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.ReactNode
import typings.reactRouter.mod.StaticRouterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-router.react-router.MemoryRouterProps> */
  trait ReadonlyMemoryRouterProps extends StObject {
    
    val getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.undefined
    
    val initialEntries: js.UndefOr[js.Array[LocationDescriptor[LocationState]]] = js.undefined
    
    val initialIndex: js.UndefOr[Double] = js.undefined
    
    val keyLength: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyMemoryRouterProps {
    
    inline def apply(): ReadonlyMemoryRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyMemoryRouterProps]
    }
    
    extension [Self <: ReadonlyMemoryRouterProps](x: Self) {
      
      inline def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      inline def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      inline def setInitialEntries(value: js.Array[LocationDescriptor[LocationState]]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: LocationDescriptor[LocationState]*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.PromptProps> */
  trait ReadonlyPromptProps extends StObject {
    
    val message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
    
    val when: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyPromptProps {
    
    inline def apply(
      message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
    ): ReadonlyPromptProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPromptProps]
    }
    
    extension [Self <: ReadonlyPromptProps](x: Self) {
      
      inline def setMessage(
        value: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction2(value: (/* location */ Location[LocationState], /* action */ Action) => String | Boolean): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
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
    
    inline def apply(to: LocationDescriptor[LocationState]): ReadonlyRedirectProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRedirectProps]
    }
    
    extension [Self <: ReadonlyRedirectProps](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.RouterProps> */
  trait ReadonlyRouterProps extends StObject {
    
    val history: History[LocationState]
  }
  object ReadonlyRouterProps {
    
    inline def apply(history: History[LocationState]): ReadonlyRouterProps = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRouterProps]
    }
    
    extension [Self <: ReadonlyRouterProps](x: Self) {
      
      inline def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.StaticRouterProps> */
  trait ReadonlyStaticRouterProps extends StObject {
    
    val basename: js.UndefOr[String] = js.undefined
    
    val context: js.UndefOr[StaticRouterContext] = js.undefined
    
    val location: js.UndefOr[String | js.Object] = js.undefined
  }
  object ReadonlyStaticRouterProps {
    
    inline def apply(): ReadonlyStaticRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyStaticRouterProps]
    }
    
    extension [Self <: ReadonlyStaticRouterProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setContext(value: StaticRouterContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setLocation(value: String | js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.SwitchProps> */
  trait ReadonlySwitchProps extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val location: js.UndefOr[Location[LocationState]] = js.undefined
  }
  object ReadonlySwitchProps {
    
    inline def apply(): ReadonlySwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySwitchProps]
    }
    
    extension [Self <: ReadonlySwitchProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
