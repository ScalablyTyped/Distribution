package typings.rollup.anon

import typings.rollup.mod.RenderedChunk
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunks extends StObject {
  
  var chunks: Record[String, RenderedChunk]
}
object Chunks {
  
  inline def apply(chunks: Record[String, RenderedChunk]): Chunks = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chunks] (val x: Self) extends AnyVal {
    
    inline def setChunks(value: Record[String, RenderedChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
  }
}
