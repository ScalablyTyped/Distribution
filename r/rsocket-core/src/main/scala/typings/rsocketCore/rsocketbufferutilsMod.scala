package typings.rsocketCore

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketbufferutilsMod {
  
  @JSImport("rsocket-core/RSocketBufferUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def byteLength(data: js.Any, encoding: Encoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def createBuffer(args: js.Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(args.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def readUInt24BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt24BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readUInt64BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def toBuffer(data: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt24BE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def writeUInt64BE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rsocketCore.rsocketCoreStrings.ascii
    - typings.rsocketCore.rsocketCoreStrings.base64
    - typings.rsocketCore.rsocketCoreStrings.hex
    - typings.rsocketCore.rsocketCoreStrings.utf8
  */
  trait Encoding extends StObject
  object Encoding {
    
    @scala.inline
    def ascii: typings.rsocketCore.rsocketCoreStrings.ascii = "ascii".asInstanceOf[typings.rsocketCore.rsocketCoreStrings.ascii]
    
    @scala.inline
    def base64: typings.rsocketCore.rsocketCoreStrings.base64 = "base64".asInstanceOf[typings.rsocketCore.rsocketCoreStrings.base64]
    
    @scala.inline
    def hex: typings.rsocketCore.rsocketCoreStrings.hex = "hex".asInstanceOf[typings.rsocketCore.rsocketCoreStrings.hex]
    
    @scala.inline
    def utf8: typings.rsocketCore.rsocketCoreStrings.utf8 = "utf8".asInstanceOf[typings.rsocketCore.rsocketCoreStrings.utf8]
  }
}
