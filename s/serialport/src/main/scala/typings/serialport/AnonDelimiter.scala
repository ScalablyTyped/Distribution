package typings.serialport

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelimiter extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
  var includeDelimiter: js.UndefOr[Boolean] = js.undefined
}

object AnonDelimiter {
  @scala.inline
  def apply(
    delimiter: String | Buffer | js.Array[Double],
    includeDelimiter: js.UndefOr[Boolean] = js.undefined
  ): AnonDelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelimiter]
  }
}

