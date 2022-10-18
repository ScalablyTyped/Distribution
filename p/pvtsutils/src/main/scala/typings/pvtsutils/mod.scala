package typings.pvtsutils

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvtsutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(buf.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ArrayBufferLike]
  
  inline def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait ArrayBufferViewConstructor[T /* <: js.typedarray.ArrayBufferView */]
    extends StObject
       with Instantiable1[
          (/* array */ ArrayBufferLike) | (/* array */ ArrayLike[Double]) | (/* length */ Double), 
          T
        ]
       with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, T]
       with Instantiable3[
          /* buffer */ ArrayBufferLike, 
          (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
          /* length */ Double, 
          T
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pvtsutils.pvtsutilsStrings.utf8
    - typings.pvtsutils.pvtsutilsStrings.binary
    - typings.pvtsutils.pvtsutilsStrings.base64
    - typings.pvtsutils.pvtsutilsStrings.base64url
    - typings.pvtsutils.pvtsutilsStrings.hex
    - java.lang.String
  */
  type BufferEncoding = _BufferEncoding | String
  
  type BufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  trait BufferSourceConverter extends StObject
  
  trait Convert extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.pvtsutils.pvtsutilsStrings.ascii
    - typings.pvtsutils.pvtsutilsStrings.utf8
    - typings.pvtsutils.pvtsutilsStrings.utf16
    - typings.pvtsutils.pvtsutilsStrings.utf16be
    - typings.pvtsutils.pvtsutilsStrings.utf16le
    - typings.pvtsutils.pvtsutilsStrings.usc2
  */
  trait TextEncoding extends StObject
  object TextEncoding {
    
    inline def ascii: typings.pvtsutils.pvtsutilsStrings.ascii = "ascii".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.ascii]
    
    inline def usc2: typings.pvtsutils.pvtsutilsStrings.usc2 = "usc2".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.usc2]
    
    inline def utf16: typings.pvtsutils.pvtsutilsStrings.utf16 = "utf16".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf16]
    
    inline def utf16be: typings.pvtsutils.pvtsutilsStrings.utf16be = "utf16be".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf16be]
    
    inline def utf16le: typings.pvtsutils.pvtsutilsStrings.utf16le = "utf16le".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf16le]
    
    inline def utf8: typings.pvtsutils.pvtsutilsStrings.utf8 = "utf8".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf8]
  }
  
  trait _BufferEncoding extends StObject
}
