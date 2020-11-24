package typings.socks

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socks/typings/common/receivebuffer", JSImport.Namespace)
@js.native
object receivebufferMod extends js.Object {
  
  @js.native
  class ReceiveBuffer () extends js.Object {
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
