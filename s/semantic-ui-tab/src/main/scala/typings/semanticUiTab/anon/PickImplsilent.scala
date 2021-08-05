package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'silent'> */
trait PickImplsilent extends StObject {
  
  var silent: Boolean
}
object PickImplsilent {
  
  inline def apply(silent: Boolean): PickImplsilent = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsilent]
  }
  
  extension [Self <: PickImplsilent](x: Self) {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
  }
}
