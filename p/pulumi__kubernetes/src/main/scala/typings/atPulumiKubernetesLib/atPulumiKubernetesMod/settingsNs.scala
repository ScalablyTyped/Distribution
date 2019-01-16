package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "settings")
@js.native
object settingsNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
      */
    @js.native
    class PodPreset protected ()
      extends atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPreset {
      /**
        * Create a settings.v1alpha1.PodPreset resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.settingsNs.v1alpha1Ns.PodPreset) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.settingsNs.v1alpha1Ns.PodPreset, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PodPresetList is a list of PodPreset objects.
      */
    @js.native
    class PodPresetList protected ()
      extends atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPresetList {
      /**
        * Create a settings.v1alpha1.PodPresetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.settingsNs.v1alpha1Ns.PodPresetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.settingsNs.v1alpha1Ns.PodPresetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
      */
    @js.native
    object PodPreset extends js.Object {
      /**
        * Get the state of an existing `PodPreset` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPreset = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPreset = js.native
    }
    
    /**
      * PodPresetList is a list of PodPreset objects.
      */
    @js.native
    object PodPresetList extends js.Object {
      /**
        * Get the state of an existing `PodPresetList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPresetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.settingsNs.v1alpha1Ns.PodPresetList = js.native
    }
    
  }
  
}

