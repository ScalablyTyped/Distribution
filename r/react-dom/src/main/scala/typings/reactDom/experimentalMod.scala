package typings.reactDom

import typings.react.mod.ReactChild
import typings.react.mod.ReactNodeArray
import typings.std.Comment
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactDomAugmentingMod {
    
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
    @JSImport("react-dom", "unstable_createBlockingRoot")
    @js.native
    def unstableCreateBlockingRoot(container: Element | Document | DocumentFragment | Comment, options: js.UndefOr[RootOptions]): Root = js.native
    
    /**
      * Replaces `ReactDOM.render` when the `.render` method is called and enables Concurrent Mode.
      *
      * @see https://reactjs.org/docs/concurrent-mode-reference.html#createroot
      */
    @JSImport("react-dom", "unstable_createRoot")
    @js.native
    def unstableCreateRoot(container: Element | Document | DocumentFragment | Comment, options: js.UndefOr[RootOptions]): Root = js.native
    
    @JSImport("react-dom", "unstable_flushControlled")
    @js.native
    def unstableFlushControlled(callback: js.Function0[Unit]): Unit = js.native
    
    // enableSelectiveHydration feature
    /**
      * @see https://github.com/facebook/react/commit/3a2b5f148d450c69aab67f055fc441d294c23518
      */
    @JSImport("react-dom", "unstable_scheduleHydration")
    @js.native
    def unstableScheduleHydration(target: Element | Document | DocumentFragment | Comment): Unit = js.native
    
    // enableSuspenseServerRenderer feature
    @js.native
    trait HydrationOptions extends StObject {
      
      var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.native
      
      var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.native
    }
    object HydrationOptions {
      
      @scala.inline
      def apply(): HydrationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HydrationOptions]
      }
      
      @scala.inline
      implicit class HydrationOptionsMutableBuilder[Self <: HydrationOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnDeleted(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onDeleted", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDeletedUndefined: Self = StObject.set(x, "onDeleted", js.undefined)
        
        @scala.inline
        def setOnHydrated(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onHydrated", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnHydratedUndefined: Self = StObject.set(x, "onHydrated", js.undefined)
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
    @js.native
    trait RootOptions extends StObject {
      
      var hydrate: js.UndefOr[Boolean] = js.native
      
      var hydrationOptions: js.UndefOr[HydrationOptions] = js.native
    }
    object RootOptions {
      
      @scala.inline
      def apply(): RootOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RootOptions]
      }
      
      @scala.inline
      implicit class RootOptionsMutableBuilder[Self <: RootOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
        
        @scala.inline
        def setHydrationOptions(value: HydrationOptions): Self = StObject.set(x, "hydrationOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHydrationOptionsUndefined: Self = StObject.set(x, "hydrationOptions", js.undefined)
      }
    }
  }
}
