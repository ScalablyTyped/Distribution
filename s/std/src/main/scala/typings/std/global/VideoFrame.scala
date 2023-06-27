package typings.std.global

import typings.std.BufferSource
import typings.std.CanvasImageSource
import typings.std.VideoFrameBufferInit
import typings.std.VideoFrameInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoFrame")
@js.native
open class VideoFrame protected ()
  extends StObject
     with typings.std.VideoFrame {
  /* standard dom */
  def this(image: CanvasImageSource) = this()
  /* standard dom */
  def this(data: BufferSource, init: VideoFrameBufferInit) = this()
  def this(image: CanvasImageSource, init: VideoFrameInit) = this()
}
