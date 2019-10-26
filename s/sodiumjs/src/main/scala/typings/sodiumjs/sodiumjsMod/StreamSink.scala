package typings.sodiumjs.sodiumjsMod

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "StreamSink")
@js.native
class StreamSink[A] ()
  extends typings.sodiumjs.distTypingsSodiumStreamSinkMod.StreamSink[A] {
  def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
  def this(f: Lambda2[A, A, A]) = this()
}

