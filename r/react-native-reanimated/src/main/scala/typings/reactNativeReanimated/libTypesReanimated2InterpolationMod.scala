package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2InterpolationMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/interpolation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Extrapolation
    extends StObject
       with _ExtrapolationType
  @JSImport("react-native-reanimated/lib/types/reanimated2/interpolation", "Extrapolation")
  @js.native
  object Extrapolation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Extrapolation & String] = js.native
    
    @js.native
    sealed trait CLAMP
      extends StObject
         with Extrapolation
    /* "clamp" */ val CLAMP: typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.Extrapolation.CLAMP & String = js.native
    
    @js.native
    sealed trait EXTEND
      extends StObject
         with Extrapolation
    /* "extend" */ val EXTEND: typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.Extrapolation.EXTEND & String = js.native
    
    @js.native
    sealed trait IDENTITY
      extends StObject
         with Extrapolation
    /* "identity" */ val IDENTITY: typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.Extrapolation.IDENTITY & String = js.native
  }
  
  inline def interpolate(x: Double, input: js.Array[Double], output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def interpolate(x: Double, input: js.Array[Double], output: js.Array[Double], `type`: ExtrapolationType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def interpolate(x: InterpolatedNode, input: js.Array[Double], output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def interpolate(x: InterpolatedNode, input: js.Array[Double], output: js.Array[Double], `type`: ExtrapolationType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait ExtrapolationConfig
    extends StObject
       with _ExtrapolationType {
    
    var extrapolateLeft: js.UndefOr[Extrapolation | String] = js.undefined
    
    var extrapolateRight: js.UndefOr[Extrapolation | String] = js.undefined
  }
  object ExtrapolationConfig {
    
    inline def apply(): ExtrapolationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtrapolationConfig]
    }
    
    extension [Self <: ExtrapolationConfig](x: Self) {
      
      inline def setExtrapolateLeft(value: Extrapolation | String): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
      
      inline def setExtrapolateRight(value: Extrapolation | String): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.ExtrapolationConfig
    - typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.Extrapolation
    - java.lang.String
    - scala.Unit
  */
  type ExtrapolationType = js.UndefOr[_ExtrapolationType | String]
  
  trait InterpolatedNode extends StObject {
    
    var __nodeId: Double
  }
  object InterpolatedNode {
    
    inline def apply(__nodeId: Double): InterpolatedNode = {
      val __obj = js.Dynamic.literal(__nodeId = __nodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolatedNode]
    }
    
    extension [Self <: InterpolatedNode](x: Self) {
      
      inline def set__nodeId(value: Double): Self = StObject.set(x, "__nodeId", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExtrapolationType extends StObject
}
