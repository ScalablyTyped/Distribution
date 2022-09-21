package typings.stablelibSha256

import typings.stablelibHash.mod.SerializableHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stablelib/sha256", "BLOCK_SIZE")
  @js.native
  val BLOCK_SIZE: /* 64 */ Double = js.native
  
  @JSImport("@stablelib/sha256", "DIGEST_LENGTH")
  @js.native
  val DIGEST_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/sha256", "SHA256")
  @js.native
  open class SHA256 ()
    extends StObject
       with SerializableHash {
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _bufferLength: Any = js.native
    
    /* private */ var _bytesHashed: Any = js.native
    
    /* private */ var _finished: Any = js.native
    
    /* protected */ def _initState(): Unit = js.native
    
    /* protected */ var _state: js.typedarray.Int32Array = js.native
    
    /* private */ var _temp: Any = js.native
    
    /* CompleteClass */
    override val blockSize: Double = js.native
    
    /* CompleteClass */
    override def clean(): Unit = js.native
    
    /* CompleteClass */
    override def cleanSavedState(savedState: Any): Unit = js.native
    /**
      * Cleans state returned by saveState().
      */
    def cleanSavedState(savedState: SavedState): Unit = js.native
    
    /* CompleteClass */
    override def digest(): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override val digestLength: Double = js.native
    
    /* CompleteClass */
    override def finish(out: js.typedarray.Uint8Array): this.type = js.native
    
    /* CompleteClass */
    override def reset(): this.type = js.native
    
    /* CompleteClass */
    override def restoreState(savedState: Any): this.type = js.native
    /**
      * Function useful for HMAC/PBKDF2 optimization.
      * Restores state saved by saveState() and sets bytesHashed
      * to the given value.
      */
    def restoreState(savedState: SavedState): this.type = js.native
    
    /* CompleteClass */
    override def saveState(): Any = js.native
    
    /* CompleteClass */
    override def update(data: js.typedarray.Uint8Array): this.type = js.native
    def update(data: js.typedarray.Uint8Array, dataLength: Double): this.type = js.native
  }
  
  inline def hash(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  trait SavedState extends StObject {
    
    var buffer: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var bufferLength: Double
    
    var bytesHashed: Double
    
    var state: js.typedarray.Int32Array
  }
  object SavedState {
    
    inline def apply(bufferLength: Double, bytesHashed: Double, state: js.typedarray.Int32Array): SavedState = {
      val __obj = js.Dynamic.literal(bufferLength = bufferLength.asInstanceOf[js.Any], bytesHashed = bytesHashed.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedState]
    }
    
    extension [Self <: SavedState](x: Self) {
      
      inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferLength(value: Double): Self = StObject.set(x, "bufferLength", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setBytesHashed(value: Double): Self = StObject.set(x, "bytesHashed", value.asInstanceOf[js.Any])
      
      inline def setState(value: js.typedarray.Int32Array): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
