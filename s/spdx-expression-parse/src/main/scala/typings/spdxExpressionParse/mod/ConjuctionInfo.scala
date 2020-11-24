package typings.spdxExpressionParse.mod

import typings.spdxExpressionParse.spdxExpressionParseStrings.and
import typings.spdxExpressionParse.spdxExpressionParseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConjuctionInfo extends Info {
  
  var conjunction: and | or = js.native
  
  var left: LicenseInfo | ConjuctionInfo = js.native
  
  var right: LicenseInfo | ConjuctionInfo = js.native
}
object ConjuctionInfo {
  
  @scala.inline
  def apply(conjunction: and | or, left: LicenseInfo | ConjuctionInfo, right: LicenseInfo | ConjuctionInfo): ConjuctionInfo = {
    val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConjuctionInfo]
  }
  
  @scala.inline
  implicit class ConjuctionInfoOps[Self <: ConjuctionInfo] (val x: Self) extends AnyVal {
    
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
    def setConjunction(value: and | or): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: LicenseInfo | ConjuctionInfo): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: LicenseInfo | ConjuctionInfo): Self = this.set("right", value.asInstanceOf[js.Any])
  }
}
