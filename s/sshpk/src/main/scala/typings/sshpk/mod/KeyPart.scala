package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPart extends StObject {
  
  var data: Buffer
  
  var name: AlgorithmPart
}
object KeyPart {
  
  inline def apply(data: Buffer, name: AlgorithmPart): KeyPart = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyPart] (val x: Self) extends AnyVal {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: AlgorithmPart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
