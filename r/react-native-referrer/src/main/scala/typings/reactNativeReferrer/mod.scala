package typings.reactNativeReferrer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-referrer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getReferrer(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReferrer")().asInstanceOf[js.Promise[String]]
  }
}
