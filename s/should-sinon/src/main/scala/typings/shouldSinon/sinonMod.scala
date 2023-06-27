package typings.shouldSinon

import typings.should.mod.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// keep backwards compat with earlier DefinitelyTyped release which made these
// types available
object sinonMod {
  
  type ShouldSinonAssertion = Assertion
  
  trait SinonSpyCallApi extends StObject {
    
    var should: ShouldSinonAssertion
  }
  object SinonSpyCallApi {
    
    inline def apply(should: ShouldSinonAssertion): SinonSpyCallApi = {
      val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinonSpyCallApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinonSpyCallApi] (val x: Self) extends AnyVal {
      
      inline def setShould(value: ShouldSinonAssertion): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
    }
  }
}
