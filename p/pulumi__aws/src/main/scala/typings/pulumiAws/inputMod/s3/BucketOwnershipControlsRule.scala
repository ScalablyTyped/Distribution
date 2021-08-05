package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketOwnershipControlsRule extends StObject {
  
  /**
    * Object ownership. Valid values: `BucketOwnerPreferred` or `ObjectWriter`
    */
  var objectOwnership: Input[String]
}
object BucketOwnershipControlsRule {
  
  inline def apply(objectOwnership: Input[String]): BucketOwnershipControlsRule = {
    val __obj = js.Dynamic.literal(objectOwnership = objectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOwnershipControlsRule]
  }
  
  extension [Self <: BucketOwnershipControlsRule](x: Self) {
    
    inline def setObjectOwnership(value: Input[String]): Self = StObject.set(x, "objectOwnership", value.asInstanceOf[js.Any])
  }
}
