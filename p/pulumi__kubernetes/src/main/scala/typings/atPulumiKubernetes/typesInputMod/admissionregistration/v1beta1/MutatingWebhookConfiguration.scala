package typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
  * or reject and may change the object. Deprecated in v1.16, planned for removal in v1.19. Use
  * admissionregistration.k8s.io/v1 MutatingWebhookConfiguration instead.
  */
trait MutatingWebhookConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1beta1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfiguration
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
  var webhooks: js.UndefOr[Input[js.Array[Input[MutatingWebhook]]]] = js.undefined
}

object MutatingWebhookConfiguration {
  @scala.inline
  def apply(
    apiVersion: Input[`admissionregistrationDOTk8sDOTio/v1beta1`] = null,
    kind: Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfiguration
    ] = null,
    metadata: Input[ObjectMeta] = null,
    webhooks: Input[js.Array[Input[MutatingWebhook]]] = null
  ): MutatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (webhooks != null) __obj.updateDynamic("webhooks")(webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatingWebhookConfiguration]
  }
}

