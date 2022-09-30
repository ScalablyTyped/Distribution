package typings.reactNativeReanimated

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.reanimated2CommonTypesMod.StyleProps
import typings.reactNativeReanimated.viewDescriptorsSetMod.ViewDescriptorsSet
import typings.reactNativeReanimated.viewDescriptorsSetMod.ViewRefSet
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAnimatedComponentMod {
  
  @JSImport("react-native-reanimated/lib/types/createAnimatedComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Component: ComponentType[InitialComponentProps]): ComponentType[AnimatedComponentProps[InitialComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedComponentProps[InitialComponentProps]]]
  inline def default(Component: ComponentType[InitialComponentProps], options: Options[InitialComponentProps]): ComponentType[AnimatedComponentProps[InitialComponentProps]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[AnimatedComponentProps[InitialComponentProps]]]
  
  type AnimatedComponentProps[P /* <: Record[String, Any] */] = P & typings.reactNativeReanimated.anon.AnimatedProps
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait AnimatedProps extends StObject {
    
    var initial: js.UndefOr[SharedValue[StyleProps]] = js.undefined
    
    var viewDescriptors: js.UndefOr[ViewDescriptorsSet] = js.undefined
    
    var viewsRef: js.UndefOr[ViewRefSet[Any]] = js.undefined
  }
  object AnimatedProps {
    
    inline def apply(): AnimatedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedProps]
    }
    
    extension [Self <: AnimatedProps](x: Self) {
      
      inline def setInitial(value: SharedValue[StyleProps]): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setViewDescriptors(value: ViewDescriptorsSet): Self = StObject.set(x, "viewDescriptors", value.asInstanceOf[js.Any])
      
      inline def setViewDescriptorsUndefined: Self = StObject.set(x, "viewDescriptors", js.undefined)
      
      inline def setViewsRef(value: ViewRefSet[Any]): Self = StObject.set(x, "viewsRef", value.asInstanceOf[js.Any])
      
      inline def setViewsRefUndefined: Self = StObject.set(x, "viewsRef", js.undefined)
    }
  }
  
  @js.native
  trait ComponentRef
    extends Component[js.Object, js.Object, Any] {
    
    var getScrollableNode: js.UndefOr[js.Function0[this.type]] = js.native
    
    var setNativeProps: js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait InitialComponentProps extends StObject {
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[Component[js.Object, js.Object, Any]]] = js.undefined
  }
  object InitialComponentProps {
    
    inline def apply(): InitialComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialComponentProps]
    }
    
    extension [Self <: InitialComponentProps](x: Self) {
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setRef(value: Ref[Component[js.Object, js.Object, Any]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ (Component[js.Object, js.Object, Any]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type NestedArray[T] = T | js.Array[Any]
  
  trait Options[P] extends StObject {
    
    def setNativeProps(ref: ComponentRef, props: P): Unit
  }
  object Options {
    
    inline def apply[P](setNativeProps: (ComponentRef, P) => Unit): Options[P] = {
      val __obj = js.Dynamic.literal(setNativeProps = js.Any.fromFunction2(setNativeProps))
      __obj.asInstanceOf[Options[P]]
    }
    
    extension [Self <: Options[?], P](x: Self & Options[P]) {
      
      inline def setSetNativeProps(value: (ComponentRef, P) => Unit): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction2(value))
    }
  }
}
