package typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
  */
trait ValidatingWebhookConfigurationList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1beta1`]] = js.undefined
  /**
    * List of ValidatingWebhookConfiguration.
    */
  var items: Input[js.Array[Input[ValidatingWebhookConfiguration]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfigurationList
    ]
  ] = js.undefined
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object ValidatingWebhookConfigurationList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[ValidatingWebhookConfiguration]]],
    apiVersion: Input[`admissionregistrationDOTk8sDOTio/v1beta1`] = null,
    kind: Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfigurationList
    ] = null,
    metadata: Input[ListMeta] = null
  ): ValidatingWebhookConfigurationList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatingWebhookConfigurationList]
  }
}

