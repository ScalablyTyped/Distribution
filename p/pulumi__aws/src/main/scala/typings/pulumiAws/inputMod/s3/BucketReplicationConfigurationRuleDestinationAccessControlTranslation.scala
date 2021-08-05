package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleDestinationAccessControlTranslation extends StObject {
  
  /**
    * The override value for the owner on replicated objects. Currently only `Destination` is supported.
    */
  var owner: Input[String]
}
object BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
  
  inline def apply(owner: Input[String]): BucketReplicationConfigurationRuleDestinationAccessControlTranslation = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]
  }
  
  extension [Self <: BucketReplicationConfigurationRuleDestinationAccessControlTranslation](x: Self) {
    
    inline def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
