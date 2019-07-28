package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimestampFormatsArray extends js.Object {
  var timestampFormats: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_TimestampFormatsArray {
  @scala.inline
  def apply(timestampFormats: Input[js.Array[Input[String]]] = null): Anon_TimestampFormatsArray = {
    val __obj = js.Dynamic.literal()
    if (timestampFormats != null) __obj.updateDynamic("timestampFormats")(timestampFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TimestampFormatsArray]
  }
}

