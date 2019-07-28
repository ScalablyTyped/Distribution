package typings.atPulumiAws.devicefarmProjectMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectArgs extends js.Object {
  /**
    * The name of the project
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object ProjectArgs {
  @scala.inline
  def apply(name: Input[String] = null): ProjectArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArgs]
  }
}

