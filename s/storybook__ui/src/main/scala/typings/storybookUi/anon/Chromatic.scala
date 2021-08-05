package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chromatic extends StObject {
  
  var chromatic: Disable
}
object Chromatic {
  
  inline def apply(chromatic: Disable): Chromatic = {
    val __obj = js.Dynamic.literal(chromatic = chromatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chromatic]
  }
  
  extension [Self <: Chromatic](x: Self) {
    
    inline def setChromatic(value: Disable): Self = StObject.set(x, "chromatic", value.asInstanceOf[js.Any])
  }
}
