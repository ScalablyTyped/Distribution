package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mechanism extends StObject {
  
  var mechanism: js.UndefOr[typings.sentryTypes.typesMechanismMod.Mechanism] = js.undefined
}
object Mechanism {
  
  inline def apply(): Mechanism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mechanism]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
    
    inline def setMechanism(value: typings.sentryTypes.typesMechanismMod.Mechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
    
    inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
  }
}
