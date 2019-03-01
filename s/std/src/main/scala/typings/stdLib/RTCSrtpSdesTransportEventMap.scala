package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSrtpSdesTransportEventMap extends js.Object {
  var error: Event
}

object RTCSrtpSdesTransportEventMap {
  @scala.inline
  def apply(error: Event): RTCSrtpSdesTransportEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[RTCSrtpSdesTransportEventMap]
  }
}

