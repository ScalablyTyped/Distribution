package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'successTest'> */
trait PickImplsuccessTest extends StObject {
  
  def successTest(response: js.Any): Boolean
  @JSName("successTest")
  var successTest_Original: js.Function1[/* response */ js.Any, Boolean]
}
object PickImplsuccessTest {
  
  inline def apply(successTest: /* response */ js.Any => Boolean): PickImplsuccessTest = {
    val __obj = js.Dynamic.literal(successTest = js.Any.fromFunction1(successTest))
    __obj.asInstanceOf[PickImplsuccessTest]
  }
  
  extension [Self <: PickImplsuccessTest](x: Self) {
    
    inline def setSuccessTest(value: /* response */ js.Any => Boolean): Self = StObject.set(x, "successTest", js.Any.fromFunction1(value))
  }
}
