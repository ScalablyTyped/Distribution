package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketOwnershipControlsRule extends js.Object {
  
  /**
    * Object ownership. Valid values: `BucketOwnerPreferred` or `ObjectWriter`
    */
  var objectOwnership: String = js.native
}
object BucketOwnershipControlsRule {
  
  @scala.inline
  def apply(objectOwnership: String): BucketOwnershipControlsRule = {
    val __obj = js.Dynamic.literal(objectOwnership = objectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOwnershipControlsRule]
  }
  
  @scala.inline
  implicit class BucketOwnershipControlsRuleOps[Self <: BucketOwnershipControlsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectOwnership(value: String): Self = this.set("objectOwnership", value.asInstanceOf[js.Any])
  }
}
