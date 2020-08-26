package typings.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var closed: Boolean = js.native
  var encoding: Encoding = js.native
  var path: String = js.native
  var tick: Double = js.native
  def onData(fn: js.Function1[/* chunk */ String | js.Array[Double], Unit]): Unit = js.native
  def onEnd(fn: js.Function0[Unit]): Unit = js.native
  def onError(fn: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def open(): Unit = js.native
}

object RNFetchBlobReadStream {
  @scala.inline
  def apply(
    closed: Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit,
    onEnd: js.Function0[Unit] => Unit,
    onError: js.Function1[/* err */ js.Any, Unit] => Unit,
    open: () => Unit,
    path: String,
    tick: Double
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onError = js.Any.fromFunction1(onError), open = js.Any.fromFunction0(open), path = path.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
  @scala.inline
  implicit class RNFetchBlobReadStreamOps[Self <: RNFetchBlobReadStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: Encoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnData(value: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit): Self = this.set("onData", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEnd(value: js.Function0[Unit] => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnError(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTick(value: Double): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
  }
  
}

