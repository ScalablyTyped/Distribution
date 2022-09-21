package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[Data] extends StObject {
  
  val data: js.UndefOr[Data] = js.undefined
}
object `2` {
  
  inline def apply[Data](): `2`[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[Data]]
  }
  
  extension [Self <: `2`[?], Data](x: Self & `2`[Data]) {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
