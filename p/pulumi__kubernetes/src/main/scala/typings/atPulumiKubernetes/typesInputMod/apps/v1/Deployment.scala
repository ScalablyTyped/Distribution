package typings.atPulumiKubernetes.typesInputMod.apps.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.appsSlashv1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deployment enables declarative updates for Pods and ReplicaSets.
  */
trait Deployment extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[appsSlashv1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment]] = js.undefined
  /**
    * Standard object metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Specification of the desired behavior of the Deployment.
    */
  var spec: js.UndefOr[Input[DeploymentSpec]] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(
    apiVersion: Input[appsSlashv1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[DeploymentSpec] = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

