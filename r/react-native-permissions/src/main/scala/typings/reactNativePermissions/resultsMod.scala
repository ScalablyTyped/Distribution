package typings.reactNativePermissions

import typings.reactNativePermissions.reactNativePermissionsStrings.blocked
import typings.reactNativePermissions.reactNativePermissionsStrings.denied
import typings.reactNativePermissions.reactNativePermissionsStrings.granted
import typings.reactNativePermissions.reactNativePermissionsStrings.limited
import typings.reactNativePermissions.reactNativePermissionsStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultsMod {
  
  /* Inlined std.Readonly<{ readonly UNAVAILABLE :'unavailable',  readonly BLOCKED :'blocked',  readonly DENIED :'denied',  readonly GRANTED :'granted',  readonly LIMITED :'limited'}> */
  object RESULTS {
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.BLOCKED")
    @js.native
    val BLOCKED: blocked = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.DENIED")
    @js.native
    val DENIED: denied = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.GRANTED")
    @js.native
    val GRANTED: granted = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.LIMITED")
    @js.native
    val LIMITED: limited = js.native
    
    @JSImport("react-native-permissions/dist/typescript/results", "RESULTS.UNAVAILABLE")
    @js.native
    val UNAVAILABLE: unavailable = js.native
  }
  
  /* Inlined std.Readonly<{ readonly UNAVAILABLE :'unavailable',  readonly BLOCKED :'blocked',  readonly DENIED :'denied',  readonly GRANTED :'granted',  readonly LIMITED :'limited'}> */
  @js.native
  trait ResultMap extends StObject {
    
    val BLOCKED: blocked = js.native
    
    val DENIED: denied = js.native
    
    val GRANTED: granted = js.native
    
    val LIMITED: limited = js.native
    
    val UNAVAILABLE: unavailable = js.native
  }
  object ResultMap {
    
    @scala.inline
    def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, LIMITED: limited, UNAVAILABLE: unavailable): ResultMap = {
      val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], LIMITED = LIMITED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultMap]
    }
    
    @scala.inline
    implicit class ResultMapMutableBuilder[Self <: ResultMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBLOCKED(value: blocked): Self = StObject.set(x, "BLOCKED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDENIED(value: denied): Self = StObject.set(x, "DENIED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGRANTED(value: granted): Self = StObject.set(x, "GRANTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLIMITED(value: limited): Self = StObject.set(x, "LIMITED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNAVAILABLE(value: unavailable): Self = StObject.set(x, "UNAVAILABLE", value.asInstanceOf[js.Any])
    }
  }
}
