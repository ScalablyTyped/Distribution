package typings
package sinonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  var abort: js.Array[_]
  var error: js.Array[_]
  var load: js.Array[_]
  var progress: js.Array[_]
}

object Anon_Abort {
  @scala.inline
  def apply(abort: js.Array[_], error: js.Array[_], load: js.Array[_], progress: js.Array[_]): Anon_Abort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[Anon_Abort]
  }
}

