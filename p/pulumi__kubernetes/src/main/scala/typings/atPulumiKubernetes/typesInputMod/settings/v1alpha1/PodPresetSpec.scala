package typings.atPulumiKubernetes.typesInputMod.settings.v1alpha1

import typings.atPulumiKubernetes.typesInputMod.core.v1.EnvFromSource
import typings.atPulumiKubernetes.typesInputMod.core.v1.EnvVar
import typings.atPulumiKubernetes.typesInputMod.core.v1.Volume
import typings.atPulumiKubernetes.typesInputMod.core.v1.VolumeMount
import typings.atPulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typings.atPulumiPulumi.outputMod.Input
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
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.undefined
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.undefined
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.undefined
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.undefined
}

object PodPresetSpec {
  @scala.inline
  def apply(
    env: Input[js.Array[Input[EnvVar]]] = null,
    envFrom: Input[js.Array[Input[EnvFromSource]]] = null,
    selector: Input[LabelSelector] = null,
    volumeMounts: Input[js.Array[Input[VolumeMount]]] = null,
    volumes: Input[js.Array[Input[Volume]]] = null
  ): PodPresetSpec = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envFrom != null) __obj.updateDynamic("envFrom")(envFrom.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (volumeMounts != null) __obj.updateDynamic("volumeMounts")(volumeMounts.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodPresetSpec]
  }
}

