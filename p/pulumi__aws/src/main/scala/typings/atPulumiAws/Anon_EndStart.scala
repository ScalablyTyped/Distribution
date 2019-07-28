package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndStart extends js.Object {
  var end: js.UndefOr[Input[String]] = js.undefined
  var start: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EndStart {
  @scala.inline
  def apply(end: Input[String] = null, start: Input[String] = null): Anon_EndStart = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndStart]
  }
}

