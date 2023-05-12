package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.anon.Booted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildToolsGetDestinationSimulatorMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/tools/getDestinationSimulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDestinationSimulator(args: FlagsT): Booted = ^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationSimulator")(args.asInstanceOf[js.Any]).asInstanceOf[Booted]
  inline def getDestinationSimulator(args: FlagsT, fallbackSimulators: js.Array[String]): Booted = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationSimulator")(args.asInstanceOf[js.Any], fallbackSimulators.asInstanceOf[js.Any])).asInstanceOf[Booted]
  
  trait FlagsT extends StObject {
    
    var simulator: js.UndefOr[String] = js.undefined
    
    var udid: js.UndefOr[String] = js.undefined
  }
  object FlagsT {
    
    inline def apply(): FlagsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagsT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagsT] (val x: Self) extends AnyVal {
      
      inline def setSimulator(value: String): Self = StObject.set(x, "simulator", value.asInstanceOf[js.Any])
      
      inline def setSimulatorUndefined: Self = StObject.set(x, "simulator", js.undefined)
      
      inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
      
      inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
    }
  }
}
