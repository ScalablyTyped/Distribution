package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchySeparator extends js.Object {
  var hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.undefined
  var hierarchySeparator: String
}

object HierarchySeparator {
  @scala.inline
  def apply(hierarchySeparator: String): HierarchySeparator = {
    val __obj = js.Dynamic.literal(hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchySeparator]
  }
}

