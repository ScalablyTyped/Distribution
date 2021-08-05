package typings.sharp.mod

import typings.sharp.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableFormatInfo extends StObject {
  
  var id: String
  
  var input: Buffer
  
  var output: Buffer
}
object AvailableFormatInfo {
  
  inline def apply(id: String, input: Buffer, output: Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
  
  extension [Self <: AvailableFormatInfo](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Buffer): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
