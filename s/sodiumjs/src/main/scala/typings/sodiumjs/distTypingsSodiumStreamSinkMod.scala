package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda2
import typings.sodiumjs.distTypingsSodiumStreamMod.StreamWithSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/StreamSink", JSImport.Namespace)
@js.native
object distTypingsSodiumStreamSinkMod extends js.Object {
  @js.native
  class StreamSink[A] () extends StreamWithSend[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2[A, A, A]) = this()
    var coalescer: js.Any = js.native
    var disableListenCheck: js.Any = js.native
    def send(a: A): Unit = js.native
  }
  
}

