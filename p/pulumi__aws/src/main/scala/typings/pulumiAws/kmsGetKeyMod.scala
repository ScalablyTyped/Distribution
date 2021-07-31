package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmsGetKeyMod {
  
  @JSImport("@pulumi/aws/kms/getKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetKeyResult]]
  @scala.inline
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetKeyResult]]
  
  trait GetKeyArgs extends StObject {
    
    /**
      * List of grant tokens
      */
    val grantTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Key identifier which can be one of the following format:
      * * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
      * * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
      * * Alias name. E.g.: `alias/my-key`
      * * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
      */
    val keyId: String
  }
  object GetKeyArgs {
    
    @scala.inline
    def apply(keyId: String): GetKeyArgs = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyArgs]
    }
    
    @scala.inline
    implicit class GetKeyArgsMutableBuilder[Self <: GetKeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "grantTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokensUndefined: Self = StObject.set(x, "grantTokens", js.undefined)
      
      @scala.inline
      def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "grantTokens", js.Array(value :_*))
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetKeyResult extends StObject {
    
    val arn: String
    
    val awsAccountId: String
    
    val creationDate: String
    
    val customerMasterKeySpec: String
    
    val deletionDate: String
    
    val description: String
    
    val enabled: Boolean
    
    val expirationModel: String
    
    val grantTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val keyId: String
    
    val keyManager: String
    
    val keyState: String
    
    val keyUsage: String
    
    val origin: String
    
    val validTo: String
  }
  object GetKeyResult {
    
    @scala.inline
    def apply(
      arn: String,
      awsAccountId: String,
      creationDate: String,
      customerMasterKeySpec: String,
      deletionDate: String,
      description: String,
      enabled: Boolean,
      expirationModel: String,
      id: String,
      keyId: String,
      keyManager: String,
      keyState: String,
      keyUsage: String,
      origin: String,
      validTo: String
    ): GetKeyResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], awsAccountId = awsAccountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], customerMasterKeySpec = customerMasterKeySpec.asInstanceOf[js.Any], deletionDate = deletionDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expirationModel = expirationModel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], keyManager = keyManager.asInstanceOf[js.Any], keyState = keyState.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyResult]
    }
    
    @scala.inline
    implicit class GetKeyResultMutableBuilder[Self <: GetKeyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsAccountId(value: String): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerMasterKeySpec(value: String): Self = StObject.set(x, "customerMasterKeySpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionDate(value: String): Self = StObject.set(x, "deletionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationModel(value: String): Self = StObject.set(x, "expirationModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "grantTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokensUndefined: Self = StObject.set(x, "grantTokens", js.undefined)
      
      @scala.inline
      def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "grantTokens", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyManager(value: String): Self = StObject.set(x, "keyManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyState(value: String): Self = StObject.set(x, "keyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUsage(value: String): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidTo(value: String): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
    }
  }
}
