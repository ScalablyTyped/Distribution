package typings.rollup.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionsRecord extends StObject {
  
  var assertions: Record[String, String]
}
object AssertionsRecord {
  
  inline def apply(assertions: Record[String, String]): AssertionsRecord = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionsRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertionsRecord] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
  }
}
