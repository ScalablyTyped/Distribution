package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
trait SessionAffinityConfig extends StObject {
  
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  var clientIP: js.UndefOr[Input[ClientIPConfig]] = js.undefined
}
object SessionAffinityConfig {
  
  inline def apply(): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAffinityConfig]
  }
  
  extension [Self <: SessionAffinityConfig](x: Self) {
    
    inline def setClientIP(value: Input[ClientIPConfig]): Self = StObject.set(x, "clientIP", value.asInstanceOf[js.Any])
    
    inline def setClientIPUndefined: Self = StObject.set(x, "clientIP", js.undefined)
  }
}
