package typings
package signaleLib.signaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandType extends js.Object {
  /** The icon corresponding to the logger. */
  var badge: java.lang.String
  /**
    * The color of the label, can be any of the foreground colors supported by
    * [chalk](https://github.com/chalk/chalk#colors).
    */
  var color: java.lang.String
  /** The label used to identify the type of the logger. */
  var label: java.lang.String
}

object CommandType {
  @scala.inline
  def apply(badge: java.lang.String, color: java.lang.String, label: java.lang.String): CommandType = {
    val __obj = js.Dynamic.literal(badge = badge, color = color, label = label)
  
    __obj.asInstanceOf[CommandType]
  }
}

