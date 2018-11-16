package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadableStream extends js.Object {
  val locked: scala.Boolean
  def cancel(): Promise[scala.Unit]
  def getReader(): ReadableStreamReader
}

@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends ScalablyTyped.runtime.Instantiable0[ReadableStream]

