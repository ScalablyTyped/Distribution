package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
  */
@js.native
trait Toleration extends StObject {
  
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
    */
  var key: js.UndefOr[Input[String]] = js.native
  
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
    */
  var operator: js.UndefOr[Input[String]] = js.native
  
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
    */
  var tolerationSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
    */
  var value: js.UndefOr[Input[String]] = js.native
}
object Toleration {
  
  @scala.inline
  def apply(): Toleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toleration]
  }
  
  @scala.inline
  implicit class TolerationMutableBuilder[Self <: Toleration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: Input[String]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setTolerationSeconds(value: Input[Double]): Self = StObject.set(x, "tolerationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolerationSecondsUndefined: Self = StObject.set(x, "tolerationSeconds", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
