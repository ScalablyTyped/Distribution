package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleDestinationAccessControlTranslation extends StObject {
  
  /**
    * The override value for the owner on replicated objects. Currently only `Destination` is supported.
    */
  var owner: String
}
object BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
  
  inline def apply(owner: String): BucketReplicationConfigurationRuleDestinationAccessControlTranslation = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]
  }
  
  extension [Self <: BucketReplicationConfigurationRuleDestinationAccessControlTranslation](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
