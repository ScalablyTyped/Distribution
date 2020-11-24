package typings.pulumiKubernetes.inputMod.settings.v1alpha1

import typings.pulumiKubernetes.inputMod.core.v1.EnvFromSource
import typings.pulumiKubernetes.inputMod.core.v1.EnvVar
import typings.pulumiKubernetes.inputMod.core.v1.Volume
import typings.pulumiKubernetes.inputMod.core.v1.VolumeMount
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodPresetSpec is a description of a pod preset.
  */
@js.native
trait PodPresetSpec extends js.Object {
  
  /**
    * Env defines the collection of EnvVar to inject into containers.
    */
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.native
  
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.native
  
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.native
  
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.native
}
object PodPresetSpec {
  
  @scala.inline
  def apply(): PodPresetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodPresetSpec]
  }
  
  @scala.inline
  implicit class PodPresetSpecOps[Self <: PodPresetSpec] (val x: Self) extends AnyVal {
    
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
    def setEnvVarargs(value: Input[EnvVar]*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: Input[js.Array[Input[EnvVar]]]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setEnvFromVarargs(value: Input[EnvFromSource]*): Self = this.set("envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = this.set("envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvFrom: Self = this.set("envFrom", js.undefined)
    
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setVolumeMountsVarargs(value: Input[VolumeMount]*): Self = this.set("volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = this.set("volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeMounts: Self = this.set("volumeMounts", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Input[Volume]*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: Input[js.Array[Input[Volume]]]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
}
