package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRuleDestinationAccessControlTranslation extends StObject {
  
  /**
    * The override value for the owner on replicated objects. Currently only `Destination` is supported.
    */
  var owner: Input[String] = js.native
}
object BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
  
  @scala.inline
  def apply(owner: Input[String]): BucketReplicationConfigurationRuleDestinationAccessControlTranslation = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleDestinationAccessControlTranslationMutableBuilder[Self <: BucketReplicationConfigurationRuleDestinationAccessControlTranslation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
