package typings.std.global

import typings.std.VideoDecoderConfig
import typings.std.VideoDecoderInit
import typings.std.VideoDecoderSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoDecoder")
@js.native
open class VideoDecoder protected ()
  extends StObject
     with typings.std.VideoDecoder {
  /* standard dom */
  def this(init: VideoDecoderInit) = this()
}
object VideoDecoder {
  
  @JSGlobal("VideoDecoder")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def isConfigSupported(config: VideoDecoderConfig): js.Promise[VideoDecoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoDecoderSupport]]
}
