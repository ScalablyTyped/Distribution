package typings.rbx.anon

import typings.rbx.rbxInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var only: js.UndefOr[Boolean] = js.undefined
  
  var value: typings.rbx.rbxInts.`1` | typings.rbx.rbxInts.`2` | typings.rbx.rbxInts.`3` | typings.rbx.rbxInts.`4` | typings.rbx.rbxInts.`5` | typings.rbx.rbxInts.`6` | `7`
}
object `4` {
  
  inline def apply(
    value: typings.rbx.rbxInts.`1` | typings.rbx.rbxInts.`2` | typings.rbx.rbxInts.`3` | typings.rbx.rbxInts.`4` | typings.rbx.rbxInts.`5` | typings.rbx.rbxInts.`6` | `7`
  ): `4` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setValue(
      value: typings.rbx.rbxInts.`1` | typings.rbx.rbxInts.`2` | typings.rbx.rbxInts.`3` | typings.rbx.rbxInts.`4` | typings.rbx.rbxInts.`5` | typings.rbx.rbxInts.`6` | `7`
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
