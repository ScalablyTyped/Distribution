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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transfer {
  
  @JSImport("@pulumi/aws", "transfer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "transfer.Server")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ServerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Server {
    
    @JSImport("@pulumi/aws", "transfer.Server")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Server resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.serverMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serverMod.Server]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.serverMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serverMod.Server]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServerState): typings.pulumiAws.serverMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serverMod.Server]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServerState, opts: CustomResourceOptions): typings.pulumiAws.serverMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serverMod.Server]
    
    /**
      * Returns true if the given object is an instance of Server.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "transfer.SshKey")
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
  /* static members */
  object SshKey {
    
    @JSImport("@pulumi/aws", "transfer.SshKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.transferSshKeyMod.SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferSshKeyMod.SshKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.transferSshKeyMod.SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferSshKeyMod.SshKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: SshKeyState): typings.pulumiAws.transferSshKeyMod.SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferSshKeyMod.SshKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typings.pulumiAws.transferSshKeyMod.SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferSshKeyMod.SshKey]
    
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "transfer.User")
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
  /* static members */
  object User {
    
    @JSImport("@pulumi/aws", "transfer.User")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.transferUserMod.User = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferUserMod.User]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.transferUserMod.User = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferUserMod.User]
    @scala.inline
    def get(name: String, id: Input[ID], state: UserState): typings.pulumiAws.transferUserMod.User = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferUserMod.User]
    @scala.inline
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typings.pulumiAws.transferUserMod.User = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transferUserMod.User]
    
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean]
  }
  
  @scala.inline
  def getServer(args: GetServerArgs): js.Promise[GetServerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServer")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServerResult]]
  @scala.inline
  def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServerResult]]
}
