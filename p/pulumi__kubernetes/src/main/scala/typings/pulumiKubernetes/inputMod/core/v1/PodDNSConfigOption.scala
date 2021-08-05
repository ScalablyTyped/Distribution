package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDNSConfigOption defines DNS resolver options of a pod.
  */
trait PodDNSConfigOption extends StObject {
  
  /**
    * Required.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  var value: js.UndefOr[Input[String]] = js.undefined
}
object PodDNSConfigOption {
  
  inline def apply(): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDNSConfigOption]
  }
  
  extension [Self <: PodDNSConfigOption](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
