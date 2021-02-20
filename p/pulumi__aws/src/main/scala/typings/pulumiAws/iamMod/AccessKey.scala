package typings.pulumiAws.iamMod

import typings.pulumiAws.accessKeyMod.AccessKeyArgs
import typings.pulumiAws.accessKeyMod.AccessKeyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "AccessKey")
@js.native
class AccessKey protected ()
  extends typings.pulumiAws.accessKeyMod.AccessKey {
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
object AccessKey {
  
  /**
    * Get an existing AccessKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/iam", "AccessKey.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.accessKeyMod.AccessKey = js.native
  @JSImport("@pulumi/aws/iam", "AccessKey.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.accessKeyMod.AccessKey = js.native
  @JSImport("@pulumi/aws/iam", "AccessKey.get")
  @js.native
  def get(name: String, id: Input[ID], state: AccessKeyState): typings.pulumiAws.accessKeyMod.AccessKey = js.native
  @JSImport("@pulumi/aws/iam", "AccessKey.get")
  @js.native
  def get(name: String, id: Input[ID], state: AccessKeyState, opts: CustomResourceOptions): typings.pulumiAws.accessKeyMod.AccessKey = js.native
  
  /**
    * Returns true if the given object is an instance of AccessKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/iam", "AccessKey.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accessKey.AccessKey */ Boolean = js.native
}
