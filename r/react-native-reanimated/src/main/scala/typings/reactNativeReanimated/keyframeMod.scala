package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.IEntryExitAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.KeyframeProps
import typings.reactNativeReanimated.easingMod.EasingFn
import typings.reactNativeReanimated.reanimated2CommonTypesMod.StyleProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyframeMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder/Keyframe", "Keyframe")
  @js.native
  open class Keyframe protected ()
    extends StObject
       with IEntryExitAnimationBuilder {
    def this(definitions: Record[String, KeyframeProps]) = this()
    
    /* CompleteClass */
    override def build(): EntryExitAnimationFunction = js.native
    
    var callbackV: js.UndefOr[js.Function1[/* finished */ Boolean, Unit]] = js.native
    
    var definitions: Record[String, KeyframeProps] = js.native
    
    def delay(delayMs: Double): Keyframe = js.native
    
    var delayV: js.UndefOr[Double] = js.native
    
    def duration(durationMs: Double): Keyframe = js.native
    
    var durationV: js.UndefOr[Double] = js.native
    
    /* private */ var getDelayFunction: Any = js.native
    
    /* private */ var parseDefinitions: Any = js.native
    
    def withCallback(callback: js.Function1[/* finsihed */ Boolean, Unit]): Keyframe = js.native
  }
  
  trait KeyframePoint extends StObject {
    
    var duration: Double
    
    var easing: js.UndefOr[EasingFn] = js.undefined
    
    var value: Double | String
  }
  object KeyframePoint {
    
    inline def apply(duration: Double, value: Double | String): KeyframePoint = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyframePoint]
    }
    
    extension [Self <: KeyframePoint](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedKeyframesDefinition extends StObject {
    
    var initialValues: StyleProps
    
    var keyframes: Record[String, js.Array[KeyframePoint]]
  }
  object ParsedKeyframesDefinition {
    
    inline def apply(initialValues: StyleProps, keyframes: Record[String, js.Array[KeyframePoint]]): ParsedKeyframesDefinition = {
      val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedKeyframesDefinition]
    }
    
    extension [Self <: ParsedKeyframesDefinition](x: Self) {
      
      inline def setInitialValues(value: StyleProps): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setKeyframes(value: Record[String, js.Array[KeyframePoint]]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    }
  }
}
