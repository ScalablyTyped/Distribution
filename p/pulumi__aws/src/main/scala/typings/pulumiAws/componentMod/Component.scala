package typings.pulumiAws.componentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/imagebuilder/component", "Component")
@js.native
class Component protected () extends CustomResource {
  /**
    * Create a Component resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ComponentArgs) = this()
  def this(name: String, args: ComponentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * (Required) Amazon Resource Name (ARN) of the component.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Change description of the component.
    */
  val changeDescription: Output_[js.UndefOr[String]] = js.native
  
  val data: Output_[String] = js.native
  
  /**
    * Date the component was created.
    */
  val dateCreated: Output_[String] = js.native
  
  /**
    * Description of the component.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Encryption status of the component.
    */
  val encrypted: Output_[Boolean] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
    */
  val kmsKeyId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Name of the component.
    */
  val name: Output_[String] = js.native
  
  /**
    * Owner of the component.
    */
  val owner: Output_[String] = js.native
  
  /**
    * Platform of the component.
    */
  val platform: Output_[String] = js.native
  
  /**
    * Set of Operating Systems (OS) supported by the component.
    */
  val supportedOsVersions: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Key-value map of resource tags for the component.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Type of the component.
    */
  val `type`: Output_[String] = js.native
  
  /**
    * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
    */
  val uri: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Version of the component.
    */
  val version: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/imagebuilder/component", "Component")
@js.native
object Component extends js.Object {
  
  /**
    * Get an existing Component resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Component = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Component = js.native
  def get(name: String, id: Input[ID], state: ComponentState): Component = js.native
  def get(name: String, id: Input[ID], state: ComponentState, opts: CustomResourceOptions): Component = js.native
  
  /**
    * Returns true if the given object is an instance of Component.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/component.Component */ Boolean = js.native
}
