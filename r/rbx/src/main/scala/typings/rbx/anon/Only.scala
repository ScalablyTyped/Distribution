package typings.rbx.anon

import typings.rbx.rbxStrings.`inline-block`
import typings.rbx.rbxStrings.`inline-flex`
import typings.rbx.rbxStrings.`inline`
import typings.rbx.rbxStrings.block
import typings.rbx.rbxStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Only extends StObject {
  
  var only: js.UndefOr[Boolean] = js.undefined
  
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}
object Only {
  
  inline def apply(value: block | flex | `inline` | `inline-block` | `inline-flex`): Only = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Only]
  }
  
  extension [Self <: Only](x: Self) {
    
    inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setValue(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
