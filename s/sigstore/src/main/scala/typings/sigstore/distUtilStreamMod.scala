package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilStreamMod {
  
  @JSImport("sigstore/dist/util/stream", "ByteStream")
  @js.native
  open class ByteStream () extends StObject {
    def this(buffer: js.typedarray.ArrayBuffer) = this()
    
    def appendChar(char: Double): Unit = js.native
    
    def appendUint16(num: Double): Unit = js.native
    
    def appendUint24(num: Double): Unit = js.native
    
    def appendView(view: js.typedarray.Uint8Array): Unit = js.native
    
    /* private */ var buf: Any = js.native
    
    def buffer: Buffer = js.native
    
    /* private */ var ensureCapacity: Any = js.native
    
    def getBlock(size: Double): Buffer = js.native
    
    def getUint16(): Double = js.native
    
    def getUint8(): Double = js.native
    
    def length: Double = js.native
    
    def position: Double = js.native
    
    /* private */ var realloc: Any = js.native
    
    def seek(position: Double): Unit = js.native
    
    def slice(start: Double, len: Double): Buffer = js.native
    
    /* private */ var start: Any = js.native
    
    /* private */ var view: Any = js.native
  }
  /* static members */
  object ByteStream {
    
    @JSImport("sigstore/dist/util/stream", "ByteStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sigstore/dist/util/stream", "ByteStream.BLOCK_SIZE")
    @js.native
    def BLOCK_SIZE: Any = js.native
    inline def BLOCK_SIZE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLOCK_SIZE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sigstore/dist/util/stream", "StreamError")
  @js.native
  open class StreamError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
