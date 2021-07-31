package typings.streamMeter

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): StreamMeter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[StreamMeter]
  @scala.inline
  def apply(maxBytes: Double): StreamMeter = ^.asInstanceOf[js.Dynamic].apply(maxBytes.asInstanceOf[js.Any]).asInstanceOf[StreamMeter]
  
  @JSImport("stream-meter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stream-meter", "StreamMeter")
  @js.native
  class StreamMeter () extends Transform {
    def this(maxBytes: Double) = this()
    
    var bytes: Double = js.native
    
    var maxBytes: Double = js.native
  }
}
