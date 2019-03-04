package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def atEnd(): scala.Boolean
  def close(): scala.Unit
  def flush(): scala.Unit
  def read(): java.lang.String
  def readLine(): java.lang.String
  def seek(position: scala.Double): scala.Unit
  def write(data: java.lang.String): scala.Unit
  def writeLine(data: java.lang.String): scala.Unit
}

object Stream {
  @scala.inline
  def apply(
    atEnd: js.Function0[scala.Boolean],
    close: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    read: js.Function0[java.lang.String],
    readLine: js.Function0[java.lang.String],
    seek: js.Function1[scala.Double, scala.Unit],
    write: js.Function1[java.lang.String, scala.Unit],
    writeLine: js.Function1[java.lang.String, scala.Unit]
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = atEnd, close = close, flush = flush, read = read, readLine = readLine, seek = seek, write = write, writeLine = writeLine)
  
    __obj.asInstanceOf[Stream]
  }
}

