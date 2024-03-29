package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicKeyMod {
  
  @JSImport("@pulumi/aws/cloudfront/publicKey", "PublicKey")
  @js.native
  class PublicKey protected () extends CustomResource {
    /**
      * Create a PublicKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublicKeyArgs) = this()
    def this(name: String, args: PublicKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Internal value used by CloudFront to allow future updates to the public key configuration.
      */
    val callerReference: Output_[String] = js.native
    
    /**
      * An optional comment about the public key.
      */
    val comment: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
      */
    val encodedKey: Output_[String] = js.native
    
    /**
      * The current version of the public key. For example: `E2QWRUHAPOMQZL`.
      */
    val etag: Output_[String] = js.native
    
    /**
      * The name for the public key. By default generated by this provider.
      */
    val name: Output_[String] = js.native
    
    /**
      * The name for the public key. Conflicts with `name`.
      */
    val namePrefix: Output_[String] = js.native
  }
  /* static members */
  object PublicKey {
    
    @JSImport("@pulumi/aws/cloudfront/publicKey", "PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PublicKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
    inline def get(name: String, id: Input[ID], state: PublicKeyState): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
    inline def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PublicKey]
    
    /**
      * Returns true if the given object is an instance of PublicKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean]
  }
  
  trait PublicKeyArgs extends StObject {
    
    /**
      * An optional comment about the public key.
      */
    val comment: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
      */
    val encodedKey: Input[String]
    
    /**
      * The name for the public key. By default generated by this provider.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for the public key. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
  }
  object PublicKeyArgs {
    
    inline def apply(encodedKey: Input[String]): PublicKeyArgs = {
      val __obj = js.Dynamic.literal(encodedKey = encodedKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKeyArgs]
    }
    
    extension [Self <: PublicKeyArgs](x: Self) {
      
      inline def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setEncodedKey(value: Input[String]): Self = StObject.set(x, "encodedKey", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait PublicKeyState extends StObject {
    
    /**
      * Internal value used by CloudFront to allow future updates to the public key configuration.
      */
    val callerReference: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An optional comment about the public key.
      */
    val comment: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
      */
    val encodedKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The current version of the public key. For example: `E2QWRUHAPOMQZL`.
      */
    val etag: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for the public key. By default generated by this provider.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for the public key. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
  }
  object PublicKeyState {
    
    inline def apply(): PublicKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicKeyState]
    }
    
    extension [Self <: PublicKeyState](x: Self) {
      
      inline def setCallerReference(value: Input[String]): Self = StObject.set(x, "callerReference", value.asInstanceOf[js.Any])
      
      inline def setCallerReferenceUndefined: Self = StObject.set(x, "callerReference", js.undefined)
      
      inline def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setEncodedKey(value: Input[String]): Self = StObject.set(x, "encodedKey", value.asInstanceOf[js.Any])
      
      inline def setEncodedKeyUndefined: Self = StObject.set(x, "encodedKey", js.undefined)
      
      inline def setEtag(value: Input[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
