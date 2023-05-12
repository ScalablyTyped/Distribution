package typings.streamCounter

import typings.node.streamMod.Writable
import typings.streamCounter.streamCounterStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-counter", JSImport.Namespace)
  @js.native
  open class ^ () extends ByteCounter
  
  @js.native
  trait ByteCounter extends Writable {
    
    val bytes: Double = js.native
    
    @JSName("on")
    def on_progress(event: progress, listener: js.Function0[Unit]): this.type = js.native
  }
}
