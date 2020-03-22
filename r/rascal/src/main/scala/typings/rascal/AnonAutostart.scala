package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutostart extends js.Object {
  var autostart: Boolean
  var evictionRunIntervalMillis: Double
  var idleTimeoutMillis: Double
  var max: Double
  var min: Double
  var testOnBorrow: Boolean
}

object AnonAutostart {
  @scala.inline
  def apply(
    autostart: Boolean,
    evictionRunIntervalMillis: Double,
    idleTimeoutMillis: Double,
    max: Double,
    min: Double,
    testOnBorrow: Boolean
  ): AnonAutostart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any], evictionRunIntervalMillis = evictionRunIntervalMillis.asInstanceOf[js.Any], idleTimeoutMillis = idleTimeoutMillis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], testOnBorrow = testOnBorrow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutostart]
  }
}

