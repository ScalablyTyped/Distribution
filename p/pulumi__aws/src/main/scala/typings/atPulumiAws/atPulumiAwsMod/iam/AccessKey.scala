package typings.atPulumiAws.atPulumiAwsMod.iam

import typings.atPulumiAws.iamAccessKeyMod.AccessKeyArgs
import typings.atPulumiAws.iamAccessKeyMod.AccessKeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.AccessKey")
@js.native
class AccessKey protected ()
  extends typings.atPulumiAws.iamMod.AccessKey {
  /**
    * Create a AccessKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccessKeyArgs) = this()
  def this(name: String, args: AccessKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.AccessKey")
@js.native
object AccessKey extends js.Object {
  /**
    * Get an existing AccessKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iamAccessKeyMod.AccessKey = js.native
  def get(name: String, id: Input[ID], state: AccessKeyState): typings.atPulumiAws.iamAccessKeyMod.AccessKey = js.native
  def get(name: String, id: Input[ID], state: AccessKeyState, opts: CustomResourceOptions): typings.atPulumiAws.iamAccessKeyMod.AccessKey = js.native
  /**
    * Returns true if the given object is an instance of AccessKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accessKey.AccessKey */ Boolean = js.native
}

