package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariEventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: SafariEventListener): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: SafariEventListener, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: SafariEventListener): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: SafariEventListener, useCapture: scala.Boolean): scala.Unit = js.native
}

