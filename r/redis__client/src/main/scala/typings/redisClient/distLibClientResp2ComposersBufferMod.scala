package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibClientResp2ComposersInterfaceMod.Composer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientResp2ComposersBufferMod {
  
  @JSImport("@redis/client/dist/lib/client/RESP2/composers/buffer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BufferComposer {
    
    /* private */ /* CompleteClass */
    var chunks: Any = js.native
    
    /* CompleteClass */
    override def end(buffer: Buffer): Buffer = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def write(buffer: Buffer): Unit = js.native
  }
  
  trait BufferComposer
    extends StObject
       with Composer[Buffer] {
    
    /* private */ var chunks: Any
  }
  object BufferComposer {
    
    inline def apply(chunks: Any, end: Buffer => Buffer, reset: () => Unit, write: Buffer => Unit): BufferComposer = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), reset = js.Any.fromFunction0(reset), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[BufferComposer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferComposer] (val x: Self) extends AnyVal {
      
      inline def setChunks(value: Any): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    }
  }
}
