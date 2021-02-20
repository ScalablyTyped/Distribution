package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferSshKeyMod {
  
  @JSImport("@pulumi/aws/transfer/sshKey", "SshKey")
  @js.native
  class SshKey protected () extends CustomResource {
    /**
      * Create a SshKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SshKeyArgs) = this()
    def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The public key portion of an SSH key pair.
      */
    val body: Output_[String] = js.native
    
    /**
      * The Server ID of the Transfer Server (e.g. `s-12345678`)
      */
    val serverId: Output_[String] = js.native
    
    /**
      * The name of the user account that is assigned to one or more servers.
      */
    val userName: Output_[String] = js.native
  }
  /* static members */
  object SshKey {
    
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/transfer/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID]): SshKey = js.native
    @JSImport("@pulumi/aws/transfer/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SshKey = js.native
    @JSImport("@pulumi/aws/transfer/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: SshKeyState): SshKey = js.native
    @JSImport("@pulumi/aws/transfer/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): SshKey = js.native
    
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/transfer/sshKey", "SshKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean = js.native
  }
  
  @js.native
  trait SshKeyArgs extends StObject {
    
    /**
      * The public key portion of an SSH key pair.
      */
    val body: Input[String] = js.native
    
    /**
      * The Server ID of the Transfer Server (e.g. `s-12345678`)
      */
    val serverId: Input[String] = js.native
    
    /**
      * The name of the user account that is assigned to one or more servers.
      */
    val userName: Input[String] = js.native
  }
  object SshKeyArgs {
    
    @scala.inline
    def apply(body: Input[String], serverId: Input[String], userName: Input[String]): SshKeyArgs = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SshKeyArgs]
    }
    
    @scala.inline
    implicit class SshKeyArgsMutableBuilder[Self <: SshKeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Input[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerId(value: Input[String]): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SshKeyState extends StObject {
    
    /**
      * The public key portion of an SSH key pair.
      */
    val body: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Server ID of the Transfer Server (e.g. `s-12345678`)
      */
    val serverId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the user account that is assigned to one or more servers.
      */
    val userName: js.UndefOr[Input[String]] = js.native
  }
  object SshKeyState {
    
    @scala.inline
    def apply(): SshKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SshKeyState]
    }
    
    @scala.inline
    implicit class SshKeyStateMutableBuilder[Self <: SshKeyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Input[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setServerId(value: Input[String]): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
}
