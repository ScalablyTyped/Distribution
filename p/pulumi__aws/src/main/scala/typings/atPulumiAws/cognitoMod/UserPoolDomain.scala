package typings.atPulumiAws.cognitoMod

import typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomainArgs
import typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomainState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", "UserPoolDomain")
@js.native
class UserPoolDomain protected ()
  extends typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain {
  /**
    * Create a UserPoolDomain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserPoolDomainArgs) = this()
  def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cognito", "UserPoolDomain")
@js.native
object UserPoolDomain extends js.Object {
  /**
    * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
  def get(name: String, id: Input[ID], state: UserPoolDomainState): typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
  def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
  /**
    * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
}

