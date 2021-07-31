package typings.pulumiKubernetes.outputMod.core.v1

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
  var effect: String
  
  /**
    * Required. The taint key to be applied to a node.
    */
  var key: String
  
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
    */
  var timeAdded: String
  
  /**
    * The taint value corresponding to the taint key.
    */
  var value: String
}
object Taint {
  
  @scala.inline
  def apply(effect: String, key: String, timeAdded: String, value: String): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeAdded = timeAdded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taint]
  }
  
  @scala.inline
  implicit class TaintMutableBuilder[Self <: Taint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAdded(value: String): Self = StObject.set(x, "timeAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
