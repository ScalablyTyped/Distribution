package typings.streamMeter

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-meter", JSImport.Namespace)
  @js.native
  def apply(): StreamMeter = js.native
  @JSImport("stream-meter", JSImport.Namespace)
  @js.native
  def apply(maxBytes: Double): StreamMeter = js.native
  
  @JSImport("stream-meter", "StreamMeter")
  @js.native
  class StreamMeter () extends Transform {
    def this(maxBytes: Double) = this()
    
    var bytes: Double = js.native
    
    var maxBytes: Double = js.native
  }
}
