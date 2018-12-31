package typings
package signaleLib.signaleMod.signaleNs

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

