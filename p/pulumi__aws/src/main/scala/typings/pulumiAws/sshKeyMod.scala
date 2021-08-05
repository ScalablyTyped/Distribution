package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshKeyMod {
  
  @JSImport("@pulumi/aws/iam/sshKey", "SshKey")
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
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
      */
    val encoding: Output_[String] = js.native
    
    /**
      * The MD5 message digest of the SSH public key.
      */
    val fingerprint: Output_[String] = js.native
    
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
      */
    val publicKey: Output_[String] = js.native
    
    /**
      * The unique identifier for the SSH public key.
      */
    val sshPublicKeyId: Output_[String] = js.native
    
    /**
      * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
      */
    val status: Output_[String] = js.native
    
    /**
      * The name of the IAM user to associate the SSH public key with.
      */
    val username: Output_[String] = js.native
  }
  /* static members */
  object SshKey {
    
    @JSImport("@pulumi/aws/iam/sshKey", "SshKey")
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
    inline def get(name: String, id: Input[ID]): SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SshKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SshKey]
    inline def get(name: String, id: Input[ID], state: SshKeyState): SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SshKey]
    inline def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): SshKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SshKey]
    
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean]
  }
  
  trait SshKeyArgs extends StObject {
    
    /**
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
      */
    val encoding: Input[String]
    
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
      */
    val publicKey: Input[String]
    
    /**
      * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the IAM user to associate the SSH public key with.
      */
    val username: Input[String]
  }
  object SshKeyArgs {
    
    inline def apply(encoding: Input[String], publicKey: Input[String], username: Input[String]): SshKeyArgs = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SshKeyArgs]
    }
    
    extension [Self <: SshKeyArgs](x: Self) {
      
      inline def setEncoding(value: Input[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait SshKeyState extends StObject {
    
    /**
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
      */
    val encoding: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The MD5 message digest of the SSH public key.
      */
    val fingerprint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
      */
    val publicKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unique identifier for the SSH public key.
      */
    val sshPublicKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the IAM user to associate the SSH public key with.
      */
    val username: js.UndefOr[Input[String]] = js.undefined
  }
  object SshKeyState {
    
    inline def apply(): SshKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SshKeyState]
    }
    
    extension [Self <: SshKeyState](x: Self) {
      
      inline def setEncoding(value: Input[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFingerprint(value: Input[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setSshPublicKeyId(value: Input[String]): Self = StObject.set(x, "sshPublicKeyId", value.asInstanceOf[js.Any])
      
      inline def setSshPublicKeyIdUndefined: Self = StObject.set(x, "sshPublicKeyId", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
