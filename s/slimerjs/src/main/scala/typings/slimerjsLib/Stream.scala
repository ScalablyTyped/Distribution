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

