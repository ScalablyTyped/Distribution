package typings.streamDashMock

import typings.node.Buffer
import typings.streamDashMock.libTypesChunkMod.IChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/helpers/converters", JSImport.Namespace)
@js.native
object libHelpersConvertersMod extends js.Object {
  def chunk2Buffer(chunk: IChunk): Buffer = js.native
}

