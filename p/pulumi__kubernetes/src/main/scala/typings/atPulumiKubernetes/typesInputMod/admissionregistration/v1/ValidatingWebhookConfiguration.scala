package typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
  * accept or reject and object without changing it.
  */
trait ValidatingWebhookConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfiguration
    ]
  ] = js.undefined
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  var webhooks: js.UndefOr[Input[js.Array[Input[ValidatingWebhook]]]] = js.undefined
}

object ValidatingWebhookConfiguration {
  @scala.inline
  def apply(
    apiVersion: Input[admissionregistrationDotk8sDotioSlashv1] = null,
    kind: Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfiguration
    ] = null,
    metadata: Input[ObjectMeta] = null,
    webhooks: Input[js.Array[Input[ValidatingWebhook]]] = null
  ): ValidatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (webhooks != null) __obj.updateDynamic("webhooks")(webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatingWebhookConfiguration]
  }
}

