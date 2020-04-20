package typings.storybookClientApi

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHierarchyRootSeparator extends js.Object {
  var hierarchyRootSeparator: String
  var hierarchySeparator: RegExp
}

object AnonHierarchyRootSeparator {
  @scala.inline
  def apply(hierarchyRootSeparator: String, hierarchySeparator: RegExp): AnonHierarchyRootSeparator = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator.asInstanceOf[js.Any], hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHierarchyRootSeparator]
  }
}

