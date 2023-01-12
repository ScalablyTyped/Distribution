package typings.readChunk

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("read-chunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readChunk(filePath: String, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readChunk")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def readChunkSync(filePath: String, options: Options): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readChunkSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait Options extends StObject {
    
    /**
    	The number of bytes to read.
    	*/
    val length: Double
    
    /**
    	The position to start reading from.
    	@default 0
    	*/
    val startPosition: js.UndefOr[Double | js.BigInt] = js.undefined
  }
  object Options {
    
    inline def apply(length: Double): Options = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStartPosition(value: Double | js.BigInt): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    }
  }
}
