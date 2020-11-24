package typings.pulumiKubernetes.outputMod.settings.v1alpha1

import typings.pulumiKubernetes.outputMod.core.v1.EnvFromSource
import typings.pulumiKubernetes.outputMod.core.v1.EnvVar
import typings.pulumiKubernetes.outputMod.core.v1.Volume
import typings.pulumiKubernetes.outputMod.core.v1.VolumeMount
import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
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
  var env: js.Array[EnvVar] = js.native
  
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  var envFrom: js.Array[EnvFromSource] = js.native
  
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  var selector: LabelSelector = js.native
  
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  var volumeMounts: js.Array[VolumeMount] = js.native
  
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  var volumes: js.Array[Volume] = js.native
}
object PodPresetSpec {
  
  @scala.inline
  def apply(
    env: js.Array[EnvVar],
    envFrom: js.Array[EnvFromSource],
    selector: LabelSelector,
    volumeMounts: js.Array[VolumeMount],
    volumes: js.Array[Volume]
  ): PodPresetSpec = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
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
    def setEnvVarargs(value: EnvVar*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[EnvVar]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFromVarargs(value: EnvFromSource*): Self = this.set("envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvFrom(value: js.Array[EnvFromSource]): Self = this.set("envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: LabelSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMountsVarargs(value: VolumeMount*): Self = this.set("volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: js.Array[VolumeMount]): Self = this.set("volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
  }
}
