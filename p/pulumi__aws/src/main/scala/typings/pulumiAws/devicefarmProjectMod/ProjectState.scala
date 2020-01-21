package typings.pulumiAws.devicefarmProjectMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectState extends js.Object {
  /**
    * The Amazon Resource Name of this project
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the project
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ProjectState {
  @scala.inline
  def apply(arn: Input[String] = null, name: Input[String] = null): ProjectState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectState]
  }
}

