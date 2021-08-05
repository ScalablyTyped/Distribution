package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableServerSideEncryption extends StObject {
  
  var enabled: Boolean
  
  var kmsKeyArn: String
}
object GetTableServerSideEncryption {
  
  inline def apply(enabled: Boolean, kmsKeyArn: String): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
  
  extension [Self <: GetTableServerSideEncryption](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
