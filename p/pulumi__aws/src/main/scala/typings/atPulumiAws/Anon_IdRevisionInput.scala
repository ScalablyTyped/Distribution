package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdRevisionInput extends js.Object {
  var id: js.UndefOr[Input[String]] = js.undefined
  var revision: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_IdRevisionInput {
  @scala.inline
  def apply(id: Input[String] = null, revision: Input[Double] = null): Anon_IdRevisionInput = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdRevisionInput]
  }
}

