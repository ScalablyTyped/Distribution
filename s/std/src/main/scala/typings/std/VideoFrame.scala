package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame) */
@js.native
trait VideoFrame
  extends StObject
     with CanvasImageSource
     with TexImageSource
     with _Transferable {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize) */
  /* standard dom */
  def allocationSize(): Double = js.native
  def allocationSize(options: VideoFrameCopyToOptions): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedHeight) */
  /* standard dom */
  val codedHeight: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedRect) */
  /* standard dom */
  val codedRect: DOMRectReadOnly | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedWidth) */
  /* standard dom */
  val codedWidth: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/colorSpace) */
  /* standard dom */
  val colorSpace: VideoColorSpace = js.native
  
  /* standard dom */
  def copyTo(destination: BufferSource): js.Promise[js.Array[PlaneLayout]] = js.native
  def copyTo(destination: BufferSource, options: VideoFrameCopyToOptions): js.Promise[js.Array[PlaneLayout]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayHeight) */
  /* standard dom */
  val displayHeight: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayWidth) */
  /* standard dom */
  val displayWidth: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/duration) */
  /* standard dom */
  val duration: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format) */
  /* standard dom */
  val format: VideoPixelFormat | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/timestamp) */
  /* standard dom */
  val timestamp: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/visibleRect) */
  /* standard dom */
  val visibleRect: DOMRectReadOnly | Null = js.native
}
