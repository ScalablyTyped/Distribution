package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[shelljsLib.shelljsLibNumbers.`false`] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(async: shelljsLib.shelljsLibNumbers.`false` = null): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async)
    __obj.asInstanceOf[Anon_Async]
  }
}

