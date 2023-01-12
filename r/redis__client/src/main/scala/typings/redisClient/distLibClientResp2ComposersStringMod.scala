package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibClientResp2ComposersInterfaceMod.Composer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientResp2ComposersStringMod {
  
  @JSImport("@redis/client/dist/lib/client/RESP2/composers/string", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StringComposer {
    
    /* private */ /* CompleteClass */
    var decoder: Any = js.native
    
    /* CompleteClass */
    override def end(buffer: Buffer): String = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var string: Any = js.native
    
    /* CompleteClass */
    override def write(buffer: Buffer): Unit = js.native
  }
  
  trait StringComposer
    extends StObject
       with Composer[String] {
    
    /* private */ var decoder: Any
    
    /* private */ var string: Any
  }
  object StringComposer {
    
    inline def apply(decoder: Any, end: Buffer => String, reset: () => Unit, string: Any, write: Buffer => Unit): StringComposer = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), reset = js.Any.fromFunction0(reset), string = string.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[StringComposer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringComposer] (val x: Self) extends AnyVal {
      
      inline def setDecoder(value: Any): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setString(value: Any): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
