package typings
package atStorybookRouterLib.distUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparatorOptions extends js.Object {
  var groupSeparator: java.lang.String | stdLib.RegExp
  var rootSeparator: java.lang.String | stdLib.RegExp
}

object SeparatorOptions {
  @scala.inline
  def apply(groupSeparator: java.lang.String | stdLib.RegExp, rootSeparator: java.lang.String | stdLib.RegExp): SeparatorOptions = {
    val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeparatorOptions]
  }
}

