package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyMod {
  
  @JSImport("@pulumi/aws/kms/key", "Key")
  @js.native
  class Key protected () extends CustomResource {
    /**
      * Create a Key resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the key.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
      * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
      */
    val customerMasterKeySpec: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
      */
    val deletionWindowInDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The description of the key as viewed in AWS console.
      */
    val description: Output_[String] = js.native
    
    /**
      * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
      */
    val enableKeyRotation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether the key is enabled. Defaults to true.
      */
    val isEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The globally unique identifier for the key.
      */
    val keyId: Output_[String] = js.native
    
    /**
      * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
      * Defaults to `ENCRYPT_DECRYPT`.
      */
    val keyUsage: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A valid policy JSON document.
      */
    val policy: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Key {
    
    @JSImport("@pulumi/aws/kms/key", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Key resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Key]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Key]
    @scala.inline
    def get(name: String, id: Input[ID], state: KeyState): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Key]
    @scala.inline
    def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean]
  }
  
  trait KeyArgs extends StObject {
    
    /**
      * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
      * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
      */
    val customerMasterKeySpec: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
      */
    val deletionWindowInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The description of the key as viewed in AWS console.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
      */
    val enableKeyRotation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether the key is enabled. Defaults to true.
      */
    val isEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
      * Defaults to `ENCRYPT_DECRYPT`.
      */
    val keyUsage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid policy JSON document.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object KeyArgs {
    
    @scala.inline
    def apply(): KeyArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyArgs]
    }
    
    @scala.inline
    implicit class KeyArgsMutableBuilder[Self <: KeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomerMasterKeySpec(value: Input[String]): Self = StObject.set(x, "customerMasterKeySpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "customerMasterKeySpec", js.undefined)
      
      @scala.inline
      def setDeletionWindowInDays(value: Input[Double]): Self = StObject.set(x, "deletionWindowInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionWindowInDaysUndefined: Self = StObject.set(x, "deletionWindowInDays", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnableKeyRotation(value: Input[Boolean]): Self = StObject.set(x, "enableKeyRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyRotationUndefined: Self = StObject.set(x, "enableKeyRotation", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Input[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setKeyUsage(value: Input[String]): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait KeyState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the key.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
      * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
      */
    val customerMasterKeySpec: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
      */
    val deletionWindowInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The description of the key as viewed in AWS console.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
      */
    val enableKeyRotation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether the key is enabled. Defaults to true.
      */
    val isEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The globally unique identifier for the key.
      */
    val keyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
      * Defaults to `ENCRYPT_DECRYPT`.
      */
    val keyUsage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid policy JSON document.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object KeyState {
    
    @scala.inline
    def apply(): KeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyState]
    }
    
    @scala.inline
    implicit class KeyStateMutableBuilder[Self <: KeyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCustomerMasterKeySpec(value: Input[String]): Self = StObject.set(x, "customerMasterKeySpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "customerMasterKeySpec", js.undefined)
      
      @scala.inline
      def setDeletionWindowInDays(value: Input[Double]): Self = StObject.set(x, "deletionWindowInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionWindowInDaysUndefined: Self = StObject.set(x, "deletionWindowInDays", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnableKeyRotation(value: Input[Boolean]): Self = StObject.set(x, "enableKeyRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyRotationUndefined: Self = StObject.set(x, "enableKeyRotation", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Input[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setKeyUsage(value: Input[String]): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
