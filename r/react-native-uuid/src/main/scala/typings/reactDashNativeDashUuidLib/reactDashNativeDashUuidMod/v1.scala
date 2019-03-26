package typings
package reactDashNativeDashUuidLib.reactDashNativeDashUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait v1 extends js.Object {
  var clockseq: scala.Double
  var msecs: scala.Double | stdLib.Date
  var node: js.Array[scala.Double]
  var nsecs: scala.Double
}

object v1 {
  @scala.inline
  def apply(
    clockseq: scala.Double,
    msecs: scala.Double | stdLib.Date,
    node: js.Array[scala.Double],
    nsecs: scala.Double
  ): v1 = {
    val __obj = js.Dynamic.literal(clockseq = clockseq, msecs = msecs.asInstanceOf[js.Any], node = node, nsecs = nsecs)
  
    __obj.asInstanceOf[v1]
  }
}

