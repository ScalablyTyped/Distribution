package typings.atPulumiAws.cognitoMod

import typings.atPulumiAws.cognitoUserGroupMod.UserGroupArgs
import typings.atPulumiAws.cognitoUserGroupMod.UserGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", "UserGroup")
@js.native
class UserGroup protected ()
  extends typings.atPulumiAws.cognitoUserGroupMod.UserGroup {
  /**
    * Create a UserGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserGroupArgs) = this()
  def this(name: String, args: UserGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cognito", "UserGroup")
@js.native
object UserGroup extends js.Object {
  /**
    * Get an existing UserGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
  def get(name: String, id: Input[ID], state: UserGroupState): typings.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
  def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
  /**
    * Returns true if the given object is an instance of UserGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
}

