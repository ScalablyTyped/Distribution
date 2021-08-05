package typings.sodiumjs

import typings.sodiumjs.lambdaMod.Lambda2_
import typings.sodiumjs.streamMod.StreamWithSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamSinkMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/StreamSink", "StreamSink")
  @js.native
  class StreamSink[A] () extends StreamWithSend[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2_[A, A, A]) = this()
    
    /* private */ var coalescer: js.Any = js.native
    
    /* private */ var disableListenCheck: js.Any = js.native
    
    def send(a: A): Unit = js.native
  }
}
