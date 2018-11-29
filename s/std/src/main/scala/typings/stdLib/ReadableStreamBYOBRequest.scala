package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadableStreamBYOBRequest extends js.Object {
  val view: ArrayBufferView
  def respond(bytesWritten: scala.Double): scala.Unit
  def respondWithNewView(view: ArrayBufferView): scala.Unit
}

