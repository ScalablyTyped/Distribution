package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slimer extends js.Object {
  var geckoVersion: scala.Double = js.native
  var version: scala.Double = js.native
  def clearHttpAuth(): scala.Unit = js.native
  def exit(): scala.Unit = js.native
  def exit(returnValue: scala.Double): scala.Unit = js.native
  def hasFeature(featureName: java.lang.String): scala.Boolean = js.native
  def isExiting(): scala.Boolean = js.native
  def wait(milliseconds: scala.Double): scala.Unit = js.native
}

