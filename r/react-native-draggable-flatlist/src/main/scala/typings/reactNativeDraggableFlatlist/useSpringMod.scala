package typings.reactNativeDraggableFlatlist

import typings.reactNativeDraggableFlatlist.anon.Clock
import typings.reactNativeDraggableFlatlist.anon.PartialSpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSpringMod {
  
  @JSImport("react-native-draggable-flatlist/lib/hooks/useSpring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSpring(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")().asInstanceOf[Clock]
  inline def useSpring(hasConfigParam: Params): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(hasConfigParam.asInstanceOf[js.Any]).asInstanceOf[Clock]
  
  trait Params extends StObject {
    
    var config: PartialSpringConfig
  }
  object Params {
    
    inline def apply(config: PartialSpringConfig): Params = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setConfig(value: PartialSpringConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
