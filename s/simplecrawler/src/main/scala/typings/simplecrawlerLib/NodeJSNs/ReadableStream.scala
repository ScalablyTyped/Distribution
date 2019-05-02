package typings
package simplecrawlerLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream extends EventEmitter {
  var readable: scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: simplecrawlerLib.Anon_End): T = js.native
  def read(): java.lang.String | simplecrawlerLib.Buffer = js.native
  def read(size: scala.Double): java.lang.String | simplecrawlerLib.Buffer = js.native
  def resume(): this.type = js.native
  def setEncoding(): this.type = js.native
  def setEncoding(encoding: java.lang.String): this.type = js.native
  def unpipe[T /* <: WritableStream */](): this.type = js.native
  def unpipe[T /* <: WritableStream */](destination: T): this.type = js.native
  def unshift(chunk: java.lang.String): scala.Unit = js.native
  def unshift(chunk: simplecrawlerLib.Buffer): scala.Unit = js.native
  def wrap(oldStream: ReadableStream): ReadableStream = js.native
}

