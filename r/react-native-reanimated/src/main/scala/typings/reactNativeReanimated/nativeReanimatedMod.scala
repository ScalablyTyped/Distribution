package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeReanimatedMod {
  
  object default {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/@/mocks/NativeReanimated", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getViewProp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewProp")().asInstanceOf[Unit]
    
    inline def installCoreFunctions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installCoreFunctions")().asInstanceOf[Unit]
    
    inline def makeMutable(init: Any): typings.reactNativeReanimated.mocksMutableValueMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMutable")(init.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mocksMutableValueMod.default]
    
    inline def makeRemote(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")().asInstanceOf[Unit]
    
    inline def makeShareable(worklet: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeShareable")(worklet.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def registerEventHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEventHandler")().asInstanceOf[Unit]
    
    inline def startMapper(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")().asInstanceOf[Unit]
    
    inline def stopMapper(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopMapper")().asInstanceOf[Unit]
    
    inline def unregisterEventHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterEventHandler")().asInstanceOf[Unit]
  }
}
