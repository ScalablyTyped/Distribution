package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.$
import typings.regexpTree.regexpTreeStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleAssertion
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Assertion]
     with Assertion {
  
  var kind: ^ | $ | String
}
object SimpleAssertion {
  
  inline def apply(kind: ^ | $ | String): SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[SimpleAssertion]
  }
  
  extension [Self <: SimpleAssertion](x: Self) {
    
    inline def setKind(value: ^ | $ | String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
