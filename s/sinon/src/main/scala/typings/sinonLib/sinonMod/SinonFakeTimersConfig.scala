package typings
package sinonLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeTimersConfig extends js.Object {
  var now: scala.Double | stdLib.Date
  var shouldAdvanceTime: scala.Boolean
  var toFake: js.Array[java.lang.String]
}

object SinonFakeTimersConfig {
  @scala.inline
  def apply(
    now: scala.Double | stdLib.Date,
    shouldAdvanceTime: scala.Boolean,
    toFake: js.Array[java.lang.String]
  ): SinonFakeTimersConfig = {
    val __obj = js.Dynamic.literal(now = now.asInstanceOf[js.Any], shouldAdvanceTime = shouldAdvanceTime, toFake = toFake)
  
    __obj.asInstanceOf[SinonFakeTimersConfig]
  }
}

