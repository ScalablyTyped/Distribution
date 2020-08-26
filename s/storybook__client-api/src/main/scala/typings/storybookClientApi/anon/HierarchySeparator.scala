package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchySeparator extends js.Object {
  var hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.native
  var hierarchySeparator: String = js.native
}

object HierarchySeparator {
  @scala.inline
  def apply(hierarchySeparator: String): HierarchySeparator = {
    val __obj = js.Dynamic.literal(hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchySeparator]
  }
  @scala.inline
  implicit class HierarchySeparatorOps[Self <: HierarchySeparator] (val x: Self) extends AnyVal {
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
    def setHierarchySeparator(value: String): Self = this.set("hierarchySeparator", value.asInstanceOf[js.Any])
  }
  
}

