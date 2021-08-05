package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kms {
  
  trait GetSecretSecret extends StObject {
    
    var context: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var grantTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var payload: String
  }
  object GetSecretSecret {
    
    inline def apply(name: String, payload: String): GetSecretSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretSecret]
    }
    
    extension [Self <: GetSecretSecret](x: Self) {
      
      inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "grantTokens", value.asInstanceOf[js.Any])
      
      inline def setGrantTokensUndefined: Self = StObject.set(x, "grantTokens", js.undefined)
      
      inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "grantTokens", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSecretsSecret extends StObject {
    
    /**
      * An optional mapping that makes up the Encryption Context for the secret.
      */
    var context: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * An optional list of Grant Tokens for the secret.
      */
    var grantTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name to export this secret under in the attributes.
      */
    var name: String
    
    /**
      * Base64 encoded payload, as returned from a KMS encrypt operation.
      */
    var payload: String
  }
  object GetSecretsSecret {
    
    inline def apply(name: String, payload: String): GetSecretsSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretsSecret]
    }
    
    extension [Self <: GetSecretsSecret](x: Self) {
      
      inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "grantTokens", value.asInstanceOf[js.Any])
      
      inline def setGrantTokensUndefined: Self = StObject.set(x, "grantTokens", js.undefined)
      
      inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "grantTokens", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait GrantConstraint extends StObject {
    
    /**
      * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
      */
    var encryptionContextEquals: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
      */
    var encryptionContextSubset: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GrantConstraint {
    
    inline def apply(): GrantConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantConstraint]
    }
    
    extension [Self <: GrantConstraint](x: Self) {
      
      inline def setEncryptionContextEquals(value: StringDictionary[String]): Self = StObject.set(x, "encryptionContextEquals", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "encryptionContextEquals", js.undefined)
      
      inline def setEncryptionContextSubset(value: StringDictionary[String]): Self = StObject.set(x, "encryptionContextSubset", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "encryptionContextSubset", js.undefined)
    }
  }
}
