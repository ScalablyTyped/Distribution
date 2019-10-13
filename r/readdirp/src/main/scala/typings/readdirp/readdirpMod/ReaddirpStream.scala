package typings.readdirp.readdirpMod

import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirpStream
  extends Readable
     with AsyncIterable[EntryInfo] {
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

