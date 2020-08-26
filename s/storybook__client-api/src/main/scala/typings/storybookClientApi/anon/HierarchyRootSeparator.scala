package typings.storybookClientApi.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyRootSeparator extends js.Object {
  var hierarchyRootSeparator: String = js.native
  var hierarchySeparator: RegExp = js.native
}

object HierarchyRootSeparator {
  @scala.inline
  def apply(hierarchyRootSeparator: String, hierarchySeparator: RegExp): HierarchyRootSeparator = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator.asInstanceOf[js.Any], hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRootSeparator]
  }
  @scala.inline
  implicit class HierarchyRootSeparatorOps[Self <: HierarchyRootSeparator] (val x: Self) extends AnyVal {
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
    def setHierarchyRootSeparator(value: String): Self = this.set("hierarchyRootSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchySeparator(value: RegExp): Self = this.set("hierarchySeparator", value.asInstanceOf[js.Any])
  }
  
}

