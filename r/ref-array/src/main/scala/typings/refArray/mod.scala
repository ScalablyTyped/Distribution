package typings.refArray

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.ref.mod.Type
import typings.refArray.anon.Dicti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The array type meta-constructor.
  * The returned constructor's API is highly influenced by the WebGL
  * TypedArray API.
  */
object mod {
  
  @JSImport("ref-array", JSImport.Namespace)
  @js.native
  def apply[T](`type`: String): ArrayType[T] = js.native
  @JSImport("ref-array", JSImport.Namespace)
  @js.native
  def apply[T](`type`: String, length: Double): ArrayType[T] = js.native
  @JSImport("ref-array", JSImport.Namespace)
  @js.native
  def apply[T](`type`: Type): ArrayType[T] = js.native
  @JSImport("ref-array", JSImport.Namespace)
  @js.native
  def apply[T](`type`: Type, length: Double): ArrayType[T] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ref-array", JSImport.Namespace)
  @js.native
  class Class[T] protected () extends ArrayType[T] {
    def this(`type`: String) = this()
    def this(`type`: Type) = this()
    def this(`type`: String, length: Double) = this()
    def this(`type`: Type, length: Double) = this()
  }
  
  @js.native
  trait ArrayType[T]
    extends Type
       with Instantiable0[Dicti[T]]
       with Instantiable1[
          (/* data */ js.Array[Double]) | (/* data */ Buffer) | (/* length */ Double), 
          Dicti[T]
        ]
       with Instantiable2[(/* data */ js.Array[Double]) | (/* data */ Buffer), /* length */ Double, Dicti[T]] {
    
    def apply(): Dicti[T] = js.native
    def apply(data: js.Array[Double]): Dicti[T] = js.native
    def apply(data: js.Array[Double], length: Double): Dicti[T] = js.native
    def apply(data: Buffer): Dicti[T] = js.native
    def apply(data: Buffer, length: Double): Dicti[T] = js.native
    def apply(length: Double): Dicti[T] = js.native
    
    var BYTES_PER_ELEMENT: Double = js.native
    
    var fixedLength: Double = js.native
    
    /** The reference to the base type. */
    var `type`: Type = js.native
    
    /**
      * Accepts a Buffer instance that should be an already-populated with data
      * for the ArrayType. The "length" of the Array is determined by searching
      * through the buffer's contents until an aligned NULL pointer is encountered.
      */
    def untilZeros(buffer: Buffer): Dicti[T] = js.native
  }
}
