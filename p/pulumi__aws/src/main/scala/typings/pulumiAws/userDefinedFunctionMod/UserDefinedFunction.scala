package typings.pulumiAws.userDefinedFunctionMod

import typings.pulumiAws.outputMod.glue.UserDefinedFunctionResourceUri
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction")
@js.native
class UserDefinedFunction protected () extends CustomResource {
  /**
    * Create a UserDefinedFunction resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserDefinedFunctionArgs) = this()
  def this(name: String, args: UserDefinedFunctionArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  /**
    * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Java class that contains the function code.
    */
  val className: Output_[String] = js.native
  
  val createTime: Output_[String] = js.native
  
  /**
    * The name of the Database to create the Function.
    */
  val databaseName: Output_[String] = js.native
  
  /**
    * The name of the function.
    */
  val name: Output_[String] = js.native
  
  /**
    * The owner of the function.
    */
  val ownerName: Output_[String] = js.native
  
  /**
    * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
    */
  val ownerType: Output_[String] = js.native
  
  /**
    * The configuration block for Resource URIs. See resource uris below for more details.
    */
  val resourceUris: Output_[js.UndefOr[js.Array[UserDefinedFunctionResourceUri]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction")
@js.native
object UserDefinedFunction extends js.Object {
  
  /**
    * Get an existing UserDefinedFunction resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): UserDefinedFunction = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserDefinedFunction = js.native
  def get(name: String, id: Input[ID], state: UserDefinedFunctionState): UserDefinedFunction = js.native
  def get(name: String, id: Input[ID], state: UserDefinedFunctionState, opts: CustomResourceOptions): UserDefinedFunction = js.native
  
  /**
    * Returns true if the given object is an instance of UserDefinedFunction.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/userDefinedFunction.UserDefinedFunction */ Boolean = js.native
}
