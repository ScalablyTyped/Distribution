package typings.pulumiAws.managedScalingPolicyMod

import typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedScalingPolicyArgs extends js.Object {
  
  /**
    * The id of the EMR cluster
    */
  val clusterId: Input[String] = js.native
  
  /**
    * Configuration block with compute limit settings. Described below.
    */
  val computeLimits: Input[js.Array[Input[ManagedScalingPolicyComputeLimit]]] = js.native
}
object ManagedScalingPolicyArgs {
  
  @scala.inline
  def apply(clusterId: Input[String], computeLimits: Input[js.Array[Input[ManagedScalingPolicyComputeLimit]]]): ManagedScalingPolicyArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any], computeLimits = computeLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedScalingPolicyArgs]
  }
  
  @scala.inline
  implicit class ManagedScalingPolicyArgsOps[Self <: ManagedScalingPolicyArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterId(value: Input[String]): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeLimitsVarargs(value: Input[ManagedScalingPolicyComputeLimit]*): Self = this.set("computeLimits", js.Array(value :_*))
    
    @scala.inline
    def setComputeLimits(value: Input[js.Array[Input[ManagedScalingPolicyComputeLimit]]]): Self = this.set("computeLimits", value.asInstanceOf[js.Any])
  }
}
