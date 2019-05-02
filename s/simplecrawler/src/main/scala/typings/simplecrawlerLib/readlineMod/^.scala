package typings
package simplecrawlerLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearLine(stream: simplecrawlerLib.NodeJSNs.WritableStream, dir: scala.Double): scala.Unit = js.native
  def clearScreenDown(stream: simplecrawlerLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def createInterface(input: simplecrawlerLib.NodeJSNs.ReadableStream): ReadLine = js.native
  def createInterface(input: simplecrawlerLib.NodeJSNs.ReadableStream, output: simplecrawlerLib.NodeJSNs.WritableStream): ReadLine = js.native
  def createInterface(
    input: simplecrawlerLib.NodeJSNs.ReadableStream,
    output: simplecrawlerLib.NodeJSNs.WritableStream,
    completer: AsyncCompleter
  ): ReadLine = js.native
  def createInterface(
    input: simplecrawlerLib.NodeJSNs.ReadableStream,
    output: simplecrawlerLib.NodeJSNs.WritableStream,
    completer: AsyncCompleter,
    terminal: scala.Boolean
  ): ReadLine = js.native
  def createInterface(
    input: simplecrawlerLib.NodeJSNs.ReadableStream,
    output: simplecrawlerLib.NodeJSNs.WritableStream,
    completer: Completer
  ): ReadLine = js.native
  def createInterface(
    input: simplecrawlerLib.NodeJSNs.ReadableStream,
    output: simplecrawlerLib.NodeJSNs.WritableStream,
    completer: Completer,
    terminal: scala.Boolean
  ): ReadLine = js.native
  def createInterface(options: ReadLineOptions): ReadLine = js.native
  def cursorTo(stream: simplecrawlerLib.NodeJSNs.WritableStream, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveCursor(stream: simplecrawlerLib.NodeJSNs.WritableStream, dx: java.lang.String, dy: java.lang.String): scala.Unit = js.native
  def moveCursor(stream: simplecrawlerLib.NodeJSNs.WritableStream, dx: java.lang.String, dy: scala.Double): scala.Unit = js.native
  def moveCursor(stream: simplecrawlerLib.NodeJSNs.WritableStream, dx: scala.Double, dy: java.lang.String): scala.Unit = js.native
  def moveCursor(stream: simplecrawlerLib.NodeJSNs.WritableStream, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
}

