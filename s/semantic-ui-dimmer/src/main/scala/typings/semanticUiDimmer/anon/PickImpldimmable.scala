package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'dimmable'> */
trait PickImpldimmable extends StObject {
  
  var dimmable: String
}
object PickImpldimmable {
  
  inline def apply(dimmable: String): PickImpldimmable = {
    val __obj = js.Dynamic.literal(dimmable = dimmable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmable]
  }
  
  extension [Self <: PickImpldimmable](x: Self) {
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
  }
}
