package typings.recordrtc.mod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recordrtc", JSImport.Namespace)
@js.native
class ^ protected () extends RecordRTC {
  def this(stream: HTMLCanvasElement) = this()
  def this(stream: HTMLElement) = this()
  def this(stream: HTMLVideoElement) = this()
  def this(stream: MediaStream) = this()
  def this(stream: HTMLCanvasElement, options: Options) = this()
  def this(stream: HTMLElement, options: Options) = this()
  def this(stream: HTMLVideoElement, options: Options) = this()
  def this(stream: MediaStream, options: Options) = this()
}
@JSImport("recordrtc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** Given a number of bytes, this returns a human-readable string, e.g. 1.23 MB */
  def bytesToSize(size: Double): String = js.native
  
  /** invokes the browser's Save-As dialog */
  def invokeSaveAsDialog(file: Blob, fileName: String): Unit = js.native
  def invokeSaveAsDialog(file: File, fileName: String): Unit = js.native
  
  //
  // static helpers
  //
  /** RecordRTC version */
  var version: String = js.native
}
