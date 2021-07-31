package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketServerSideEncryptionConfiguration extends StObject {
  
  /**
    * A single object for server-side encryption by default configuration. (documented below)
    */
  var rule: BucketServerSideEncryptionConfigurationRule
}
object BucketServerSideEncryptionConfiguration {
  
  @scala.inline
  def apply(rule: BucketServerSideEncryptionConfigurationRule): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationMutableBuilder[Self <: BucketServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: BucketServerSideEncryptionConfigurationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
