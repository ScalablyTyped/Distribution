package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsReactType extends StObject {
  
  var as: ReactType[js.Any]
}
object AsReactType {
  
  inline def apply(as: ReactType[js.Any]): AsReactType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsReactType]
  }
  
  extension [Self <: AsReactType](x: Self) {
    
    inline def setAs(value: ReactType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
