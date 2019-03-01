package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataInputString extends js.Object {
  var data: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DataInputString {
  @scala.inline
  def apply(data: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): Anon_DataInputString = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataInputString]
  }
}

