package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignDefinition extends js.Object {
  var datetime: stdLib.Date
  var text: java.lang.String
  var time: scala.Double
  var username: java.lang.String
}

object SignDefinition {
  @scala.inline
  def apply(datetime: stdLib.Date, text: java.lang.String, time: scala.Double, username: java.lang.String): SignDefinition = {
    val __obj = js.Dynamic.literal(datetime = datetime, text = text, time = time, username = username)
  
    __obj.asInstanceOf[SignDefinition]
  }
}

