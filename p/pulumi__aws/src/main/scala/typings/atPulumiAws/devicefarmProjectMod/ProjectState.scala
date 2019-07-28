package typings.atPulumiAws.devicefarmProjectMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectState extends js.Object {
  /**
    * The Amazon Resource Name of this project
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the project
    */
  val name: js.UndefOr[Input[String]] = js.undefined
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

