package typings.react

import typings.react.mod.ExoticComponent
import typings.react.mod.ReactElement
import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Exclude
import typings.std.Iterable
import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def unstableStartTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("react", "unstable_SuspenseList")
    @js.native
    val unstableSuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    inline def unstableUseDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def unstableUseOpaqueIdentifier(): OpaqueIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useOpaqueIdentifier")().asInstanceOf[OpaqueIdentifier]
    
    inline def unstableUseTransition(config: js.UndefOr[SuspenseConfig | Null]): js.Tuple2[TransitionStartFunction, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TransitionStartFunction, Boolean]]
    
    inline def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: js.UndefOr[SuspenseConfig | Null]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with typings.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.undefined
    }
    object DirectionalSuspenseListProps {
      
      inline def apply(children: ReactElement | Iterable[ReactElement], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      extension [Self <: DirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with typings.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.undefined
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.undefined
    }
    object NonDirectionalSuspenseListProps {
      
      inline def apply(children: ReactElement | Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
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
    @js.native
    trait OpaqueIdentifier
      extends StObject
         with String
    
    trait SuspenseConfig extends StObject {
      
      var busyDelayMs: js.UndefOr[Double] = js.undefined
      
      var busyMinDurationMs: js.UndefOr[Double] = js.undefined
    }
    object SuspenseConfig {
      
      inline def apply(): SuspenseConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuspenseConfig]
      }
      
      extension [Self <: SuspenseConfig](x: Self) {
        
        inline def setBusyDelayMs(value: Double): Self = StObject.set(x, "busyDelayMs", value.asInstanceOf[js.Any])
        
        inline def setBusyDelayMsUndefined: Self = StObject.set(x, "busyDelayMs", js.undefined)
        
        inline def setBusyMinDurationMs(value: Double): Self = StObject.set(x, "busyMinDurationMs", value.asInstanceOf[js.Any])
        
        inline def setBusyMinDurationMsUndefined: Self = StObject.set(x, "busyMinDurationMs", js.undefined)
      }
    }
    
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: ReactElement | Iterable[ReactElement]
    }
    object SuspenseListCommonProps {
      
      inline def apply(children: ReactElement | Iterable[ReactElement]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      extension [Self <: SuspenseListCommonProps](x: Self) {
        
        inline def setChildren(value: ReactElement | Iterable[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      inline def DirectionalSuspenseListProps(children: ReactElement | Iterable[ReactElement], revealOrder: forwards | backwards): typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      inline def NonDirectionalSuspenseListProps(children: ReactElement | Iterable[ReactElement]): typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
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
      
      inline def backwards: typings.react.reactStrings.backwards = "backwards".asInstanceOf[typings.react.reactStrings.backwards]
      
      inline def forwards: typings.react.reactStrings.forwards = "forwards".asInstanceOf[typings.react.reactStrings.forwards]
      
      inline def together: typings.react.reactStrings.together = "together".asInstanceOf[typings.react.reactStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.reactStrings.collapsed
      - typings.react.reactStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      inline def collapsed: typings.react.reactStrings.collapsed = "collapsed".asInstanceOf[typings.react.reactStrings.collapsed]
      
      inline def hidden: typings.react.reactStrings.hidden = "hidden".asInstanceOf[typings.react.reactStrings.hidden]
    }
    
    trait SuspenseProps extends StObject {
      
      /**
        * The presence of this prop indicates that the content is computationally expensive to render.
        * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
        * @see {@link https://github.com/facebook/react/pull/19936}
        */
      var unstable_expectedLoadTime: js.UndefOr[Double] = js.undefined
    }
    object SuspenseProps {
      
      inline def apply(): SuspenseProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuspenseProps]
      }
      
      extension [Self <: SuspenseProps](x: Self) {
        
        inline def setUnstable_expectedLoadTime(value: Double): Self = StObject.set(x, "unstable_expectedLoadTime", value.asInstanceOf[js.Any])
        
        inline def setUnstable_expectedLoadTimeUndefined: Self = StObject.set(x, "unstable_expectedLoadTime", js.undefined)
      }
    }
    
    type TransitionFunction = js.Function0[js.UndefOr[Unit]]
    
    type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]
  }
}
