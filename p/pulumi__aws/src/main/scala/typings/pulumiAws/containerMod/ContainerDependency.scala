package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDependency extends js.Object {
  var condition: js.UndefOr[String] = js.native
  var containerName: js.UndefOr[String] = js.native
}

object ContainerDependency {
  @scala.inline
  def apply(): ContainerDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDependency]
  }
  @scala.inline
  implicit class ContainerDependencyOps[Self <: ContainerDependency] (val x: Self) extends AnyVal {
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
  }
  
}

