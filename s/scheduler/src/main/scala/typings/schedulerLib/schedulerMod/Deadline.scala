package typings
package schedulerLib.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Deadline extends js.Object {
  var didTimeout: scala.Boolean
  def timeRemaining(): scala.Double
}

