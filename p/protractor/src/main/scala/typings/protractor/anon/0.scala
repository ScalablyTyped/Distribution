package typings.protractor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var specName: js.UndefOr[String] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
    
    inline def setSpecNameUndefined: Self = StObject.set(x, "specName", js.undefined)
  }
}
