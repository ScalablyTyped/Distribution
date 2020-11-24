package typings.pulumiAws.functionMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appsync/function", "Function")
@js.native
class Function protected () extends CustomResource {
  /**
    * Create a Function resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FunctionArgs) = this()
  def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: Output_[String] = js.native
  
  /**
    * The ARN of the Function object.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The Function DataSource name.
    */
  val dataSource: Output_[String] = js.native
  
  /**
    * The Function description.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A unique ID representing the Function object.
    */
  val functionId: Output_[String] = js.native
  
  /**
    * The version of the request mapping template. Currently the supported value is `2018-05-29`.
    */
  val functionVersion: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Function name. The function name does not have to be unique.
    */
  val name: Output_[String] = js.native
  
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  val requestMappingTemplate: Output_[String] = js.native
  
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appsync/function", "Function")
@js.native
object Function extends js.Object {
  
  /**
    * Get an existing Function resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Function = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Function = js.native
  def get(name: String, id: Input[ID], state: FunctionState): Function = js.native
  def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): Function = js.native
  
  /**
    * Returns true if the given object is an instance of Function.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
}
