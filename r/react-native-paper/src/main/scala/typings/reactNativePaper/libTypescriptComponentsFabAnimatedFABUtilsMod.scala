package typings.reactNativePaper

import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsFabAnimatedFABUtilsMod {
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/AnimatedFAB/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCombinedStyles(param0: GetCombinedStylesProps): CombinedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedStyles")(param0.asInstanceOf[js.Any]).asInstanceOf[CombinedStyles]
  
  trait CombinedStyles extends StObject {
    
    var absoluteFill: WithAnimatedValue[ViewStyle]
    
    var iconWrapper: WithAnimatedValue[ViewStyle]
    
    var innerWrapper: WithAnimatedValue[ViewStyle]
  }
  object CombinedStyles {
    
    inline def apply(
      absoluteFill: WithAnimatedValue[ViewStyle],
      iconWrapper: WithAnimatedValue[ViewStyle],
      innerWrapper: WithAnimatedValue[ViewStyle]
    ): CombinedStyles = {
      val __obj = js.Dynamic.literal(absoluteFill = absoluteFill.asInstanceOf[js.Any], iconWrapper = iconWrapper.asInstanceOf[js.Any], innerWrapper = innerWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedStyles]
    }
    
    extension [Self <: CombinedStyles](x: Self) {
      
      inline def setAbsoluteFill(value: WithAnimatedValue[ViewStyle]): Self = StObject.set(x, "absoluteFill", value.asInstanceOf[js.Any])
      
      inline def setIconWrapper(value: WithAnimatedValue[ViewStyle]): Self = StObject.set(x, "iconWrapper", value.asInstanceOf[js.Any])
      
      inline def setInnerWrapper(value: WithAnimatedValue[ViewStyle]): Self = StObject.set(x, "innerWrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCombinedStylesProps extends StObject {
    
    var animFAB: Value
    
    var distance: Double
    
    var isAnimatedFromRight: Boolean
    
    var isIconStatic: Boolean
  }
  object GetCombinedStylesProps {
    
    inline def apply(animFAB: Value, distance: Double, isAnimatedFromRight: Boolean, isIconStatic: Boolean): GetCombinedStylesProps = {
      val __obj = js.Dynamic.literal(animFAB = animFAB.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], isAnimatedFromRight = isAnimatedFromRight.asInstanceOf[js.Any], isIconStatic = isIconStatic.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCombinedStylesProps]
    }
    
    extension [Self <: GetCombinedStylesProps](x: Self) {
      
      inline def setAnimFAB(value: Value): Self = StObject.set(x, "animFAB", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setIsAnimatedFromRight(value: Boolean): Self = StObject.set(x, "isAnimatedFromRight", value.asInstanceOf[js.Any])
      
      inline def setIsIconStatic(value: Boolean): Self = StObject.set(x, "isIconStatic", value.asInstanceOf[js.Any])
    }
  }
}
