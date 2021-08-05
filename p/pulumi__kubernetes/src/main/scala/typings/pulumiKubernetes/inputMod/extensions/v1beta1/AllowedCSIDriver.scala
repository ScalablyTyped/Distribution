package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
  */
trait AllowedCSIDriver extends StObject {
  
  /**
    * Name is the registered name of the CSI driver
    */
  var name: Input[String]
}
object AllowedCSIDriver {
  
  inline def apply(name: Input[String]): AllowedCSIDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedCSIDriver]
  }
  
  extension [Self <: AllowedCSIDriver](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
