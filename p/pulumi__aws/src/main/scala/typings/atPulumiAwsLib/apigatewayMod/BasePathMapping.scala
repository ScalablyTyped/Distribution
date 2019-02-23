package typings
package atPulumiAwsLib.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "BasePathMapping")
@js.native
class BasePathMapping protected ()
  extends atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping {
  /**
    * Create a BasePathMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "BasePathMapping")
@js.native
object BasePathMapping extends js.Object {
  /**
    * Get an existing BasePathMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingState
  ): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
}

