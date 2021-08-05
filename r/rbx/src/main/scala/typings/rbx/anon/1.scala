package typings.rbx.anon

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var value: centered | justified | left | right
}
object `1` {
  
  inline def apply(value: centered | justified | left | right): `1` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setValue(value: centered | justified | left | right): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
