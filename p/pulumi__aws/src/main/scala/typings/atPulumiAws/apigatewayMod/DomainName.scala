package typings.atPulumiAws.apigatewayMod

import typings.atPulumiAws.apigatewayDomainNameMod.DomainNameArgs
import typings.atPulumiAws.apigatewayDomainNameMod.DomainNameState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "DomainName")
@js.native
class DomainName protected ()
  extends typings.atPulumiAws.apigatewayDomainNameMod.DomainName {
  /**
    * Create a DomainName resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainNameArgs) = this()
  def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "DomainName")
@js.native
object DomainName extends js.Object {
  /**
    * Get an existing DomainName resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayDomainNameMod.DomainName = js.native
  def get(name: String, id: Input[ID], state: DomainNameState): typings.atPulumiAws.apigatewayDomainNameMod.DomainName = js.native
  def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayDomainNameMod.DomainName = js.native
  /**
    * Returns true if the given object is an instance of DomainName.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = js.native
}

