package typings.pulumiKubernetes.inputMod.settings.v1alpha1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
  */
trait PodPreset extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[settingsDotk8sDotioSlashv1alpha1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodPreset]] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  var spec: js.UndefOr[Input[PodPresetSpec]] = js.undefined
}

object PodPreset {
  @scala.inline
  def apply(
    apiVersion: Input[settingsDotk8sDotioSlashv1alpha1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodPreset] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[PodPresetSpec] = null
  ): PodPreset = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodPreset]
  }
}

