package typings.atStorybookRouter.distUtilsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparatorOptions extends js.Object {
  var groupSeparator: String | RegExp
  var rootSeparator: String | RegExp
}

object SeparatorOptions {
  @scala.inline
  def apply(groupSeparator: String | RegExp, rootSeparator: String | RegExp): SeparatorOptions = {
    val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeparatorOptions]
  }
}

