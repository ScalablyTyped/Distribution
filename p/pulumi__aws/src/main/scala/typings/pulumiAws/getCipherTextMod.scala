package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCipherTextMod {
  
  @JSImport("@pulumi/aws/kms/getCipherText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherText")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCipherTextResult]]
  inline def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherText")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCipherTextResult]]
  
  trait GetCipherTextArgs extends StObject {
    
    /**
      * An optional mapping that makes up the encryption context.
      */
    val context: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Globally unique key ID for the customer master key.
      */
    val keyId: String
    
    /**
      * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
      */
    val plaintext: String
  }
  object GetCipherTextArgs {
    
    inline def apply(keyId: String, plaintext: String): GetCipherTextArgs = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCipherTextArgs]
    }
    
    extension [Self <: GetCipherTextArgs](x: Self) {
      
      inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCipherTextResult extends StObject {
    
    /**
      * Base64 encoded ciphertext
      */
    val ciphertextBlob: String
    
    val context: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val keyId: String
    
    val plaintext: String
  }
  object GetCipherTextResult {
    
    inline def apply(ciphertextBlob: String, id: String, keyId: String, plaintext: String): GetCipherTextResult = {
      val __obj = js.Dynamic.literal(ciphertextBlob = ciphertextBlob.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCipherTextResult]
    }
    
    extension [Self <: GetCipherTextResult](x: Self) {
      
      inline def setCiphertextBlob(value: String): Self = StObject.set(x, "ciphertextBlob", value.asInstanceOf[js.Any])
      
      inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
}
