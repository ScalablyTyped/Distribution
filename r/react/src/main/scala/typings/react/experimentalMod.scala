package typings.react

import typings.react.mod.ExoticComponent
import typings.react.mod.ReactElement
import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react", "SuspenseList")
    @js.native
    val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    inline def experimentalUseEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]
    
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
      
      inline def apply(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
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
      
      inline def apply(children: ReactElement | js.Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
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
      var children: ReactElement | js.Iterable[ReactElement]
    }
    object SuspenseListCommonProps {
      
      inline def apply(children: ReactElement | js.Iterable[ReactElement]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      extension [Self <: SuspenseListCommonProps](x: Self) {
        
        inline def setChildren(value: ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      inline def DirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      inline def NonDirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement]): typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
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
  }
}
