package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, 'nonNumeric'> */
trait PickImplnonNumeric extends StObject {
  
  var nonNumeric: String
}
object PickImplnonNumeric {
  
  inline def apply(nonNumeric: String): PickImplnonNumeric = {
    val __obj = js.Dynamic.literal(nonNumeric = nonNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnonNumeric]
  }
  
  extension [Self <: PickImplnonNumeric](x: Self) {
    
    inline def setNonNumeric(value: String): Self = StObject.set(x, "nonNumeric", value.asInstanceOf[js.Any])
  }
}
