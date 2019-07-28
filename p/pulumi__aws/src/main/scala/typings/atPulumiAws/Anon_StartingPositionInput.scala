package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartingPositionInput extends js.Object {
  var startingPosition: js.UndefOr[Input[String]] = js.undefined
}

object Anon_StartingPositionInput {
  @scala.inline
  def apply(startingPosition: Input[String] = null): Anon_StartingPositionInput = {
    val __obj = js.Dynamic.literal()
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StartingPositionInput]
  }
}

