package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Affinity is a group of affinity scheduling rules.
  */
@js.native
trait Affinity extends js.Object {
  
  /**
    * Describes node affinity scheduling rules for the pod.
    */
  var nodeAffinity: js.UndefOr[Input[NodeAffinity]] = js.native
  
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAffinity: js.UndefOr[Input[PodAffinity]] = js.native
  
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: js.UndefOr[Input[PodAntiAffinity]] = js.native
}
object Affinity {
  
  @scala.inline
  def apply(): Affinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affinity]
  }
  
  @scala.inline
  implicit class AffinityOps[Self <: Affinity] (val x: Self) extends AnyVal {
    
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
    def setNodeAffinity(value: Input[NodeAffinity]): Self = this.set("nodeAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeAffinity: Self = this.set("nodeAffinity", js.undefined)
    
    @scala.inline
    def setPodAffinity(value: Input[PodAffinity]): Self = this.set("podAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodAffinity: Self = this.set("podAffinity", js.undefined)
    
    @scala.inline
    def setPodAntiAffinity(value: Input[PodAntiAffinity]): Self = this.set("podAntiAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodAntiAffinity: Self = this.set("podAntiAffinity", js.undefined)
  }
}
