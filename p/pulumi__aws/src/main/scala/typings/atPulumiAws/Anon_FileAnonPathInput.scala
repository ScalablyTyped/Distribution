package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileAnonPathInput extends js.Object {
  var file: js.UndefOr[Input[Anon_PathInput]] = js.undefined
}

object Anon_FileAnonPathInput {
  @scala.inline
  def apply(file: Input[Anon_PathInput] = null): Anon_FileAnonPathInput = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FileAnonPathInput]
  }
}

