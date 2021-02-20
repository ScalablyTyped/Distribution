package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
  */
@js.native
trait HPAScalingPolicy extends StObject {
  
  /**
    * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
    */
  var periodSeconds: Double = js.native
  
  /**
    * Type is used to specify the scaling policy.
    */
  var `type`: String = js.native
  
  /**
    * Value contains the amount of change which is permitted by the policy. It must be greater than zero
    */
  var value: Double = js.native
}
object HPAScalingPolicy {
  
  @scala.inline
  def apply(periodSeconds: Double, `type`: String, value: Double): HPAScalingPolicy = {
    val __obj = js.Dynamic.literal(periodSeconds = periodSeconds.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPAScalingPolicy]
  }
  
  @scala.inline
  implicit class HPAScalingPolicyMutableBuilder[Self <: HPAScalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriodSeconds(value: Double): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
