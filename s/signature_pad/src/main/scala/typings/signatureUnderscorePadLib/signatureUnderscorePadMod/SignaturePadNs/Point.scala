package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var time: scala.Double
  var x: scala.Double
  var y: scala.Double
  def distanceTo(start: Point): scala.Double
  def velocityFrom(start: Point): scala.Double
}

