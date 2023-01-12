package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertBoolean extends StObject {
  
  var assert: Boolean
}
object AssertBoolean {
  
  inline def apply(assert: Boolean): AssertBoolean = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertBoolean] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
  }
}
