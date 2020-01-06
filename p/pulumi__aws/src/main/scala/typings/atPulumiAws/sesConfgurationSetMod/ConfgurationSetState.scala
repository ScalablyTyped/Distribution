package typings.atPulumiAws.sesConfgurationSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfgurationSetState extends js.Object {
  val name: js.UndefOr[Input[String]] = js.native
}

object ConfgurationSetState {
  @scala.inline
  def apply(name: Input[String] = null): ConfgurationSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfgurationSetState]
  }
}

