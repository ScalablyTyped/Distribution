package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketOwnershipControlsRule extends StObject {
  
  /**
    * Object ownership. Valid values: `BucketOwnerPreferred` or `ObjectWriter`
    */
  var objectOwnership: String
}
object BucketOwnershipControlsRule {
  
  @scala.inline
  def apply(objectOwnership: String): BucketOwnershipControlsRule = {
    val __obj = js.Dynamic.literal(objectOwnership = objectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOwnershipControlsRule]
  }
  
  @scala.inline
  implicit class BucketOwnershipControlsRuleMutableBuilder[Self <: BucketOwnershipControlsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectOwnership(value: String): Self = StObject.set(x, "objectOwnership", value.asInstanceOf[js.Any])
  }
}
