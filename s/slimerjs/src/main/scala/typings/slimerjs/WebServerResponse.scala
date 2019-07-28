package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServerResponse extends js.Object {
  var headers: StringDictionary[String] = js.native
  var statusCode: Double = js.native
  def close(): Unit = js.native
  def closeGracefully(): Unit = js.native
  def header(name: String): String = js.native
  def setEncoding(encoding: String): Unit = js.native
  def setHeader(name: String, value: String): Unit = js.native
  def write(data: String): Unit = js.native
  def writeHead(statusCode: Double): Unit = js.native
  def writeHead(statusCode: Double, headers: StringDictionary[String]): Unit = js.native
}

