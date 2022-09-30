package typings.reactNativeDraggableFlatlist

import typings.reactNativeDraggableFlatlist.anon.IsActive
import typings.reactNativeDraggableFlatlist.anon.PartialSpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnCellActiveAnimationMod {
  
  @JSImport("react-native-draggable-flatlist/lib/hooks/useOnCellActiveAnimation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOnCellActiveAnimation(): IsActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[IsActive]
  inline def useOnCellActiveAnimation(hasAnimationConfig: Params): IsActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(hasAnimationConfig.asInstanceOf[js.Any]).asInstanceOf[IsActive]
  
  trait Params extends StObject {
    
    var animationConfig: PartialSpringConfig
  }
  object Params {
    
    inline def apply(animationConfig: PartialSpringConfig): Params = {
      val __obj = js.Dynamic.literal(animationConfig = animationConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setAnimationConfig(value: PartialSpringConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    }
  }
}
