package typings.streamMock

import typings.node.Buffer
import typings.streamMock.chunkMod.IChunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunk2BufferMod {
  
  @JSImport("stream-mock/lib/helpers/converters/chunk2Buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def chunk2Buffer(chunk: IChunk): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("chunk2Buffer")(chunk.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
