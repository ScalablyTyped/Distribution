package typings
package progressDashStreamLib.progressDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressStream
  extends nodeLib.streamMod.Transform {
  // We have to redeclare all on/once overloads from stream.Transform in
  // order for this ProgressStream interface to extend stream.Transform
  // correctly. Using an intersection type instead may be an option once
  // https://github.com/Microsoft/TypeScript/issues/30031 is resolved.
  // stream.Readable events
  /* tslint:disable-next-line adjacent-overload-signatures */
  @JSName("on")
  def on_close(
    event: progressDashStreamLib.progressDashStreamLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_data(
    event: progressDashStreamLib.progressDashStreamLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  // stream.Writable events
  /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
  @JSName("on")
  def on_drain(
    event: progressDashStreamLib.progressDashStreamLibStrings.drain,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_end(event: progressDashStreamLib.progressDashStreamLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: progressDashStreamLib.progressDashStreamLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_finish(
    event: progressDashStreamLib.progressDashStreamLibStrings.finish,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_length(
    event: progressDashStreamLib.progressDashStreamLibStrings.length,
    listener: js.Function1[/* length */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: progressDashStreamLib.progressDashStreamLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(event: progressDashStreamLib.progressDashStreamLibStrings.progress, listener: ProgressListener): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_readable(
    event: progressDashStreamLib.progressDashStreamLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_unpipe(
    event: progressDashStreamLib.progressDashStreamLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line adjacent-overload-signatures */
  @JSName("once")
  def once_close(
    event: progressDashStreamLib.progressDashStreamLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_data(
    event: progressDashStreamLib.progressDashStreamLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
  @JSName("once")
  def once_drain(
    event: progressDashStreamLib.progressDashStreamLibStrings.drain,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_end(event: progressDashStreamLib.progressDashStreamLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: progressDashStreamLib.progressDashStreamLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_finish(
    event: progressDashStreamLib.progressDashStreamLibStrings.finish,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_length(
    event: progressDashStreamLib.progressDashStreamLibStrings.length,
    listener: js.Function1[/* length */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pipe(
    event: progressDashStreamLib.progressDashStreamLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_progress(event: progressDashStreamLib.progressDashStreamLibStrings.progress, listener: ProgressListener): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_readable(
    event: progressDashStreamLib.progressDashStreamLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_unpipe(
    event: progressDashStreamLib.progressDashStreamLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  def progress(): Progress = js.native
  def setLength(length: scala.Double): scala.Unit = js.native
}

