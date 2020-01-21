package typings.streamMock

import typings.node.Buffer
import typings.streamMock.chunkMod.IChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def chunk2Buffer(chunk: IChunk): Buffer = js.native
}

