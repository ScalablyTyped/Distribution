package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignaturePart extends StObject {
  
  var data: Buffer
  
  var name: SignaturePartType
}
object SignaturePart {
  
  inline def apply(data: Buffer, name: SignaturePartType): SignaturePart = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturePart]
  }
  
  extension [Self <: SignaturePart](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: SignaturePartType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
