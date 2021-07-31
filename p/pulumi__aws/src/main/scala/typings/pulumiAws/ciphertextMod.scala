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

object ciphertextMod {
  
  @JSImport("@pulumi/aws/kms/ciphertext", "Ciphertext")
  @js.native
  class Ciphertext protected () extends CustomResource {
    /**
      * Create a Ciphertext resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CiphertextArgs) = this()
    def this(name: String, args: CiphertextArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Base64 encoded ciphertext
      */
    val ciphertextBlob: Output_[String] = js.native
    
    /**
      * An optional mapping that makes up the encryption context.
      */
    val context: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Globally unique key ID for the customer master key.
      */
    val keyId: Output_[String] = js.native
    
    /**
      * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
      */
    val plaintext: Output_[String] = js.native
  }
  /* static members */
  object Ciphertext {
    
    @JSImport("@pulumi/aws/kms/ciphertext", "Ciphertext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Ciphertext]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Ciphertext]
    @scala.inline
    def get(name: String, id: Input[ID], state: CiphertextState): Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Ciphertext]
    @scala.inline
    def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): Ciphertext = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Ciphertext]
    
    /**
      * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean]
  }
  
  trait CiphertextArgs extends StObject {
    
    /**
      * An optional mapping that makes up the encryption context.
      */
    val context: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Globally unique key ID for the customer master key.
      */
    val keyId: Input[String]
    
    /**
      * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
      */
    val plaintext: Input[String]
  }
  object CiphertextArgs {
    
    @scala.inline
    def apply(keyId: Input[String], plaintext: Input[String]): CiphertextArgs = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[CiphertextArgs]
    }
    
    @scala.inline
    implicit class CiphertextArgsMutableBuilder[Self <: CiphertextArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: Input[String]): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  trait CiphertextState extends StObject {
    
    /**
      * Base64 encoded ciphertext
      */
    val ciphertextBlob: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An optional mapping that makes up the encryption context.
      */
    val context: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Globally unique key ID for the customer master key.
      */
    val keyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
      */
    val plaintext: js.UndefOr[Input[String]] = js.undefined
  }
  object CiphertextState {
    
    @scala.inline
    def apply(): CiphertextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CiphertextState]
    }
    
    @scala.inline
    implicit class CiphertextStateMutableBuilder[Self <: CiphertextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphertextBlob(value: Input[String]): Self = StObject.set(x, "ciphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlobUndefined: Self = StObject.set(x, "ciphertextBlob", js.undefined)
      
      @scala.inline
      def setContext(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setPlaintext(value: Input[String]): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
    }
  }
}
