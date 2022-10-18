package typings.reactNativeDraggableFlatlist

import typings.reactNativeDraggableFlatlist.anon.OnActiveAnim
import typings.reactNativeDraggableFlatlist.anon.PartialWithSpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHooksUseOnCellActiveAnimationMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/hooks/useOnCellActiveAnimation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOnCellActiveAnimation(): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[OnActiveAnim]
  inline def useOnCellActiveAnimation(hasAnimationConfig: Params): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(hasAnimationConfig.asInstanceOf[js.Any]).asInstanceOf[OnActiveAnim]
  
  trait Params extends StObject {
    
    var animationConfig: PartialWithSpringConfig
  }
  object Params {
    
    inline def apply(animationConfig: PartialWithSpringConfig): Params = {
      val __obj = js.Dynamic.literal(animationConfig = animationConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setAnimationConfig(value: PartialWithSpringConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    }
  }
}
