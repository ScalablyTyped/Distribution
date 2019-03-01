package typings
package stdDashMocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stdout extends js.Object {
  var stdout: js.Array[java.lang.String]
}

object Anon_Stdout {
  @scala.inline
  def apply(stdout: js.Array[java.lang.String]): Anon_Stdout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[Anon_Stdout]
  }
}

