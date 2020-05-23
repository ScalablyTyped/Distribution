package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDialogElement extends HTMLElement {
  var open: scala.Boolean = js.native
  var returnValue: java.lang.String = js.native
  def close(): Unit = js.native
  def close(returnValue: java.lang.String): Unit = js.native
  def show(): Unit = js.native
  def showModal(): Unit = js.native
}

