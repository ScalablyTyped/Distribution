package typings
package stdDashMocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var stderr: stdDashMocksLib.stdDashMocksLibNumbers.`false`
  var stdout: stdDashMocksLib.stdDashMocksLibNumbers.`false`
}

object Anon_False {
  @scala.inline
  def apply(
    stderr: stdDashMocksLib.stdDashMocksLibNumbers.`false`,
    stdout: stdDashMocksLib.stdDashMocksLibNumbers.`false`
  ): Anon_False = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stderr")(stderr)
    __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[Anon_False]
  }
}

