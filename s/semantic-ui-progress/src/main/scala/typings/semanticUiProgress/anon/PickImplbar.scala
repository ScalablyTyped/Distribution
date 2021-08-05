package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, 'bar'> */
trait PickImplbar extends StObject {
  
  var bar: String
}
object PickImplbar {
  
  inline def apply(bar: String): PickImplbar = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbar]
  }
  
  extension [Self <: PickImplbar](x: Self) {
    
    inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
  }
}
