package typings.secureRandom

import typings.node.bufferMod.global.Buffer
import typings.secureRandom.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Buffer'}).
    * @param byteCount is the number of bytes to return.
    * @param options options to pass.
    *                Only valid value at this time type.
    *                type can be either Array, Uint8Array, or Buffer.
    *                Buffer is only valid in Node.js or Browserify environments - it will throw an error otherwise.
    */
  inline def apply[T /* <: TypeName */](byteCount: Double, options: Type[T]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].apply(byteCount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  @JSImport("secure-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Array'}).
    * @param byteCount is the number of bytes to return.
    */
  inline def randomArray(byteCount: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomArray")(byteCount.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Buffer'}).
    * @param byteCount is the number of bytes to return.
    */
  inline def randomBuffer(byteCount: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBuffer")(byteCount.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Uint8Array'}).
    * @param byteCount is the number of bytes to return.
    */
  inline def randomUint8Array(byteCount: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUint8Array")(byteCount.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  type ObjectType[T] = js.typedarray.Uint8Array | Buffer | js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.secureRandom.secureRandomStrings.Array
    - typings.secureRandom.secureRandomStrings.Buffer
    - typings.secureRandom.secureRandomStrings.Uint8Array
  */
  trait TypeName extends StObject
  object TypeName {
    
    inline def Array: typings.secureRandom.secureRandomStrings.Array = "Array".asInstanceOf[typings.secureRandom.secureRandomStrings.Array]
    
    inline def Buffer: typings.secureRandom.secureRandomStrings.Buffer = "Buffer".asInstanceOf[typings.secureRandom.secureRandomStrings.Buffer]
    
    inline def Uint8Array: typings.secureRandom.secureRandomStrings.Uint8Array = "Uint8Array".asInstanceOf[typings.secureRandom.secureRandomStrings.Uint8Array]
  }
}
