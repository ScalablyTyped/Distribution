package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacBuffer extends StObject {
  
  var mac: Buffer = js.native
}
object MacBuffer {
  
  @scala.inline
  def apply(mac: Buffer): MacBuffer = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacBuffer]
  }
  
  @scala.inline
  implicit class MacBufferMutableBuilder[Self <: MacBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
