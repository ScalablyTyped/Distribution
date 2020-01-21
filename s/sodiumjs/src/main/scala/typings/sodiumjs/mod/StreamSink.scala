package typings.sodiumjs.mod

import typings.sodiumjs.lambdaMod.Lambda2_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "StreamSink")
@js.native
class StreamSink[A] ()
  extends typings.sodiumjs.streamSinkMod.StreamSink[A] {
  def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
  def this(f: Lambda2_[A, A, A]) = this()
}

