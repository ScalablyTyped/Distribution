package typings.react

import typings.react.anon.OpaqueIdentifierBranding
import typings.react.mod.ExoticComponent
import typings.react.mod.ReactElement
import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Exclude
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", "unstable_startTransition")
    @js.native
    def unstableStartTransition(scope: TransitionFunction): Unit = js.native
    
    @JSImport("react", "unstable_SuspenseList")
    @js.native
    val unstableSuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    @JSImport("react", "unstable_useDeferredValue")
    @js.native
    def unstableUseDeferredValue[T](value: T): T = js.native
    
    @JSImport("react", "unstable_useOpaqueIdentifier")
    @js.native
    def unstableUseOpaqueIdentifier(): OpaqueIdentifier = js.native
    
    @JSImport("react", "unstable_useTransition")
    @js.native
    def unstableUseTransition(config: js.UndefOr[SuspenseConfig | Null]): js.Tuple2[TransitionStartFunction, Boolean] = js.native
    
    @JSImport("react", "unstable_withSuspenseConfig")
    @js.native
    def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: js.UndefOr[SuspenseConfig | Null]): Unit = js.native
    
    @js.native
    trait DirectionalSuspenseListProps
      extends SuspenseListCommonProps
         with typings.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards = js.native
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.native
    }
    object DirectionalSuspenseListProps {
      
      @scala.inline
      def apply(children: ReactElement | Iterable[ReactElement], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class DirectionalSuspenseListPropsMutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    @js.native
    trait NonDirectionalSuspenseListProps
      extends SuspenseListCommonProps
         with typings.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.native
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.native
    }
    object NonDirectionalSuspenseListProps {
      
      @scala.inline
      def apply(children: ReactElement | Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class NonDirectionalSuspenseListPropsMutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    /**
      * WARNING: Don't use this as a `string`.
      *
      * This is an opaque type that is not supposed to type-check structurally.
      * It is only valid if returned from React methods and passed to React e.g. `<button aria-labelledby={opaqueIdentifier} />`
      */
    // We can't create a type that would be rejected for string concatenation or `.toString()` calls.
    // So in order to not have to add `string | OpaqueIdentifier` to every react-dom host prop we intersect it with `string`.
    type OpaqueIdentifier = String with OpaqueIdentifierBranding
    
    @js.native
    trait SuspenseConfig extends StObject {
      
      var busyDelayMs: js.UndefOr[Double] = js.native
      
      var busyMinDurationMs: js.UndefOr[Double] = js.native
    }
    object SuspenseConfig {
      
      @scala.inline
      def apply(): SuspenseConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuspenseConfig]
      }
      
      @scala.inline
      implicit class SuspenseConfigMutableBuilder[Self <: SuspenseConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBusyDelayMs(value: Double): Self = StObject.set(x, "busyDelayMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBusyDelayMsUndefined: Self = StObject.set(x, "busyDelayMs", js.undefined)
        
        @scala.inline
        def setBusyMinDurationMs(value: Double): Self = StObject.set(x, "busyMinDurationMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBusyMinDurationMsUndefined: Self = StObject.set(x, "busyMinDurationMs", js.undefined)
      }
    }
    
    @js.native
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: ReactElement | Iterable[ReactElement] = js.native
    }
    object SuspenseListCommonProps {
      
      @scala.inline
      def apply(children: ReactElement | Iterable[ReactElement]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      @scala.inline
      implicit class SuspenseListCommonPropsMutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactElement | Iterable[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      @scala.inline
      def DirectionalSuspenseListProps(children: ReactElement | Iterable[ReactElement], revealOrder: forwards | backwards): typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      @scala.inline
      def NonDirectionalSuspenseListProps(children: ReactElement | Iterable[ReactElement]): typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.reactStrings.forwards
      - typings.react.reactStrings.backwards
      - typings.react.reactStrings.together
    */
    trait SuspenseListRevealOrder extends StObject
    object SuspenseListRevealOrder {
      
      @scala.inline
      def backwards: typings.react.reactStrings.backwards = "backwards".asInstanceOf[typings.react.reactStrings.backwards]
      
      @scala.inline
      def forwards: typings.react.reactStrings.forwards = "forwards".asInstanceOf[typings.react.reactStrings.forwards]
      
      @scala.inline
      def together: typings.react.reactStrings.together = "together".asInstanceOf[typings.react.reactStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.reactStrings.collapsed
      - typings.react.reactStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      @scala.inline
      def collapsed: typings.react.reactStrings.collapsed = "collapsed".asInstanceOf[typings.react.reactStrings.collapsed]
      
      @scala.inline
      def hidden: typings.react.reactStrings.hidden = "hidden".asInstanceOf[typings.react.reactStrings.hidden]
    }
    
    @js.native
    trait SuspenseProps extends StObject {
      
      /**
        * The presence of this prop indicates that the content is computationally expensive to render.
        * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
        * @see {@link https://github.com/facebook/react/pull/19936}
        */
      var unstable_expectedLoadTime: js.UndefOr[Double] = js.native
    }
    object SuspenseProps {
      
      @scala.inline
      def apply(): SuspenseProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuspenseProps]
      }
      
      @scala.inline
      implicit class SuspensePropsMutableBuilder[Self <: SuspenseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUnstable_expectedLoadTime(value: Double): Self = StObject.set(x, "unstable_expectedLoadTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnstable_expectedLoadTimeUndefined: Self = StObject.set(x, "unstable_expectedLoadTime", js.undefined)
      }
    }
    
    type TransitionFunction = js.Function0[js.UndefOr[Unit]]
    
    type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]
  }
}
