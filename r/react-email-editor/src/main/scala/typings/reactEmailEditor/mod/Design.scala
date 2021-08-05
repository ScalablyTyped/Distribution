package typings.reactEmailEditor.mod

import typings.reactEmailEditor.anon.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Design extends StObject {
  
  val body: Rows
  
  val counters: js.UndefOr[js.Object] = js.undefined
}
object Design {
  
  inline def apply(body: Rows): Design = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  
  extension [Self <: Design](x: Self) {
    
    inline def setBody(value: Rows): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCounters(value: js.Object): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
  }
}
