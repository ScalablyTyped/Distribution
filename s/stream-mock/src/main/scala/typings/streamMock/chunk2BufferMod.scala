package typings.streamMock

import typings.node.Buffer
import typings.streamMock.chunkMod.IChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/helpers/converters/chunk2Buffer", JSImport.Namespace)
@js.native
object chunk2BufferMod extends js.Object {
  def chunk2Buffer(chunk: IChunk): Buffer = js.native
}

