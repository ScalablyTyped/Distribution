package typings.storybookClientApi.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyRootSeparator extends js.Object {
  var hierarchyRootSeparator: String
  var hierarchySeparator: RegExp
}

object HierarchyRootSeparator {
  @scala.inline
  def apply(hierarchyRootSeparator: String, hierarchySeparator: RegExp): HierarchyRootSeparator = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator.asInstanceOf[js.Any], hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRootSeparator]
  }
}

