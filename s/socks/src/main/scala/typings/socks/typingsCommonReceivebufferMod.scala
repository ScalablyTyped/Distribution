package typings.socks

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsCommonReceivebufferMod {
  
  @JSImport("socks/typings/common/receivebuffer", "ReceiveBuffer")
  @js.native
  open class ReceiveBuffer () extends StObject {
    def this(size: Double) = this()
    
    def append(data: Buffer): Double = js.native
    
    /* private */ var buffer: Any = js.native
    
    def get(length: Double): Buffer = js.native
    
    def length: Double = js.native
    
    /* private */ var offset: Any = js.native
    
    /* private */ var originalSize: Any = js.native
    
    def peek(length: Double): Buffer = js.native
  }
}
