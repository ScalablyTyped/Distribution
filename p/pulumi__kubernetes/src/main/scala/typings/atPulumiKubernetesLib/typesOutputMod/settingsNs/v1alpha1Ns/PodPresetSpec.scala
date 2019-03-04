package typings
package atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodPresetSpec is a description of a pod preset.
  */
trait PodPresetSpec extends js.Object {
  /**
    * Env defines the collection of EnvVar to inject into containers.
    */
  val env: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EnvVar]
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  val envFrom: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EnvFromSource]
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  val volumeMounts: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.VolumeMount]
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  val volumes: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Volume]
}

object PodPresetSpec {
  @scala.inline
  def apply(
    env: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EnvVar],
    envFrom: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EnvFromSource],
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector,
    volumeMounts: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.VolumeMount],
    volumes: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Volume]
  ): PodPresetSpec = {
    val __obj = js.Dynamic.literal(env = env, envFrom = envFrom, selector = selector, volumeMounts = volumeMounts, volumes = volumes)
  
    __obj.asInstanceOf[PodPresetSpec]
  }
}

