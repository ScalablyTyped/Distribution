package typings.reactNativeReanimated.anon

import typings.react.mod.Ref
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryAnimationsValues
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.ExitAnimationsValues
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimation
import typings.reactNativeReanimated.createAnimatedComponentMod.AnimatedComponentProps
import typings.reactNativeReanimated.createAnimatedComponentMod.NestedArray
import typings.reactNativeReanimated.layoutReanimationMod.BaseAnimationBuilder
import typings.reactNativeReanimated.reanimated2CommonTypesMod.StyleProps
import typings.std.Keyframe
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedProps extends StObject {
  
  var animatedProps: js.UndefOr[
    Partial[
      AnimatedComponentProps[typings.reactNativeReanimated.createAnimatedComponentMod.AnimatedProps]
    ]
  ] = js.undefined
  
  var animatedStyle: js.UndefOr[StyleProps] = js.undefined
  
  var entering: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuilde | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var exiting: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuilde | EntryExitAnimationFunction | Keyframe
  ] = js.undefined
  
  var forwardedRef: js.UndefOr[Ref[typings.react.mod.Component[js.Object, js.Object, Any]]] = js.undefined
  
  var layout: js.UndefOr[BaseAnimationBuilder | ILayoutAnimationBuilder | TypeofBaseAnimationBuilde] = js.undefined
  
  var style: js.UndefOr[NestedArray[StyleProps]] = js.undefined
}
object AnimatedProps {
  
  inline def apply(): AnimatedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedProps]
  }
  
  extension [Self <: AnimatedProps](x: Self) {
    
    inline def setAnimatedProps(
      value: Partial[
          AnimatedComponentProps[typings.reactNativeReanimated.createAnimatedComponentMod.AnimatedProps]
        ]
    ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setAnimatedPropsUndefined: Self = StObject.set(x, "animatedProps", js.undefined)
    
    inline def setAnimatedStyle(value: StyleProps): Self = StObject.set(x, "animatedStyle", value.asInstanceOf[js.Any])
    
    inline def setAnimatedStyleUndefined: Self = StObject.set(x, "animatedStyle", js.undefined)
    
    inline def setEntering(value: BaseAnimationBuilder | TypeofBaseAnimationBuilde | EntryExitAnimationFunction | Keyframe): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setEnteringFunction1(value: /* targetValues */ EntryAnimationsValues | ExitAnimationsValues => LayoutAnimation): Self = StObject.set(x, "entering", js.Any.fromFunction1(value))
    
    inline def setEnteringUndefined: Self = StObject.set(x, "entering", js.undefined)
    
    inline def setExiting(value: BaseAnimationBuilder | TypeofBaseAnimationBuilde | EntryExitAnimationFunction | Keyframe): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
    
    inline def setExitingFunction1(value: /* targetValues */ EntryAnimationsValues | ExitAnimationsValues => LayoutAnimation): Self = StObject.set(x, "exiting", js.Any.fromFunction1(value))
    
    inline def setExitingUndefined: Self = StObject.set(x, "exiting", js.undefined)
    
    inline def setForwardedRef(value: Ref[typings.react.mod.Component[js.Object, js.Object, Any]]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ (typings.react.mod.Component[js.Object, js.Object, Any]) | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
    
    inline def setLayout(value: BaseAnimationBuilder | ILayoutAnimationBuilder | TypeofBaseAnimationBuilde): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setStyle(value: NestedArray[StyleProps]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Any*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
