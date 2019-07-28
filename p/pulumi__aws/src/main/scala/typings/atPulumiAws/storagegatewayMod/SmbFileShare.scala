package typings.atPulumiAws.storagegatewayMod

import typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShareArgs
import typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShareState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", "SmbFileShare")
@js.native
class SmbFileShare protected ()
  extends typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare {
  /**
    * Create a SmbFileShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SmbFileShareArgs) = this()
  def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/storagegateway", "SmbFileShare")
@js.native
object SmbFileShare extends js.Object {
  /**
    * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: SmbFileShareState): typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewaySmbFileShareMod.SmbFileShare = js.native
  /**
    * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
}

