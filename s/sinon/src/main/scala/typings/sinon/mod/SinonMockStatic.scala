package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonMockStatic extends StObject {
  
  def apply(): SinonExpectation = js.native
  /**
    * Creates a mock for the provided object.
    * Does not change the object, but returns a mock object to set expectations on the object’s methods.
    */
  def apply(obj: Any): SinonMock = js.native
}
