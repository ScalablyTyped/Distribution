package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda2_
import typings.sodiumjs.distTypingsSodiumStreamMod.StreamWithSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumStreamSinkMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/StreamSink", "StreamSink")
  @js.native
  open class StreamSink[A] () extends StreamWithSend[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2_[A, A, A]) = this()
    
    /* private */ var coalescer: Any = js.native
    
    /* private */ var disableListenCheck: Any = js.native
    
    def send(a: A): Unit = js.native
  }
}
