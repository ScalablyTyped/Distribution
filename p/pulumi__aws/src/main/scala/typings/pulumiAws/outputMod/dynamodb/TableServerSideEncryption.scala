package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableServerSideEncryption extends StObject {
  
  /**
    * Indicates whether ttl is enabled (true) or disabled (false).
    */
  var enabled: Boolean = js.native
  
  /**
    * The ARN of the CMK that should be used for the AWS KMS encryption.
    * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
    */
  var kmsKeyArn: String = js.native
}
object TableServerSideEncryption {
  
  @scala.inline
  def apply(enabled: Boolean, kmsKeyArn: String): TableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableServerSideEncryption]
  }
  
  @scala.inline
  implicit class TableServerSideEncryptionMutableBuilder[Self <: TableServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
