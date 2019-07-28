package typings.atPulumiAws.storagegatewayMod

import typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBufferArgs
import typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBufferState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", "UploadBuffer")
@js.native
class UploadBuffer protected ()
  extends typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer {
  /**
    * Create a UploadBuffer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UploadBufferArgs) = this()
  def this(name: String, args: UploadBufferArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/storagegateway", "UploadBuffer")
@js.native
object UploadBuffer extends js.Object {
  /**
    * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer = js.native
  def get(name: String, id: Input[ID], state: UploadBufferState): typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer = js.native
  def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayUploadBufferMod.UploadBuffer = js.native
  /**
    * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
}

