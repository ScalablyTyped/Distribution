package typings.reactDom

import typings.react.mod.ReactChild
import typings.react.mod.ReactNodeArray
import typings.std.Comment
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactDomAugmentingMod {
    
    @JSImport("react-dom", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Replaces `ReactDOM.render` when the `.render` method is called and enables Blocking Mode.
      *
      * Opting into Concurrent Mode introduces semantic changes to how React works.
      * This means that you can’t use Concurrent Mode in just a few components.
      * Because of this, some apps may not be able to migrate directly to Concurrent Mode.
      * Blocking Mode only contains a small subset of Concurrent Mode features and is intended
      * as an intermediary migration step for apps that are unable to migrate directly.
      *
      * @see https://reactjs.org/docs/concurrent-mode-adoption.html#migration-step-blocking-mode
      * @see https://reactjs.org/docs/concurrent-mode-reference.html#createblockingroot
      */
    inline def unstableCreateBlockingRoot(container: Element | Document | DocumentFragment | Comment, options: js.UndefOr[RootOptions]): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createBlockingRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
    
    /**
      * Replaces `ReactDOM.render` when the `.render` method is called and enables Concurrent Mode.
      *
      * @see https://reactjs.org/docs/concurrent-mode-reference.html#createroot
      */
    inline def unstableCreateRoot(container: Element | Document | DocumentFragment | Comment, options: js.UndefOr[RootOptions]): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
    
    inline def unstableFlushControlled(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_flushControlled")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // enableSelectiveHydration feature
    /**
      * @see https://github.com/facebook/react/commit/3a2b5f148d450c69aab67f055fc441d294c23518
      */
    inline def unstableScheduleHydration(target: Element | Document | DocumentFragment | Comment): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleHydration")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // enableSuspenseServerRenderer feature
    trait HydrationOptions extends StObject {
      
      var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
      
      var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
    }
    object HydrationOptions {
      
      inline def apply(): HydrationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HydrationOptions]
      }
      
      extension [Self <: HydrationOptions](x: Self) {
        
        inline def setOnDeleted(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onDeleted", js.Any.fromFunction1(value))
        
        inline def setOnDeletedUndefined: Self = StObject.set(x, "onDeleted", js.undefined)
        
        inline def setOnHydrated(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onHydrated", js.Any.fromFunction1(value))
        
        inline def setOnHydratedUndefined: Self = StObject.set(x, "onHydrated", js.undefined)
      }
    }
    
    @js.native
    trait Root extends StObject {
      
      def render(children: ReactChild): Unit = js.native
      def render(children: ReactChild, callback: js.Function0[Unit]): Unit = js.native
      def render(children: ReactNodeArray): Unit = js.native
      def render(children: ReactNodeArray, callback: js.Function0[Unit]): Unit = js.native
      
      def unmount(): Unit = js.native
      def unmount(callback: js.Function0[Unit]): Unit = js.native
    }
    
    // exposeConcurrentModeAPIs features
    trait RootOptions extends StObject {
      
      var hydrate: js.UndefOr[Boolean] = js.undefined
      
      var hydrationOptions: js.UndefOr[HydrationOptions] = js.undefined
    }
    object RootOptions {
      
      inline def apply(): RootOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RootOptions]
      }
      
      extension [Self <: RootOptions](x: Self) {
        
        inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
        
        inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
        
        inline def setHydrationOptions(value: HydrationOptions): Self = StObject.set(x, "hydrationOptions", value.asInstanceOf[js.Any])
        
        inline def setHydrationOptionsUndefined: Self = StObject.set(x, "hydrationOptions", js.undefined)
      }
    }
  }
}
