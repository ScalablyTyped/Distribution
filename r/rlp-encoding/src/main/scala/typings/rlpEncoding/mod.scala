package typings.rlpEncoding

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rlp-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: Buffer): DecodedValue = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[DecodedValue]
    inline def apply(buffer: Buffer, start: Double): DecodedValue = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[DecodedValue]
    inline def apply(buffer: Buffer, start: Double, end: Double): DecodedValue = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[DecodedValue]
    inline def apply(buffer: Buffer, start: Unit, end: Double): DecodedValue = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[DecodedValue]
    
    @JSImport("rlp-encoding", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of bytes the last call to `decode` produced.
      */
    @JSImport("rlp-encoding", "decode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  object encode {
    
    inline def apply(value: ValueToEncode): Buffer = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(value: ValueToEncode, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: ValueToEncode, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: ValueToEncode, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("rlp-encoding", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of bytes the last call to `encode` produced.
      */
    @JSImport("rlp-encoding", "encode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  inline def encodingLength(value: ValueToEncode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type DecodedValue = Buffer | js.Array[Any]
  
  type ValueToEncode = js.UndefOr[js.Array[Any] | Buffer | Double | String | Null]
}
