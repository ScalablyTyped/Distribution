package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimestampFormats extends js.Object {
  var timestampFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_TimestampFormats {
  @scala.inline
  def apply(timestampFormats: js.Array[java.lang.String] = null): Anon_TimestampFormats = {
    val __obj = js.Dynamic.literal()
    if (timestampFormats != null) __obj.updateDynamic("timestampFormats")(timestampFormats)
    __obj.asInstanceOf[Anon_TimestampFormats]
  }
}

