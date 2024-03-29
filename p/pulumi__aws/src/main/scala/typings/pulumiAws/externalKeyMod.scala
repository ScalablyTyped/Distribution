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

object externalKeyMod {
  
  @JSImport("@pulumi/aws/kms/externalKey", "ExternalKey")
  @js.native
  class ExternalKey protected () extends CustomResource {
    /**
      * Create a ExternalKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ExternalKeyArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the key.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
      */
    val deletionWindowInDays: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Description of the key.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
      */
    val enabled: Output_[Boolean] = js.native
    
    /**
      * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
      */
    val expirationModel: Output_[String] = js.native
    
    /**
      * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
      */
    val keyMaterialBase64: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The state of the CMK.
      */
    val keyState: Output_[String] = js.native
    
    /**
      * The cryptographic operations for which you can use the CMK.
      */
    val keyUsage: Output_[String] = js.native
    
    /**
      * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
      */
    val policy: Output_[String] = js.native
    
    /**
      * A key-value map of tags to assign to the key.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
      */
    val validTo: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object ExternalKey {
    
    @JSImport("@pulumi/aws/kms/externalKey", "ExternalKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ExternalKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ExternalKey]
    inline def get(name: String, id: Input[ID], state: ExternalKeyState): ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ExternalKey]
    inline def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): ExternalKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ExternalKey]
    
    /**
      * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean]
  }
  
  trait ExternalKeyArgs extends StObject {
    
    /**
      * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
      */
    val deletionWindowInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Description of the key.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
      */
    val keyMaterialBase64: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A key-value map of tags to assign to the key.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
      */
    val validTo: js.UndefOr[Input[String]] = js.undefined
  }
  object ExternalKeyArgs {
    
    inline def apply(): ExternalKeyArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalKeyArgs]
    }
    
    extension [Self <: ExternalKeyArgs](x: Self) {
      
      inline def setDeletionWindowInDays(value: Input[Double]): Self = StObject.set(x, "deletionWindowInDays", value.asInstanceOf[js.Any])
      
      inline def setDeletionWindowInDaysUndefined: Self = StObject.set(x, "deletionWindowInDays", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKeyMaterialBase64(value: Input[String]): Self = StObject.set(x, "keyMaterialBase64", value.asInstanceOf[js.Any])
      
      inline def setKeyMaterialBase64Undefined: Self = StObject.set(x, "keyMaterialBase64", js.undefined)
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setValidTo(value: Input[String]): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
      
      inline def setValidToUndefined: Self = StObject.set(x, "validTo", js.undefined)
    }
  }
  
  trait ExternalKeyState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the key.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
      */
    val deletionWindowInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Description of the key.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
      */
    val expirationModel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
      */
    val keyMaterialBase64: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The state of the CMK.
      */
    val keyState: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The cryptographic operations for which you can use the CMK.
      */
    val keyUsage: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A key-value map of tags to assign to the key.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
      */
    val validTo: js.UndefOr[Input[String]] = js.undefined
  }
  object ExternalKeyState {
    
    inline def apply(): ExternalKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalKeyState]
    }
    
    extension [Self <: ExternalKeyState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDeletionWindowInDays(value: Input[Double]): Self = StObject.set(x, "deletionWindowInDays", value.asInstanceOf[js.Any])
      
      inline def setDeletionWindowInDaysUndefined: Self = StObject.set(x, "deletionWindowInDays", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExpirationModel(value: Input[String]): Self = StObject.set(x, "expirationModel", value.asInstanceOf[js.Any])
      
      inline def setExpirationModelUndefined: Self = StObject.set(x, "expirationModel", js.undefined)
      
      inline def setKeyMaterialBase64(value: Input[String]): Self = StObject.set(x, "keyMaterialBase64", value.asInstanceOf[js.Any])
      
      inline def setKeyMaterialBase64Undefined: Self = StObject.set(x, "keyMaterialBase64", js.undefined)
      
      inline def setKeyState(value: Input[String]): Self = StObject.set(x, "keyState", value.asInstanceOf[js.Any])
      
      inline def setKeyStateUndefined: Self = StObject.set(x, "keyState", js.undefined)
      
      inline def setKeyUsage(value: Input[String]): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
      
      inline def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setValidTo(value: Input[String]): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
      
      inline def setValidToUndefined: Self = StObject.set(x, "validTo", js.undefined)
    }
  }
}
