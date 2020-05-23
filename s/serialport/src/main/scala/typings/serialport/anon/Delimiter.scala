package typings.serialport.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
  var includeDelimiter: js.UndefOr[Boolean] = js.undefined
}

object Delimiter {
  @scala.inline
  def apply(
    delimiter: String | Buffer | js.Array[Double],
    includeDelimiter: js.UndefOr[Boolean] = js.undefined
  ): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
}

