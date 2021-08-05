package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
  */
trait VolumeNodeAffinity extends StObject {
  
  /**
    * Required specifies hard node constraints that must be met.
    */
  var required: js.UndefOr[Input[NodeSelector]] = js.undefined
}
object VolumeNodeAffinity {
  
  inline def apply(): VolumeNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeNodeAffinity]
  }
  
  extension [Self <: VolumeNodeAffinity](x: Self) {
    
    inline def setRequired(value: Input[NodeSelector]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
