package typings.reactNativeUuidGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-uuid-generator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getRandomUUID(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomUUID")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getRandomUUID(callback: js.Function1[/* uuid */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomUUID")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
