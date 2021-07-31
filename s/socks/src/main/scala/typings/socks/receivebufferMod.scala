package typings.socks

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receivebufferMod {
  
  @JSImport("socks/typings/common/receivebuffer", "ReceiveBuffer")
  @js.native
  class ReceiveBuffer () extends StObject {
    def this(size: Double) = this()
    
    def append(data: Buffer): Double = js.native
    
    var buffer: js.Any = js.native
    
    def get(length: Double): Buffer = js.native
    
    def length: Double = js.native
    
    var offset: js.Any = js.native
    
    var originalSize: js.Any = js.native
    
    def peek(length: Double): Buffer = js.native
  }
}
