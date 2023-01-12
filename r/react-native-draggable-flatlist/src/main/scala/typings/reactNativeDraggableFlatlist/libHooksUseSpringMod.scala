package typings.reactNativeDraggableFlatlist

import typings.reactNativeDraggableFlatlist.anon.Clock
import typings.reactNativeDraggableFlatlist.anon.PartialSpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseSpringMod {
  
  @JSImport("react-native-draggable-flatlist/lib/hooks/useSpring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSpring(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")().asInstanceOf[Clock]
  inline def useSpring(param0: Params): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpring")(param0.asInstanceOf[js.Any]).asInstanceOf[Clock]
  
  trait Params extends StObject {
    
    var config: PartialSpringConfig
  }
  object Params {
    
    inline def apply(config: PartialSpringConfig): Params = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: PartialSpringConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
