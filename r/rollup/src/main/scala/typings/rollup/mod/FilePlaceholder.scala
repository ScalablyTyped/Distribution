package typings.rollup.mod

import typings.rollup.rollupStrings.placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePlaceholder extends StObject {
  
  var `type`: placeholder
}
object FilePlaceholder {
  
  inline def apply(): FilePlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("placeholder")
    __obj.asInstanceOf[FilePlaceholder]
  }
  
  extension [Self <: FilePlaceholder](x: Self) {
    
    inline def setType(value: placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
