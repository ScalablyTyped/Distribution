package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ClientIPConfig represents the configurations of Client IP based session affinity.
  */
trait ClientIPConfig extends StObject {
  
  /**
    * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
}
object ClientIPConfig {
  
  inline def apply(): ClientIPConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientIPConfig]
  }
  
  extension [Self <: ClientIPConfig](x: Self) {
    
    inline def setTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
