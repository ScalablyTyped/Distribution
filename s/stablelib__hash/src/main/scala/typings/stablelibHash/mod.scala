package typings.stablelibHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSerializableHash(h: Hash): /* is @stablelib/hash.@stablelib/hash.SerializableHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSerializableHash")(h.asInstanceOf[js.Any]).asInstanceOf[/* is @stablelib/hash.@stablelib/hash.SerializableHash */ Boolean]
  
  trait Hash extends StObject {
    
    val blockSize: Double
    
    def clean(): Unit
    
    def digest(): js.typedarray.Uint8Array
    
    val digestLength: Double
    
    def finish(out: js.typedarray.Uint8Array): this.type
    
    def reset(): this.type
    
    def update(data: js.typedarray.Uint8Array): this.type
  }
  object Hash {
    
    inline def apply(
      blockSize: Double,
      clean: () => Unit,
      digest: () => js.typedarray.Uint8Array,
      digestLength: Double,
      finish: js.typedarray.Uint8Array => Hash,
      reset: () => Hash,
      update: js.typedarray.Uint8Array => Hash
    ): Hash = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], clean = js.Any.fromFunction0(clean), digest = js.Any.fromFunction0(digest), digestLength = digestLength.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setClean(value: () => Unit): Self = StObject.set(x, "clean", js.Any.fromFunction0(value))
      
      inline def setDigest(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      inline def setDigestLength(value: Double): Self = StObject.set(x, "digestLength", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: js.typedarray.Uint8Array => Hash): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Hash): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: js.typedarray.Uint8Array => Hash): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait SerializableHash
    extends StObject
       with Hash {
    
    def cleanSavedState(savedState: Any): Unit
    
    def restoreState(savedState: Any): this.type
    
    def saveState(): Any
  }
  object SerializableHash {
    
    inline def apply(
      blockSize: Double,
      clean: () => Unit,
      cleanSavedState: Any => Unit,
      digest: () => js.typedarray.Uint8Array,
      digestLength: Double,
      finish: js.typedarray.Uint8Array => SerializableHash,
      reset: () => SerializableHash,
      restoreState: Any => SerializableHash,
      saveState: () => Any,
      update: js.typedarray.Uint8Array => SerializableHash
    ): SerializableHash = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], clean = js.Any.fromFunction0(clean), cleanSavedState = js.Any.fromFunction1(cleanSavedState), digest = js.Any.fromFunction0(digest), digestLength = digestLength.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), reset = js.Any.fromFunction0(reset), restoreState = js.Any.fromFunction1(restoreState), saveState = js.Any.fromFunction0(saveState), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[SerializableHash]
    }
    
    extension [Self <: SerializableHash](x: Self) {
      
      inline def setCleanSavedState(value: Any => Unit): Self = StObject.set(x, "cleanSavedState", js.Any.fromFunction1(value))
      
      inline def setRestoreState(value: Any => SerializableHash): Self = StObject.set(x, "restoreState", js.Any.fromFunction1(value))
      
      inline def setSaveState(value: () => Any): Self = StObject.set(x, "saveState", js.Any.fromFunction0(value))
    }
  }
}
