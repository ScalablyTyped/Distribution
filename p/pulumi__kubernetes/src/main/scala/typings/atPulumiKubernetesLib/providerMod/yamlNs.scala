package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "yaml")
@js.native
object yamlNs extends js.Object {
  @js.native
  abstract class CollectionComponentResource protected ()
    extends atPulumiPulumiLib.pulumiMod.ComponentResource {
    def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any) = this()
    def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    var getResourceImpl: js.Any = js.native
    var resources: atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.CustomResource]
      ] = js.native
    /**
             * getCustomResource returns a resource defined by a CRD with the given group/version/kind and name.
             *
             * For example:
             *     getCustomResource("monitoring.coreos.com/v1/ServiceMonitor", "kube-prometheus-exporter-kubernetes")
             */
    def getCustomResource[T /* <: atPulumiPulumiLib.pulumiMod.CustomResource */](groupVersionKind: java.lang.String, namespace: java.lang.String): atPulumiPulumiLib.pulumiMod.Output[T] = js.native
    def getCustomResource[T /* <: atPulumiPulumiLib.pulumiMod.CustomResource */](groupVersionKind: java.lang.String, namespace: java.lang.String, name: java.lang.String): atPulumiPulumiLib.pulumiMod.Output[T] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    /**
             * getResourceProperty returns a single property of a resource defined by a built-in Kubernetes group/version/kind and name.
             *
             * For example:
             *     getResourceProperty("v1/Service", "nginx", "spec")
             */
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.initializers
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns.Initializer
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.initializers
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns.Initializer
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.Webhook]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.Webhook]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.Webhook]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.webhooks
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.Webhook]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIService]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ControllerRevision]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ControllerRevision]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ControllerRevision]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ControllerRevision]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rollback_to
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.RollbackConfig] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.updated_annotations
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rollback_to
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.RollbackConfig] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.updated_annotations
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ControllerRevision]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ControllerRevision]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.revision
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSink]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSink]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSinkSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSinkSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns.TokenReviewStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns.TokenReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectRulesReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectRulesReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectRulesReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectRulesReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectRulesReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectRulesReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.Job]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.Job]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJob]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJob]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns.CronJobStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJob]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJob]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns.CronJobStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[
          atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
        ]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestSpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.Lease]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.Lease]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.LeaseSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.LeaseSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.field_path
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.namespace
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.resource_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.uid
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.field_path
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.namespace
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.resource_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.uid
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.Event]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.Event]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_count
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_first_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_last_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_source
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.note
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.regarding
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_controller
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.EventSeries] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_count
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_first_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_last_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.deprecated_source
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.note
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.regarding
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_controller
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.EventSeries] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Deployment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rollback_to
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.RollbackConfig] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.updated_annotations
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rollback_to
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.RollbackConfig] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.updated_annotations
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Ingress]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Ingress]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicy]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicy]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicySpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicySpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicySpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicySpec
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSet]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ScaleSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ScaleStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.block_owner_deletion
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.controller
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.uid
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.block_owner_deletion
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.controller
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.uid
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicy]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicy]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicySpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns.NetworkPolicySpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.delete_options
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.DeleteOptions] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.delete_options
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.DeleteOptions] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudget]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudget]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicy]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicy]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicySpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicySpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.namespace
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.namespace
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRole]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRole]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.AggregationRule] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.AggregationRule] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Role]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Role]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRole]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRole]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.AggregationRule] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.AggregationRule] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Role]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Role]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRoleBinding]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRoleBinding]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRole]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRole]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.AggregationRule] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.aggregation_rule
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.AggregationRule] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleBinding]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.role_ref
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subjects
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Role]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Role]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.rules
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1alpha1Ns.PriorityClass]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1alpha1Ns.PriorityClass]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1beta1Ns.PriorityClass]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1beta1Ns.PriorityClass]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.description
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.global_default
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.value
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPreset]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPreset]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPresetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.settingsNs.v1alpha1Ns.PodPresetSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.StorageClass]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.StorageClass]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachment]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns.VolumeAttachmentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachment]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachment]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1alpha1Ns.VolumeAttachmentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.StorageClass]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.StorageClass]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allow_volume_expansion
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.allowed_topologies
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.mount_options
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.parameters
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.provisioner
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reclaim_policy
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.volume_binding_mode
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachment]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachment]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns.VolumeAttachmentStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.groups
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.APIGroup]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.groups
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.APIGroup]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preferred_version
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.GroupVersionForDiscovery] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.server_address_by_client_cid_rs
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ServerAddressByClientCIDR]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.versions
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.GroupVersionForDiscovery]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.name
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preferred_version
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.GroupVersionForDiscovery] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.server_address_by_client_cid_rs
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ServerAddressByClientCIDR]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.versions
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.GroupVersionForDiscovery]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.group_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.resources
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.APIResource]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.group_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.resources
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.APIResource]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.server_address_by_client_cid_rs
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ServerAddressByClientCIDR]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.versions
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.server_address_by_client_cid_rs
    ): atPulumiPulumiLib.pulumiMod.Output[
        js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ServerAddressByClientCIDR]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.versions
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.target
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.target
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentStatus]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentStatus]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.conditions
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentCondition]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.conditions
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentCondition]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ConfigMap]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ConfigMap]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.binary_data
    ): atPulumiPulumiLib.pulumiMod.Output[js.Object] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.binary_data
    ): atPulumiPulumiLib.pulumiMod.Output[js.Object] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.dry_run
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.grace_period_seconds
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.orphan_dependents
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preconditions
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.Preconditions] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.propagation_policy
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.dry_run
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.grace_period_seconds
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.orphan_dependents
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.preconditions
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.Preconditions] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.propagation_policy
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Endpoints]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Endpoints]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subsets
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EndpointSubset]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.subsets
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EndpointSubset]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Event]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Event]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.count
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.first_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.involved_object
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.last_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_component
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSeries] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.source
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.action
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.count
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.event_time
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.first_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.involved_object
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.last_timestamp
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.related
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_component
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reporting_instance
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.series
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSeries] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.source
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRange]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRange]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRangeSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRangeSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Namespace]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Namespace]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Node]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Node]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolume]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolume]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Pod]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Pod]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplate]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplate]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.template
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.template
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationController]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationController]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuota]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuota]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Secret]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Secret]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[js.Object] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.string_data
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`type`
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.data
    ): atPulumiPulumiLib.pulumiMod.Output[js.Object] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.string_data
    ): atPulumiPulumiLib.pulumiMod.Output[
        ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
      ] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceAccount]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceAccount]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.automount_service_account_token
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.image_pull_secrets
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LocalObjectReference]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.secrets
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.automount_service_account_token
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.image_pull_secrets
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LocalObjectReference]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.secrets
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Service]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.items
    ): atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Service]] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.spec
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceSpec] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceStatus] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.code
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.details
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.StatusDetails] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.api_version
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.code
    ): atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.details
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.StatusDetails] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.kind
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.message
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.metadata
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.reason
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    def getResourceProperty(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String,
      property: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.status
    ): atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
    /**
             * getResource returns a resource defined by a built-in Kubernetes group/version/kind and name.
             *
             * For example:
             *     getResource("apps/v1/Deployment", "nginx")
             */
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1alpha1/InitializerConfiguration`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1alpha1/InitializerConfiguration`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1alpha1/InitializerConfigurationList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1alpha1/InitializerConfigurationList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1/InitializerConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/MutatingWebhookConfiguration`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/MutatingWebhookConfiguration`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/MutatingWebhookConfigurationList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/MutatingWebhookConfigurationList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/MutatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/ValidatingWebhookConfiguration`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/ValidatingWebhookConfiguration`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfiguration`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/ValidatingWebhookConfigurationList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList
      ] = js.native
    @JSName("getResource")
    def `getResource_admissionregistrationk8sio/v1beta1/ValidatingWebhookConfigurationList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1/ValidatingWebhookConfigurationList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList
      ] = js.native
    @JSName("getResource")
    def `getResource_apiextensionsk8sio/v1beta1/CustomResourceDefinition`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
      ] = js.native
    @JSName("getResource")
    def `getResource_apiextensionsk8sio/v1beta1/CustomResourceDefinition`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinition`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
      ] = js.native
    @JSName("getResource")
    def `getResource_apiextensionsk8sio/v1beta1/CustomResourceDefinitionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList
      ] = js.native
    @JSName("getResource")
    def `getResource_apiextensionsk8sio/v1beta1/CustomResourceDefinitionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1/CustomResourceDefinitionList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList
      ] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1beta1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1beta1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1beta1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistration/v1beta1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistration/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1beta1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1beta1/APIService`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIService`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1beta1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apiregistrationk8sio/v1beta1/APIServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1beta1/APIServiceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ControllerRevision`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevision] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ControllerRevision`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevision] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ControllerRevisionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevisionList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ControllerRevisionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevisionList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/DaemonSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/DaemonSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/DaemonSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/DaemonSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ReplicaSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ReplicaSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ReplicaSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/ReplicaSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/StatefulSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/StatefulSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/StatefulSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1/StatefulSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/ControllerRevision`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevision] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/ControllerRevision`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevision] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/ControllerRevisionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevisionList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/ControllerRevisionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevisionList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/DeploymentRollback`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentRollback] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/DeploymentRollback`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentRollback] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/StatefulSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/StatefulSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/StatefulSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta1/StatefulSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta1/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ControllerRevision`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevision] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ControllerRevision`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevision`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevision] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ControllerRevisionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevisionList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ControllerRevisionList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ControllerRevisionList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevisionList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/DaemonSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/DaemonSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/DaemonSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/DaemonSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ReplicaSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ReplicaSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ReplicaSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/ReplicaSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/Scale`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/StatefulSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/StatefulSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSet] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/StatefulSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSetList] = js.native
    @JSName("getResource")
    def `getResource_apps/v1beta2/StatefulSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2/StatefulSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSetList] = js.native
    @JSName("getResource")
    def `getResource_auditregistrationk8sio/v1alpha1/AuditSink`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSink] = js.native
    @JSName("getResource")
    def `getResource_auditregistrationk8sio/v1alpha1/AuditSink`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSink`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSink] = js.native
    @JSName("getResource")
    def `getResource_auditregistrationk8sio/v1alpha1/AuditSinkList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSinkList] = js.native
    @JSName("getResource")
    def `getResource_auditregistrationk8sio/v1alpha1/AuditSinkList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1/AuditSinkList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSinkList] = js.native
    @JSName("getResource")
    def `getResource_authenticationk8sio/v1/TokenReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authenticationNs.v1Ns.TokenReview] = js.native
    @JSName("getResource")
    def `getResource_authenticationk8sio/v1/TokenReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authenticationNs.v1Ns.TokenReview] = js.native
    @JSName("getResource")
    def `getResource_authenticationk8sio/v1beta1/TokenReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authenticationNs.v1beta1Ns.TokenReview] = js.native
    @JSName("getResource")
    def `getResource_authenticationk8sio/v1beta1/TokenReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authenticationDOTk8sDOTio/v1beta1/TokenReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authenticationNs.v1beta1Ns.TokenReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/LocalSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.LocalSubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/LocalSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.LocalSubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/SelfSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/SelfSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/SelfSubjectRulesReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectRulesReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/SelfSubjectRulesReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectRulesReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/SubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1/SubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/LocalSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview
      ] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/LocalSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/LocalSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview
      ] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/SelfSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview
      ] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/SelfSubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview
      ] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/SelfSubjectRulesReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview
      ] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/SelfSubjectRulesReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SelfSubjectRulesReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview
      ] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/SubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_authorizationk8sio/v1beta1/SubjectAccessReview`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1/SubjectAccessReview`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SubjectAccessReview] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/CrossVersionObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.CrossVersionObjectReference] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/CrossVersionObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.CrossVersionObjectReference] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/HorizontalPodAutoscaler`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/HorizontalPodAutoscaler`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/HorizontalPodAutoscalerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/HorizontalPodAutoscalerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v1/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta1/CrossVersionObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.CrossVersionObjectReference
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta1/CrossVersionObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.CrossVersionObjectReference
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta1/HorizontalPodAutoscaler`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta1/HorizontalPodAutoscaler`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta1/HorizontalPodAutoscalerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta1/HorizontalPodAutoscalerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta2/CrossVersionObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.CrossVersionObjectReference
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta2/CrossVersionObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/CrossVersionObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.CrossVersionObjectReference
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta2/HorizontalPodAutoscaler`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta2/HorizontalPodAutoscaler`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscaler`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta2/HorizontalPodAutoscalerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList
      ] = js.native
    @JSName("getResource")
    def `getResource_autoscaling/v2beta2/HorizontalPodAutoscalerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2/HorizontalPodAutoscalerList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList
      ] = js.native
    @JSName("getResource")
    def `getResource_batch/v1/Job`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1Ns.Job] = js.native
    @JSName("getResource")
    def `getResource_batch/v1/Job`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/Job`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1Ns.Job] = js.native
    @JSName("getResource")
    def `getResource_batch/v1/JobList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1Ns.JobList] = js.native
    @JSName("getResource")
    def `getResource_batch/v1/JobList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1/JobList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1Ns.JobList] = js.native
    @JSName("getResource")
    def `getResource_batch/v1beta1/CronJob`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1beta1Ns.CronJob] = js.native
    @JSName("getResource")
    def `getResource_batch/v1beta1/CronJob`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1beta1Ns.CronJob] = js.native
    @JSName("getResource")
    def `getResource_batch/v1beta1/CronJobList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1beta1Ns.CronJobList] = js.native
    @JSName("getResource")
    def `getResource_batch/v1beta1/CronJobList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v1beta1Ns.CronJobList] = js.native
    @JSName("getResource")
    def `getResource_batch/v2alpha1/CronJob`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v2alpha1Ns.CronJob] = js.native
    @JSName("getResource")
    def `getResource_batch/v2alpha1/CronJob`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJob`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v2alpha1Ns.CronJob] = js.native
    @JSName("getResource")
    def `getResource_batch/v2alpha1/CronJobList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v2alpha1Ns.CronJobList] = js.native
    @JSName("getResource")
    def `getResource_batch/v2alpha1/CronJobList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1/CronJobList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.batchNs.v2alpha1Ns.CronJobList] = js.native
    @JSName("getResource")
    def `getResource_certificatesk8sio/v1beta1/CertificateSigningRequest`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
      ] = js.native
    @JSName("getResource")
    def `getResource_certificatesk8sio/v1beta1/CertificateSigningRequest`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequest`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
      ] = js.native
    @JSName("getResource")
    def `getResource_certificatesk8sio/v1beta1/CertificateSigningRequestList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList
      ] = js.native
    @JSName("getResource")
    def `getResource_certificatesk8sio/v1beta1/CertificateSigningRequestList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1/CertificateSigningRequestList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[
        atPulumiKubernetesLib.providerMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList
      ] = js.native
    @JSName("getResource")
    def `getResource_coordinationk8sio/v1beta1/Lease`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.Lease] = js.native
    @JSName("getResource")
    def `getResource_coordinationk8sio/v1beta1/Lease`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/Lease`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.Lease] = js.native
    @JSName("getResource")
    def `getResource_coordinationk8sio/v1beta1/LeaseList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.LeaseList] = js.native
    @JSName("getResource")
    def `getResource_coordinationk8sio/v1beta1/LeaseList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1beta1/LeaseList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.LeaseList] = js.native
    @JSName("getResource")
    def `getResource_core/v1/ObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ObjectReference] = js.native
    @JSName("getResource")
    def `getResource_core/v1/ObjectReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`core/v1/ObjectReference`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ObjectReference] = js.native
    @JSName("getResource")
    def `getResource_eventsk8sio/v1beta1/Event`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.Event] = js.native
    @JSName("getResource")
    def `getResource_eventsk8sio/v1beta1/Event`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/Event`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.Event] = js.native
    @JSName("getResource")
    def `getResource_eventsk8sio/v1beta1/EventList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.EventList] = js.native
    @JSName("getResource")
    def `getResource_eventsk8sio/v1beta1/EventList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.EventList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DaemonSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSet] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DaemonSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSet] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DaemonSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSetList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DaemonSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DaemonSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSetList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/Deployment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Deployment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Deployment] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DeploymentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DeploymentRollback`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentRollback] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/DeploymentRollback`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/DeploymentRollback`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentRollback] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/Ingress`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Ingress] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/Ingress`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Ingress`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Ingress] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/IngressList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.IngressList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/IngressList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/IngressList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.IngressList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/NetworkPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicy] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/NetworkPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicy] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/NetworkPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicyList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/NetworkPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicyList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/PodSecurityPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicy] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/PodSecurityPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicy] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/PodSecurityPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/PodSecurityPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/ReplicaSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSet] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/ReplicaSet`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSet`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSet] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/ReplicaSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSetList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/ReplicaSetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/ReplicaSetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSetList] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_extensions/v1beta1/Scale`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1/Scale`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Scale] = js.native
    @JSName("getResource")
    def `getResource_meta/v1/OwnerReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.OwnerReference] = js.native
    @JSName("getResource")
    def `getResource_meta/v1/OwnerReference`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`meta/v1/OwnerReference`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.OwnerReference] = js.native
    @JSName("getResource")
    def `getResource_networkingk8sio/v1/NetworkPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.networkingNs.v1Ns.NetworkPolicy] = js.native
    @JSName("getResource")
    def `getResource_networkingk8sio/v1/NetworkPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicy`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.networkingNs.v1Ns.NetworkPolicy] = js.native
    @JSName("getResource")
    def `getResource_networkingk8sio/v1/NetworkPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.networkingNs.v1Ns.NetworkPolicyList] = js.native
    @JSName("getResource")
    def `getResource_networkingk8sio/v1/NetworkPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1/NetworkPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.networkingNs.v1Ns.NetworkPolicyList] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/Eviction`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.Eviction] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/Eviction`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/Eviction`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.Eviction] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodDisruptionBudget`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodDisruptionBudget`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudget`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodDisruptionBudgetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodDisruptionBudgetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodDisruptionBudgetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodSecurityPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodSecurityPolicy`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicy`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodSecurityPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList] = js.native
    @JSName("getResource")
    def `getResource_policy/v1beta1/PodSecurityPolicyList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1/PodSecurityPolicyList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList] = js.native
    @JSName("getResource")
    def `getResource_rbac/v1alpha1/Subject`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Subject] = js.native
    @JSName("getResource")
    def `getResource_rbac/v1alpha1/Subject`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbac/v1alpha1/Subject`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Subject] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRole`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRole] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRole`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRole] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/ClusterRoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/Role`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.Role] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/Role`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/Role`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.Role] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/RoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/RoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/RoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/RoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/RoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1/RoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRole`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRole] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRole`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRole] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/ClusterRoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/Role`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Role] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/Role`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/Role`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Role] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/RoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/RoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/RoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/RoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/RoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1alpha1/RoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRole`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRole] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRole`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRole`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRole] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/ClusterRoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/ClusterRoleList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/Role`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.Role] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/Role`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/Role`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.Role] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/RoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/RoleBinding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBinding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBinding] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/RoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/RoleBindingList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleBindingList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBindingList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/RoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleList] = js.native
    @JSName("getResource")
    def `getResource_rbacauthorizationk8sio/v1beta1/RoleList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1/RoleList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleList] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1alpha1/PriorityClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClass] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1alpha1/PriorityClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClass] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1alpha1/PriorityClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClassList] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1alpha1/PriorityClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClassList] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1beta1/PriorityClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClass] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1beta1/PriorityClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClass`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClass] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1beta1/PriorityClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClassList] = js.native
    @JSName("getResource")
    def `getResource_schedulingk8sio/v1beta1/PriorityClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1/PriorityClassList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClassList] = js.native
    @JSName("getResource")
    def `getResource_settingsk8sio/v1alpha1/PodPreset`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPreset] = js.native
    @JSName("getResource")
    def `getResource_settingsk8sio/v1alpha1/PodPreset`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPreset`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPreset] = js.native
    @JSName("getResource")
    def `getResource_settingsk8sio/v1alpha1/PodPresetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPresetList] = js.native
    @JSName("getResource")
    def `getResource_settingsk8sio/v1alpha1/PodPresetList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`settingsDOTk8sDOTio/v1alpha1/PodPresetList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPresetList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/StorageClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClass] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/StorageClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClass] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/StorageClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClassList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/StorageClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.StorageClassList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/VolumeAttachment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachment] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/VolumeAttachment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachment] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/VolumeAttachmentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachmentList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1/VolumeAttachmentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1Ns.VolumeAttachmentList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1alpha1/VolumeAttachment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachment] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1alpha1/VolumeAttachment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachment] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1alpha1/VolumeAttachmentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachmentList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1alpha1/VolumeAttachmentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1alpha1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1alpha1Ns.VolumeAttachmentList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/StorageClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClass] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/StorageClass`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClass`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClass] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/StorageClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClassList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/StorageClassList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/StorageClassList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.StorageClassList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/VolumeAttachment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachment] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/VolumeAttachment`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachment`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachment] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/VolumeAttachmentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachmentList] = js.native
    @JSName("getResource")
    def `getResource_storagek8sio/v1beta1/VolumeAttachmentList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1/VolumeAttachmentList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.storageNs.v1beta1Ns.VolumeAttachmentList] = js.native
    @JSName("getResource")
    def `getResource_v1/APIGroup`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroup] = js.native
    @JSName("getResource")
    def `getResource_v1/APIGroup`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroup`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroup] = js.native
    @JSName("getResource")
    def `getResource_v1/APIGroupList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroupList] = js.native
    @JSName("getResource")
    def `getResource_v1/APIGroupList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIGroupList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroupList] = js.native
    @JSName("getResource")
    def `getResource_v1/APIResourceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIResourceList] = js.native
    @JSName("getResource")
    def `getResource_v1/APIResourceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIResourceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIResourceList] = js.native
    @JSName("getResource")
    def `getResource_v1/APIVersions`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIVersions] = js.native
    @JSName("getResource")
    def `getResource_v1/APIVersions`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/APIVersions`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIVersions] = js.native
    @JSName("getResource")
    def `getResource_v1/Binding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Binding] = js.native
    @JSName("getResource")
    def `getResource_v1/Binding`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Binding`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Binding] = js.native
    @JSName("getResource")
    def `getResource_v1/ComponentStatus`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatus] = js.native
    @JSName("getResource")
    def `getResource_v1/ComponentStatus`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatus`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatus] = js.native
    @JSName("getResource")
    def `getResource_v1/ComponentStatusList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatusList] = js.native
    @JSName("getResource")
    def `getResource_v1/ComponentStatusList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ComponentStatusList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatusList] = js.native
    @JSName("getResource")
    def `getResource_v1/ConfigMap`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMap] = js.native
    @JSName("getResource")
    def `getResource_v1/ConfigMap`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMap`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMap] = js.native
    @JSName("getResource")
    def `getResource_v1/ConfigMapList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMapList] = js.native
    @JSName("getResource")
    def `getResource_v1/ConfigMapList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ConfigMapList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMapList] = js.native
    @JSName("getResource")
    def `getResource_v1/DeleteOptions`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.DeleteOptions] = js.native
    @JSName("getResource")
    def `getResource_v1/DeleteOptions`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/DeleteOptions`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.DeleteOptions] = js.native
    @JSName("getResource")
    def `getResource_v1/Endpoints`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Endpoints] = js.native
    @JSName("getResource")
    def `getResource_v1/Endpoints`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Endpoints`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Endpoints] = js.native
    @JSName("getResource")
    def `getResource_v1/EndpointsList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EndpointsList] = js.native
    @JSName("getResource")
    def `getResource_v1/EndpointsList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EndpointsList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EndpointsList] = js.native
    @JSName("getResource")
    def `getResource_v1/Event`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Event] = js.native
    @JSName("getResource")
    def `getResource_v1/Event`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Event`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Event] = js.native
    @JSName("getResource")
    def `getResource_v1/EventList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EventList] = js.native
    @JSName("getResource")
    def `getResource_v1/EventList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/EventList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EventList] = js.native
    @JSName("getResource")
    def `getResource_v1/LimitRange`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRange] = js.native
    @JSName("getResource")
    def `getResource_v1/LimitRange`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRange`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRange] = js.native
    @JSName("getResource")
    def `getResource_v1/LimitRangeList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRangeList] = js.native
    @JSName("getResource")
    def `getResource_v1/LimitRangeList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/LimitRangeList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRangeList] = js.native
    @JSName("getResource")
    def `getResource_v1/Namespace`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Namespace] = js.native
    @JSName("getResource")
    def `getResource_v1/Namespace`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Namespace`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Namespace] = js.native
    @JSName("getResource")
    def `getResource_v1/NamespaceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NamespaceList] = js.native
    @JSName("getResource")
    def `getResource_v1/NamespaceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NamespaceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NamespaceList] = js.native
    @JSName("getResource")
    def `getResource_v1/Node`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Node] = js.native
    @JSName("getResource")
    def `getResource_v1/Node`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Node`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Node] = js.native
    @JSName("getResource")
    def `getResource_v1/NodeList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeList] = js.native
    @JSName("getResource")
    def `getResource_v1/NodeList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/NodeList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeList] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolume`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolume] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolume`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolume`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolume] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolumeClaim`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaim] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolumeClaim`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaim`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaim] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolumeClaimList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaimList] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolumeClaimList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeClaimList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaimList] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolumeList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeList] = js.native
    @JSName("getResource")
    def `getResource_v1/PersistentVolumeList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PersistentVolumeList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeList] = js.native
    @JSName("getResource")
    def `getResource_v1/Pod`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Pod] = js.native
    @JSName("getResource")
    def `getResource_v1/Pod`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Pod`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Pod] = js.native
    @JSName("getResource")
    def `getResource_v1/PodList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodList] = js.native
    @JSName("getResource")
    def `getResource_v1/PodList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodList] = js.native
    @JSName("getResource")
    def `getResource_v1/PodTemplate`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplate] = js.native
    @JSName("getResource")
    def `getResource_v1/PodTemplate`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplate`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplate] = js.native
    @JSName("getResource")
    def `getResource_v1/PodTemplateList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplateList] = js.native
    @JSName("getResource")
    def `getResource_v1/PodTemplateList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/PodTemplateList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplateList] = js.native
    @JSName("getResource")
    def `getResource_v1/ReplicationController`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationController] = js.native
    @JSName("getResource")
    def `getResource_v1/ReplicationController`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationController`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationController] = js.native
    @JSName("getResource")
    def `getResource_v1/ReplicationControllerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationControllerList] = js.native
    @JSName("getResource")
    def `getResource_v1/ReplicationControllerList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ReplicationControllerList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationControllerList] = js.native
    @JSName("getResource")
    def `getResource_v1/ResourceQuota`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuota] = js.native
    @JSName("getResource")
    def `getResource_v1/ResourceQuota`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuota`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuota] = js.native
    @JSName("getResource")
    def `getResource_v1/ResourceQuotaList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuotaList] = js.native
    @JSName("getResource")
    def `getResource_v1/ResourceQuotaList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ResourceQuotaList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuotaList] = js.native
    @JSName("getResource")
    def `getResource_v1/Secret`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Secret] = js.native
    @JSName("getResource")
    def `getResource_v1/Secret`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Secret`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Secret] = js.native
    @JSName("getResource")
    def `getResource_v1/SecretList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.SecretList] = js.native
    @JSName("getResource")
    def `getResource_v1/SecretList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/SecretList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.SecretList] = js.native
    @JSName("getResource")
    def `getResource_v1/Service`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Service] = js.native
    @JSName("getResource")
    def `getResource_v1/Service`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Service`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Service] = js.native
    @JSName("getResource")
    def `getResource_v1/ServiceAccount`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccount] = js.native
    @JSName("getResource")
    def `getResource_v1/ServiceAccount`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccount`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccount] = js.native
    @JSName("getResource")
    def `getResource_v1/ServiceAccountList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccountList] = js.native
    @JSName("getResource")
    def `getResource_v1/ServiceAccountList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceAccountList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccountList] = js.native
    @JSName("getResource")
    def `getResource_v1/ServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceList] = js.native
    @JSName("getResource")
    def `getResource_v1/ServiceList`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/ServiceList`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceList] = js.native
    @JSName("getResource")
    def `getResource_v1/Status`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.Status] = js.native
    @JSName("getResource")
    def `getResource_v1/Status`(
      groupVersionKind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`v1/Status`,
      namespace: java.lang.String,
      name: java.lang.String
    ): atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.providerMod.metaNs.v1Ns.Status] = js.native
  }
  
  /**
       * ConfigFile creates a set of Kubernetes resources from Kubernetes YAML file. If `config.name`
       * is not specified, `ConfigFile` assumes the argument `name` is the filename.
       */
  @js.native
  class ConfigFile protected () extends CollectionComponentResource {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, config: ConfigFileOpts) = this()
    def this(name: java.lang.String, config: ConfigFileOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  
  trait ConfigFileOpts extends js.Object {
    var file: js.UndefOr[java.lang.String] = js.undefined
    var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
  }
  
  /**
       * ConfigGroup creates a set of Kubernetes resources from Kubernetes YAML text. The YAML text
       * may be supplied using any of the following `ConfigGroupOpts`:
       *
       *   1. Using a filename or a list of filenames:
       *        a. `{files: "foo.yaml"}`
       *        b. `{files: ["foo.yaml", "bar.yaml"]}`
       *   2. Using a file pattern or a list of file patterns:
       *        a. `{files: "*.yaml"}`
       *        b. `{files: ["foo/ *.yaml", "bar/ *.yaml"]}`
       *   3. Using a literal string containing YAML, or a list of such strings:
       *        a. `{yaml: "(LITERAL YAML HERE)"}`
       *        b. `{yaml: ["(LITERAL YAML HERE)", "(MORE YAML)"]}`
       *   4. Any combination of files, patterns, or YAML strings:
       *        a. `{files: "foo.yaml", yaml: "(LITERAL YAML HERE)"}`
       */
  @js.native
  class ConfigGroup protected () extends CollectionComponentResource {
    def this(name: java.lang.String, config: ConfigGroupOpts) = this()
    def this(name: java.lang.String, config: ConfigGroupOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  
  trait ConfigGroupOpts extends js.Object {
    var files: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
    var objs: js.UndefOr[js.Array[_] | js.Any] = js.undefined
    var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
    var yaml: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  }
  
  
  trait ConfigOpts extends js.Object {
    var objs: js.Array[_]
    var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
  }
  
  def parse(config: ConfigGroupOpts): atPulumiPulumiLib.pulumiMod.Output[
    ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.CustomResource]
  ] = js.native
  def parse(config: ConfigGroupOpts, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions): atPulumiPulumiLib.pulumiMod.Output[
    ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.CustomResource]
  ] = js.native
}

