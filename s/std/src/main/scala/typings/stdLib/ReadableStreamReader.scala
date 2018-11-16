package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadableStreamReader extends js.Object {
  def cancel(): Promise[scala.Unit]
  def read(): Promise[_]
  def releaseLock(): scala.Unit
}

@JSGlobal("ReadableStreamReader")
@js.native
object ReadableStreamReader
  extends ScalablyTyped.runtime.Instantiable0[ReadableStreamReader]

