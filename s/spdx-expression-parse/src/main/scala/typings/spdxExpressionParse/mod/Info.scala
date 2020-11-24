package typings.spdxExpressionParse.mod

import typings.spdxExpressionParse.spdxExpressionParseStrings.and
import typings.spdxExpressionParse.spdxExpressionParseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.spdxExpressionParse.mod.LicenseInfo
  - typings.spdxExpressionParse.mod.ConjuctionInfo
*/
trait Info extends js.Object
object Info {
  
  @scala.inline
  def LicenseInfo(license: String): Info = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  def ConjuctionInfo(
    conjunction: and | or,
    left: LicenseInfo | typings.spdxExpressionParse.mod.ConjuctionInfo,
    right: LicenseInfo | typings.spdxExpressionParse.mod.ConjuctionInfo
  ): Info = {
    val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}
