package typings
package rsyncLib.rsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var action: java.lang.String
  var pattern: java.lang.String
}

object Pattern {
  @scala.inline
  def apply(action: java.lang.String, pattern: java.lang.String): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[Pattern]
  }
}

