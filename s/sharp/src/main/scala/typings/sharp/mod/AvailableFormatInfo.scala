package typings.sharp.mod

import typings.sharp.anon.Alias
import typings.sharp.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableFormatInfo extends StObject {
  
  var id: String
  
  var input: Buffer
  
  var output: Alias
}
object AvailableFormatInfo {
  
  inline def apply(id: String, input: Buffer, output: Alias): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailableFormatInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Alias): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
