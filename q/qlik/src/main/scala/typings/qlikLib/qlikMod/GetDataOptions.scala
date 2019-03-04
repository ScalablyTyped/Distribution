package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataOptions extends js.Object {
  var frequencyMode: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.N
  var rows: scala.Double
}

object GetDataOptions {
  @scala.inline
  def apply(
    frequencyMode: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.N,
    rows: scala.Double
  ): GetDataOptions = {
    val __obj = js.Dynamic.literal(frequencyMode = frequencyMode.asInstanceOf[js.Any], rows = rows)
  
    __obj.asInstanceOf[GetDataOptions]
  }
}

