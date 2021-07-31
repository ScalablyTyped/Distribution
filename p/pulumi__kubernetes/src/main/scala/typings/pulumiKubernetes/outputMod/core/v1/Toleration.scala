package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
  */
trait Toleration extends StObject {
  
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: String
  
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
    */
  var key: String
  
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
    */
  var operator: String
  
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
    */
  var tolerationSeconds: Double
  
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
    */
  var value: String
}
object Toleration {
  
  @scala.inline
  def apply(effect: String, key: String, operator: String, tolerationSeconds: Double, value: String): Toleration = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], tolerationSeconds = tolerationSeconds.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toleration]
  }
  
  @scala.inline
  implicit class TolerationMutableBuilder[Self <: Toleration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolerationSeconds(value: Double): Self = StObject.set(x, "tolerationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
