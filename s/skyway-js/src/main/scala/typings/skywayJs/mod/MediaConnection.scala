package typings.skywayJs.mod

import typings.skywayJs.skywayJsStrings.close
import typings.skywayJs.skywayJsStrings.error
import typings.skywayJs.skywayJsStrings.media
import typings.skywayJs.skywayJsStrings.stream
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skyway-js", "MediaConnection")
@js.native
open class MediaConnection () extends Connection {
  
  def answer(): Unit = js.native
  def answer(stream: Unit, options: AnswerOption): Unit = js.native
  def answer(stream: MediaStream): Unit = js.native
  def answer(stream: MediaStream, options: AnswerOption): Unit = js.native
  
  var localStream: MediaStream = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("on")
  def on_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("once")
  def once_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
  
  def replaceStream(stream: MediaStream): Unit = js.native
  
  @JSName("type")
  var type_MediaConnection: media = js.native
}
