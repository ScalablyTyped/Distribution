package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  var memory: js.Any = js.native
  def assert(): Unit = js.native
  def assert(condition: scala.Boolean, data: js.Any*): Unit = js.native
  def clear(): Unit = js.native
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  def debug(data: js.Any*): Unit = js.native
  def dir(): Unit = js.native
  def dir(item: js.Any): Unit = js.native
  def dir(item: js.Any, options: js.Any): Unit = js.native
  def dirxml(data: js.Any*): Unit = js.native
  def error(data: js.Any*): Unit = js.native
  def exception(): Unit = js.native
  def exception(message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def group(data: js.Any*): Unit = js.native
  def groupCollapsed(data: js.Any*): Unit = js.native
  def groupEnd(): Unit = js.native
  def info(data: js.Any*): Unit = js.native
  def log(data: js.Any*): Unit = js.native
  def table(): Unit = js.native
  def table(tabularData: js.Any): Unit = js.native
  def table(tabularData: js.Any, properties: js.Array[java.lang.String]): Unit = js.native
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  def timeLog(): Unit = js.native
  def timeLog(label: java.lang.String, data: js.Any*): Unit = js.native
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  def trace(data: js.Any*): Unit = js.native
  def warn(data: js.Any*): Unit = js.native
}

