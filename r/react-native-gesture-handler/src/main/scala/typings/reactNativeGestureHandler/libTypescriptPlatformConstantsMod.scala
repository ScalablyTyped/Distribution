package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptPlatformConstantsMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/PlatformConstants", JSImport.Default)
  @js.native
  val default: PlatformConstants = js.native
  
  trait PlatformConstants extends StObject {
    
    var forceTouchAvailable: Boolean
  }
  object PlatformConstants {
    
    inline def apply(forceTouchAvailable: Boolean): PlatformConstants = {
      val __obj = js.Dynamic.literal(forceTouchAvailable = forceTouchAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformConstants]
    }
    
    extension [Self <: PlatformConstants](x: Self) {
      
      inline def setForceTouchAvailable(value: Boolean): Self = StObject.set(x, "forceTouchAvailable", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = PlatformConstants
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptPlatformConstantsMod.foo` */
  override def _to: PlatformConstants = default
}
