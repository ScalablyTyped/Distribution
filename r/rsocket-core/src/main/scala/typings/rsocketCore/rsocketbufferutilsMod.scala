package typings.rsocketCore

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketbufferutilsMod {
  
  @JSImport("rsocket-core/RSocketBufferUtils", "byteLength")
  @js.native
  def byteLength(data: js.Any, encoding: Encoding): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "createBuffer")
  @js.native
  def createBuffer(args: js.Any*): Buffer = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "readUInt24BE")
  @js.native
  def readUInt24BE(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "readUInt64BE")
  @js.native
  def readUInt64BE(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "toBuffer")
  @js.native
  def toBuffer(data: js.Any): Buffer = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "writeUInt24BE")
  @js.native
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "writeUInt64BE")
  @js.native
  def writeUInt64BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  
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
