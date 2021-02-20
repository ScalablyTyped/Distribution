package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyPairMod {
  
  @JSImport("@pulumi/aws/ec2/keyPair", "KeyPair")
  @js.native
  class KeyPair protected () extends CustomResource {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: KeyPairArgs) = this()
    def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The key pair ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
      */
    val fingerprint: Output_[String] = js.native
    
    /**
      * The name for the key pair.
      */
    val keyName: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
      */
    val keyNamePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The key pair ID.
      */
    val keyPairId: Output_[String] = js.native
    
    /**
      * The public key material.
      */
    val publicKey: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object KeyPair {
    
    /**
      * Get an existing KeyPair resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/keyPair", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID]): KeyPair = js.native
    @JSImport("@pulumi/aws/ec2/keyPair", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): KeyPair = js.native
    @JSImport("@pulumi/aws/ec2/keyPair", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyPairState): KeyPair = js.native
    @JSImport("@pulumi/aws/ec2/keyPair", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): KeyPair = js.native
    
    /**
      * Returns true if the given object is an instance of KeyPair.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/keyPair", "KeyPair.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/keyPair.KeyPair */ Boolean = js.native
  }
  
  @js.native
  trait KeyPairArgs extends StObject {
    
    /**
      * The name for the key pair.
      */
    val keyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
      */
    val keyNamePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The public key material.
      */
    val publicKey: Input[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object KeyPairArgs {
    
    @scala.inline
    def apply(publicKey: Input[String]): KeyPairArgs = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairArgs]
    }
    
    @scala.inline
    implicit class KeyPairArgsMutableBuilder[Self <: KeyPairArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNamePrefix(value: Input[String]): Self = StObject.set(x, "keyNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNamePrefixUndefined: Self = StObject.set(x, "keyNamePrefix", js.undefined)
      
      @scala.inline
      def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait KeyPairState extends StObject {
    
    /**
      * The key pair ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
      */
    val fingerprint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the key pair.
      */
    val keyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`.
      */
    val keyNamePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The key pair ID.
      */
    val keyPairId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The public key material.
      */
    val publicKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object KeyPairState {
    
    @scala.inline
    def apply(): KeyPairState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPairState]
    }
    
    @scala.inline
    implicit class KeyPairStateMutableBuilder[Self <: KeyPairState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setFingerprint(value: Input[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNamePrefix(value: Input[String]): Self = StObject.set(x, "keyNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNamePrefixUndefined: Self = StObject.set(x, "keyNamePrefix", js.undefined)
      
      @scala.inline
      def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      @scala.inline
      def setKeyPairId(value: Input[String]): Self = StObject.set(x, "keyPairId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPairIdUndefined: Self = StObject.set(x, "keyPairId", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
