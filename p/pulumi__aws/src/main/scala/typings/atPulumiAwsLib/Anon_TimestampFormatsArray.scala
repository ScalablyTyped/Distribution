package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimestampFormatsArray extends js.Object {
  var timestampFormats: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_TimestampFormatsArray {
  @scala.inline
  def apply(
    timestampFormats: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_TimestampFormatsArray = {
    val __obj = js.Dynamic.literal()
    if (timestampFormats != null) __obj.updateDynamic("timestampFormats")(timestampFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TimestampFormatsArray]
  }
}

