package typings.pulumiAws.mod

import typings.pulumiAws.getServerMod.GetServerArgs
import typings.pulumiAws.getServerMod.GetServerResult
import typings.pulumiAws.serverMod.ServerArgs
import typings.pulumiAws.serverMod.ServerState
import typings.pulumiAws.transferSshKeyMod.SshKeyArgs
import typings.pulumiAws.transferSshKeyMod.SshKeyState
import typings.pulumiAws.transferUserMod.UserArgs
import typings.pulumiAws.transferUserMod.UserState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "transfer")
@js.native
object transfer extends js.Object {
  @js.native
  class Server protected ()
    extends typings.pulumiAws.transferMod.Server {
    /**
      * Create a Server resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ServerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SshKey protected ()
    extends typings.pulumiAws.transferMod.SshKey {
    /**
      * Create a SshKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SshKeyArgs) = this()
    def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class User protected ()
    extends typings.pulumiAws.transferMod.User {
    /**
      * Create a User resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserArgs) = this()
    def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  }
  
  def getServer(args: GetServerArgs): js.Promise[GetServerResult] = js.native
  def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] = js.native
  /* static members */
  @js.native
  object Server extends js.Object {
    /**
      * Get an existing Server resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.serverMod.Server = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.serverMod.Server = js.native
    def get(name: String, id: Input[ID], state: ServerState): typings.pulumiAws.serverMod.Server = js.native
    def get(name: String, id: Input[ID], state: ServerState, opts: CustomResourceOptions): typings.pulumiAws.serverMod.Server = js.native
    /**
      * Returns true if the given object is an instance of Server.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SshKey extends js.Object {
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.transferSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.transferSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: SshKeyState): typings.pulumiAws.transferSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typings.pulumiAws.transferSshKeyMod.SshKey = js.native
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.transferUserMod.User = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.transferUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState): typings.pulumiAws.transferUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typings.pulumiAws.transferUserMod.User = js.native
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean = js.native
  }
  
}

