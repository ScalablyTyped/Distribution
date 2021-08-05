package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The node this Taint is attached to has the "effect" on any pod that does not tolerate the Taint.
  */
trait Taint extends StObject {
  
  /**
    * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: Input[String]
  
  /**
    * Required. The taint key to be applied to a node.
    */
  var key: Input[String]
  
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
    */
  var timeAdded: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The taint value corresponding to the taint key.
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object Taint {
  
  inline def apply(effect: Input[String], key: Input[String]): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taint]
  }
  
  extension [Self <: Taint](x: Self) {
    
    inline def setEffect(value: Input[String]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTimeAdded(value: Input[String]): Self = StObject.set(x, "timeAdded", value.asInstanceOf[js.Any])
    
    inline def setTimeAddedUndefined: Self = StObject.set(x, "timeAdded", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
