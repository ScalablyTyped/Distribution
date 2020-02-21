package typings.reactNativeBackgroundDownloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadTask extends js.Object {
  @JSName("_beginHandler")
  var _beginHandler_Original: BeginHandler = js.native
  @JSName("_doneHandler")
  var _doneHandler_Original: DoneHandler = js.native
  @JSName("_errorHandler")
  var _errorHandler_Original: ErrorHandler = js.native
  @JSName("_progressHandler")
  var _progressHandler_Original: ProgressHandler = js.native
  var bytesWritten: Double = js.native
  var id: String = js.native
  var percent: Double = js.native
  var state: DownloadTaskState = js.native
  var totalBytes: Double = js.native
  def _beginHandler(expectedBytes: Double): js.Any = js.native
  def _doneHandler(): js.Any = js.native
  def _errorHandler(error: js.Any, errorCode: js.Any): js.Any = js.native
  def _progressHandler(percent: Double, bytesWritten: Double, totalBytes: Double): js.Any = js.native
  def begin(handler: BeginHandler): DownloadTask = js.native
  def done(handler: DoneHandler): DownloadTask = js.native
  def error(handler: ErrorHandler): DownloadTask = js.native
  def pause(): js.Any = js.native
  def progress(handler: ProgressHandler): DownloadTask = js.native
  def resume(): js.Any = js.native
  def stop(): js.Any = js.native
}

