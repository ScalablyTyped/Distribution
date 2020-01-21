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
  def apply(condition: String = null, containerName: String = null): ContainerDependency = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDependency]
  }
}

