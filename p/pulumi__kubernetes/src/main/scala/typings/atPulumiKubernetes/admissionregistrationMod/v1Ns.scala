package typings.atPulumiKubernetes.admissionregistrationMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/admissionregistration", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  class MutatingWebhookConfiguration protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1Mod.MutatingWebhookConfiguration {
    /**
      * Create a admissionregistration.v1.MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.MutatingWebhookConfiguration
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.MutatingWebhookConfiguration,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class MutatingWebhookConfigurationList protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1Mod.MutatingWebhookConfigurationList {
    /**
      * Create a admissionregistration.v1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.MutatingWebhookConfigurationList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.MutatingWebhookConfigurationList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ValidatingWebhookConfiguration protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1Mod.ValidatingWebhookConfiguration {
    /**
      * Create a admissionregistration.v1.ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ValidatingWebhookConfiguration
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ValidatingWebhookConfiguration,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ValidatingWebhookConfigurationList protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1Mod.ValidatingWebhookConfigurationList {
    /**
      * Create a admissionregistration.v1.ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ValidatingWebhookConfigurationList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ValidatingWebhookConfigurationList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object MutatingWebhookConfiguration extends js.Object {
    /**
      * Get the state of an existing `MutatingWebhookConfiguration` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MutatingWebhookConfigurationList extends js.Object {
    /**
      * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ValidatingWebhookConfiguration extends js.Object {
    /**
      * Get the state of an existing `ValidatingWebhookConfiguration` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/ValidatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ValidatingWebhookConfigurationList extends js.Object {
    /**
      * Get the state of an existing `ValidatingWebhookConfigurationList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/ValidatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
  }
  
}

