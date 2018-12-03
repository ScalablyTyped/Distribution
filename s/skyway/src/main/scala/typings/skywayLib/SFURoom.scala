package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFURoom")
@js.native
class SFURoom () extends js.Object {
  def close(): js.UndefOr[scala.Nothing] = js.native
  def getLog(): js.UndefOr[scala.Nothing] = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: skywayLib.skywayLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_data(event: skywayLib.skywayLibStrings.data, cb: js.Function1[/* object */ DataObject, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_log(
    event: skywayLib.skywayLibStrings.log,
    cb: js.Function1[/* logs */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_open(event: skywayLib.skywayLibStrings.open, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_peerJoin(
    event: skywayLib.skywayLibStrings.peerJoin,
    cb: js.Function1[/* peerId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_peerLeave(
    event: skywayLib.skywayLibStrings.peerLeave,
    cb: js.Function1[/* peerId */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_removeStream(
    event: skywayLib.skywayLibStrings.removeStream,
    cb: js.Function1[/* stream */ stdLib.MediaStream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_stream(
    event: skywayLib.skywayLibStrings.stream,
    cb: js.Function1[/* stream */ stdLib.MediaStream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("once")
  def once_log(
    event: skywayLib.skywayLibStrings.log,
    cb: js.Function1[/* logs */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def replaceStream(stream: stdLib.MediaSource): js.UndefOr[scala.Nothing] = js.native
  def send(data: js.Any): js.UndefOr[scala.Nothing] = js.native
}

