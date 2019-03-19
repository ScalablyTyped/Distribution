package typings
package atPulumiKubernetesLib.admissionregistrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/admissionregistration", "v1alpha1")
@js.native
object v1alpha1Ns extends js.Object {
  @js.native
  class InitializerConfiguration protected ()
    extends atPulumiKubernetesLib.admissionregistrationV1alpha1Mod.InitializerConfiguration {
    /**
      * Create a admissionregistration.v1alpha1.InitializerConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class InitializerConfigurationList protected ()
    extends atPulumiKubernetesLib.admissionregistrationV1alpha1Mod.InitializerConfigurationList {
    /**
      * Create a admissionregistration.v1alpha1.InitializerConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object InitializerConfiguration extends js.Object {
    /**
      * Get the state of an existing `InitializerConfiguration` resource, as identified by `id`.
      * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
      * Kubernetes convention) the ID becomes default/<name>.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.admissionregistrationV1alpha1InitializerConfigurationMod.InitializerConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.admissionregistrationV1alpha1InitializerConfigurationMod.InitializerConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object InitializerConfigurationList extends js.Object {
    /**
      * Get the state of an existing `InitializerConfigurationList` resource, as identified by `id`.
      * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
      * Kubernetes convention) the ID becomes default/<name>.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.admissionregistrationV1alpha1InitializerConfigurationListMod.InitializerConfigurationList = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.admissionregistrationV1alpha1InitializerConfigurationListMod.InitializerConfigurationList = js.native
  }
  
}

