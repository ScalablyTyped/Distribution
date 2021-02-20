package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCipherTextMod {
  
  @JSImport("@pulumi/aws/kms/getCipherText", "getCipherText")
  @js.native
  def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] = js.native
  @JSImport("@pulumi/aws/kms/getCipherText", "getCipherText")
  @js.native
  def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] = js.native
  
  @js.native
  trait GetCipherTextArgs extends StObject {
    
    /**
      * An optional mapping that makes up the encryption context.
      */
    val context: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Globally unique key ID for the customer master key.
      */
    val keyId: String = js.native
    
    /**
      * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
      */
    val plaintext: String = js.native
  }
  object GetCipherTextArgs {
    
    @scala.inline
    def apply(keyId: String, plaintext: String): GetCipherTextArgs = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCipherTextArgs]
    }
    
    @scala.inline
    implicit class GetCipherTextArgsMutableBuilder[Self <: GetCipherTextArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetCipherTextResult extends StObject {
    
    /**
      * Base64 encoded ciphertext
      */
    val ciphertextBlob: String = js.native
    
    val context: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val keyId: String = js.native
    
    val plaintext: String = js.native
  }
  object GetCipherTextResult {
    
    @scala.inline
    def apply(ciphertextBlob: String, id: String, keyId: String, plaintext: String): GetCipherTextResult = {
      val __obj = js.Dynamic.literal(ciphertextBlob = ciphertextBlob.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCipherTextResult]
    }
    
    @scala.inline
    implicit class GetCipherTextResultMutableBuilder[Self <: GetCipherTextResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphertextBlob(value: String): Self = StObject.set(x, "ciphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
}
