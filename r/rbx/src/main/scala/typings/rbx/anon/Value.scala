package typings.rbx.anon

import typings.rbx.rbxStrings.`inline-block`
import typings.rbx.rbxStrings.`inline-flex`
import typings.rbx.rbxStrings.`inline`
import typings.rbx.rbxStrings.block
import typings.rbx.rbxStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}
object Value {
  
  inline def apply(value: block | flex | `inline` | `inline-block` | `inline-flex`): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
