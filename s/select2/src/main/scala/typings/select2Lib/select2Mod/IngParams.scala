package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngParams extends js.Object {
  var name: select2Lib.select2LibStrings.select | select2Lib.select2LibStrings.open | select2Lib.select2LibStrings.close | select2Lib.select2LibStrings.unselect
  var prevented: scala.Boolean
}

object IngParams {
  @scala.inline
  def apply(
    name: select2Lib.select2LibStrings.select | select2Lib.select2LibStrings.open | select2Lib.select2LibStrings.close | select2Lib.select2LibStrings.unselect,
    prevented: scala.Boolean
  ): IngParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prevented = prevented)
  
    __obj.asInstanceOf[IngParams]
  }
}

