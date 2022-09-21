package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CultureUndefined extends StObject {
  
  var culture: Unit
}
object CultureUndefined {
  
  inline def apply(culture: Unit): CultureUndefined = {
    val __obj = js.Dynamic.literal(culture = culture.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureUndefined]
  }
  
  extension [Self <: CultureUndefined](x: Self) {
    
    inline def setCulture(value: Unit): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
  }
}
