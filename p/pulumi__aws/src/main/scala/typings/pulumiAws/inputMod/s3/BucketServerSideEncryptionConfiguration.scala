package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketServerSideEncryptionConfiguration extends StObject {
  
  /**
    * A single object for server-side encryption by default configuration. (documented below)
    */
  var rule: Input[BucketServerSideEncryptionConfigurationRule]
}
object BucketServerSideEncryptionConfiguration {
  
  inline def apply(rule: Input[BucketServerSideEncryptionConfigurationRule]): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
  
  extension [Self <: BucketServerSideEncryptionConfiguration](x: Self) {
    
    inline def setRule(value: Input[BucketServerSideEncryptionConfigurationRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
