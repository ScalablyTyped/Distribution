package typings.serialport

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
  var includeDelimiter: js.UndefOr[Boolean] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: String | Buffer | js.Array[Double],
    includeDelimiter: js.UndefOr[Boolean] = js.undefined
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

