package typings.atPulumiKubernetes.typesOutputMod.settingsNs.v1alpha1Ns

import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.EnvFromSource
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.EnvVar
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.Volume
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.VolumeMount
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.LabelSelector
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
  val env: js.Array[EnvVar]
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  val envFrom: js.Array[EnvFromSource]
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  val selector: LabelSelector
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  val volumeMounts: js.Array[VolumeMount]
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  val volumes: js.Array[Volume]
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
    val __obj = js.Dynamic.literal(env = env, envFrom = envFrom, selector = selector, volumeMounts = volumeMounts, volumes = volumes)
  
    __obj.asInstanceOf[PodPresetSpec]
  }
}

