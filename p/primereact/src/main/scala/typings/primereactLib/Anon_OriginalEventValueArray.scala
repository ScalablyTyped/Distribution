package typings
package primereactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalEventValueArray extends js.Object {
  var originalEvent: stdLib.Event
  var value: stdLib.Date | js.Array[stdLib.Date]
}

object Anon_OriginalEventValueArray {
  @scala.inline
  def apply(originalEvent: stdLib.Event, value: stdLib.Date | js.Array[stdLib.Date]): Anon_OriginalEventValueArray = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OriginalEventValueArray]
  }
}

