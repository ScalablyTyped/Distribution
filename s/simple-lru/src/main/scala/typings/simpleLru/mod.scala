package typings.simpleLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-lru", JSImport.Namespace)
  @js.native
  class ^[K, V] protected ()
    extends StObject
       with SimpleLRU[K, V] {
    def this(max: Double) = this()
  }
  @JSImport("simple-lru", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("simple-lru", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SimpleLRU[K, V] extends StObject {
    
    def del(key: K): js.UndefOr[V] = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def keys(): js.Array[K] = js.native
    
    def length(): Double = js.native
    
    def max(): Double = js.native
    def max(max: Double): Double = js.native
    
    def peek(key: K): js.UndefOr[V] = js.native
    
    def reset(): Unit = js.native
    
    def set(key: K, `val`: V): Unit = js.native
  }
}
