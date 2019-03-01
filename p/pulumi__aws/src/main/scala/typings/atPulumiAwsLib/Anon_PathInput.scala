package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathInput extends js.Object {
  var path: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_PathInput {
  @scala.inline
  def apply(path: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_PathInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PathInput]
  }
}

