package typings.ssri.anon

import typings.ssri.ssriBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var single: `true`
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(single = true)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setSingle(value: `true`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
