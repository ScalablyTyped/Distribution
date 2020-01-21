package typings.safariExtensionContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariEventTarget extends js.Object {
  def addEventListener(`type`: String, listener: SafariEventListener): Unit = js.native
  def addEventListener(`type`: String, listener: SafariEventListener, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: SafariEventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: SafariEventListener, useCapture: Boolean): Unit = js.native
}

