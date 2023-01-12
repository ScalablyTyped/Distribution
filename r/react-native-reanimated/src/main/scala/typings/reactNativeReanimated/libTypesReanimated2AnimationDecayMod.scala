package typings.reactNativeReanimated

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationDecayMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/decay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDecay(userConfig: DecayConfig): Animation[DecayAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Animation[DecayAnimation]]
  inline def withDecay(userConfig: DecayConfig, callback: AnimationCallback): Animation[DecayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[DecayAnimation]]
  
  trait DecayAnimation
    extends StObject
       with Animation[DecayAnimation] {
    
    @JSName("current")
    var current_DecayAnimation: AnimatableValue
    
    var initialVelocity: Double
    
    var lastTimestamp: Timestamp
    
    var startTimestamp: Timestamp
    
    var velocity: Double
  }
  object DecayAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      current: AnimatableValue,
      initialVelocity: Double,
      lastTimestamp: Timestamp,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (DecayAnimation, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, DecayAnimation) => Unit,
      startTimestamp: Timestamp,
      velocity: Double
    ): DecayAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), current = current.asInstanceOf[js.Any], initialVelocity = initialVelocity.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), startTimestamp = startTimestamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecayAnimation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecayAnimation] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: AnimatableValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setInitialVelocity(value: Double): Self = StObject.set(x, "initialVelocity", value.asInstanceOf[js.Any])
      
      inline def setLastTimestamp(value: Timestamp): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestamp(value: Timestamp): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecayConfig extends StObject {
    
    var clamp: js.UndefOr[js.Array[Double]] = js.undefined
    
    var deceleration: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double] = js.undefined
    
    var velocityFactor: js.UndefOr[Double] = js.undefined
  }
  object DecayConfig {
    
    inline def apply(): DecayConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecayConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecayConfig] (val x: Self) extends AnyVal {
      
      inline def setClamp(value: js.Array[Double]): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setClampVarargs(value: Double*): Self = StObject.set(x, "clamp", js.Array(value*))
      
      inline def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
      
      inline def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityFactor(value: Double): Self = StObject.set(x, "velocityFactor", value.asInstanceOf[js.Any])
      
      inline def setVelocityFactorUndefined: Self = StObject.set(x, "velocityFactor", js.undefined)
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/decay.DecayAnimation, 'current'> */
  /* Inlined parent react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimationObject */
  @js.native
  trait InnerDecayAnimation
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var __prefix: js.UndefOr[String] = js.native
    
    var __suffix: js.UndefOr[String] = js.native
    
    var callback: AnimationCallback = js.native
    
    var cancelled: js.UndefOr[Boolean] = js.native
    
    var current: Double = js.native
    
    var finished: js.UndefOr[Boolean] = js.native
    
    var initialVelocity: Double = js.native
    
    var lastTimestamp: Timestamp = js.native
    
    var onFrame: js.Function2[/* animation */ DecayAnimation, /* timestamp */ Timestamp, Boolean] = js.native
    def onFrame(animation: Any, timestamp: Timestamp): Boolean = js.native
    
    var onStart: js.Function4[
        /* nextAnimation */ DecayAnimation, 
        /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/decay.DecayAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, 
        /* timestamp */ Timestamp, 
        /* previousAnimation */ DecayAnimation, 
        Unit
      ] = js.native
    def onStart(nextAnimation: Any, current: Any, timestamp: Timestamp, previousAnimation: Any): Unit = js.native
    
    var startTimestamp: Timestamp = js.native
    
    var startValue: js.UndefOr[AnimatableValue] = js.native
    
    var strippedCurrent: js.UndefOr[Double] = js.native
    
    var toValue: js.UndefOr[AnimatableValue] = js.native
    
    var velocity: Double = js.native
  }
}
