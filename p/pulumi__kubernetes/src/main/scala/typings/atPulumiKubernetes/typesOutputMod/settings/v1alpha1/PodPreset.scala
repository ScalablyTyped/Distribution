package typings.atPulumiKubernetes.typesOutputMod.settings.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`settingsDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
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
  val apiVersion: `settingsDOTk8sDOTio/v1alpha1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodPreset
  val metadata: ObjectMeta
  val spec: PodPresetSpec
}

object PodPreset {
  @scala.inline
  def apply(
    apiVersion: `settingsDOTk8sDOTio/v1alpha1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodPreset,
    metadata: ObjectMeta,
    spec: PodPresetSpec
  ): PodPreset = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec)
  
    __obj.asInstanceOf[PodPreset]
  }
}

