package typings.atPulumiAws.codebuildMod

import typings.atPulumiAws.codebuildSourceCredentialMod.SourceCredentialArgs
import typings.atPulumiAws.codebuildSourceCredentialMod.SourceCredentialState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codebuild", "SourceCredential")
@js.native
class SourceCredential protected ()
  extends typings.atPulumiAws.codebuildSourceCredentialMod.SourceCredential {
  /**
    * Create a SourceCredential resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SourceCredentialArgs) = this()
  def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codebuild", "SourceCredential")
@js.native
object SourceCredential extends js.Object {
  /**
    * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.codebuildSourceCredentialMod.SourceCredential = js.native
  def get(name: String, id: Input[ID], state: SourceCredentialState): typings.atPulumiAws.codebuildSourceCredentialMod.SourceCredential = js.native
  def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): typings.atPulumiAws.codebuildSourceCredentialMod.SourceCredential = js.native
  /**
    * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = js.native
}

