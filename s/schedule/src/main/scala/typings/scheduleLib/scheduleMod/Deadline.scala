package typings
package scheduleLib.scheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Deadline extends js.Object {
  var didTimeout: scala.Boolean
  def timeRemaining(): scala.Double
}

