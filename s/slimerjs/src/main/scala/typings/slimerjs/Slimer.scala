package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slimer extends js.Object {
  var geckoVersion: Double = js.native
  var version: Double = js.native
  def clearHttpAuth(): Unit = js.native
  def exit(): Unit = js.native
  def exit(returnValue: Double): Unit = js.native
  def hasFeature(featureName: String): Boolean = js.native
  def isExiting(): Boolean = js.native
  def wait(milliseconds: Double): Unit = js.native
}

