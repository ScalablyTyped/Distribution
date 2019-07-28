package typings.progressDashStream.progressDashStreamMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.progressDashStream.progressDashStreamStrings.close
import typings.progressDashStream.progressDashStreamStrings.data
import typings.progressDashStream.progressDashStreamStrings.drain
import typings.progressDashStream.progressDashStreamStrings.end
import typings.progressDashStream.progressDashStreamStrings.error
import typings.progressDashStream.progressDashStreamStrings.finish
import typings.progressDashStream.progressDashStreamStrings.length
import typings.progressDashStream.progressDashStreamStrings.pipe
import typings.progressDashStream.progressDashStreamStrings.progress
import typings.progressDashStream.progressDashStreamStrings.readable
import typings.progressDashStream.progressDashStreamStrings.unpipe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressStream extends Transform {
  // We have to redeclare all on/once overloads from stream.Transform in
  // order for this ProgressStream interface to extend stream.Transform
  // correctly. Using an intersection type instead may be an option once
  // https://github.com/Microsoft/TypeScript/issues/30031 is resolved.
  // stream.Readable events
  /* tslint:disable-next-line adjacent-overload-signatures */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  // stream.Writable events
  /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_length(event: length, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: ProgressListener): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  /* tslint:disable-next-line adjacent-overload-signatures */
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_length(event: length, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_progress(event: progress, listener: ProgressListener): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* tslint:disable-next-line unified-signatures */
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def progress(): Progress = js.native
  def setLength(length: Double): Unit = js.native
}

