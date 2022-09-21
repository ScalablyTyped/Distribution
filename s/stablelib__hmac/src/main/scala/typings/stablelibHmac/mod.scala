package typings.stablelibHmac

import org.scalablytyped.runtime.Instantiable0
import typings.stablelibHash.mod.Hash
import typings.stablelibHash.mod.SerializableHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stablelib/hmac", "HMAC")
  @js.native
  open class HMAC_ protected ()
    extends StObject
       with SerializableHash {
    /**
      * Constructs a new HMAC with the given Hash and secret key.
      */
    def this(hash: Instantiable0[Hash | SerializableHash], key: js.typedarray.Uint8Array) = this()
    
    /* private */ var _finished: Any = js.native
    
    /* private */ var _inner: Any = js.native
    
    /* private */ var _innerKeyedState: Any = js.native
    
    /* private */ var _outer: Any = js.native
    
    /* private */ var _outerKeyedState: Any = js.native
    
    /* CompleteClass */
    override val blockSize: Double = js.native
    
    /* CompleteClass */
    override def clean(): Unit = js.native
    
    /* CompleteClass */
    override def cleanSavedState(savedState: Any): Unit = js.native
    
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
    
    /* CompleteClass */
    override def saveState(): Any = js.native
    
    /* CompleteClass */
    override def update(data: js.typedarray.Uint8Array): this.type = js.native
  }
  
  @JSImport("@stablelib/hmac", "equal")
  @js.native
  val equal: js.Function2[/* a */ js.typedarray.Uint8Array, /* b */ js.typedarray.Uint8Array, Boolean] = js.native
  
  inline def hmac(hash: Instantiable0[Hash], key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
