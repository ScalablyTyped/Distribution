package typings.atPulumiAws.cognitoMod

import typings.atPulumiAws.cognitoUserPoolMod.UserPoolArgs
import typings.atPulumiAws.cognitoUserPoolMod.UserPoolState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", "UserPool")
@js.native
class UserPool protected ()
  extends typings.atPulumiAws.cognitoUserPoolMod.UserPool {
  /**
    * Create a UserPool resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: UserPoolArgs) = this()
  def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cognito", "UserPool")
@js.native
object UserPool extends js.Object {
  /**
    * Get an existing UserPool resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
  def get(name: String, id: Input[ID], state: UserPoolState): typings.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
  def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
  /**
    * Returns true if the given object is an instance of UserPool.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
}

