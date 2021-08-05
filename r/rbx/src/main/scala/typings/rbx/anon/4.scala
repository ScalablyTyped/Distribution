package typings.rbx.anon

import typings.rbx.rbxNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var only: js.UndefOr[Boolean] = js.undefined
  
  var value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | `7`
}
object `4` {
  
  inline def apply(
    value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | `7`
  ): `4` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setValue(
      value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | `7`
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
