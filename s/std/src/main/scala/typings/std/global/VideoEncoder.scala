package typings.std.global

import typings.std.VideoEncoderConfig
import typings.std.VideoEncoderInit
import typings.std.VideoEncoderSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoEncoder")
@js.native
open class VideoEncoder protected ()
  extends StObject
     with typings.std.VideoEncoder {
  /* standard dom */
  def this(init: VideoEncoderInit) = this()
}
object VideoEncoder {
  
  @JSGlobal("VideoEncoder")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def isConfigSupported(config: VideoEncoderConfig): js.Promise[VideoEncoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoEncoderSupport]]
}
