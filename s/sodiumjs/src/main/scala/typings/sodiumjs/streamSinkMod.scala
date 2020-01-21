package typings.sodiumjs

import typings.sodiumjs.lambdaMod.Lambda2_
import typings.sodiumjs.streamMod.StreamWithSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/StreamSink", JSImport.Namespace)
@js.native
object streamSinkMod extends js.Object {
  @js.native
  class StreamSink[A] () extends StreamWithSend[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2_[A, A, A]) = this()
    var coalescer: js.Any = js.native
    var disableListenCheck: js.Any = js.native
    def send(a: A): Unit = js.native
  }
  
}

