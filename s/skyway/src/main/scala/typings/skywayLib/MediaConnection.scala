package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaConnection")
@js.native
class MediaConnection () extends js.Object {
  var metadata: js.Any = js.native
  var open: scala.Boolean = js.native
  var peer: java.lang.String = js.native
  var remoteId: java.lang.String = js.native
  def answer(stream: stdLib.MediaStream): js.UndefOr[scala.Nothing] = js.native
  def answer(stream: stdLib.MediaStream, options: AnswerOptions): js.UndefOr[scala.Nothing] = js.native
  def close(): js.UndefOr[scala.Unit] = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: skywayLib.skywayLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_removeStream(
    event: skywayLib.skywayLibStrings.removeStream,
    cb: js.Function1[/* reamoteStream */ stdLib.MediaStream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_stream(
    event: skywayLib.skywayLibStrings.stream,
    cb: js.Function1[/* stream */ stdLib.MediaStream, scala.Unit]
  ): scala.Unit = js.native
  def replaceStream(stream: stdLib.MediaStream): js.UndefOr[scala.Nothing] = js.native
}

