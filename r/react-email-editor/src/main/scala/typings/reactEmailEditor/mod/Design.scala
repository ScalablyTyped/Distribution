package typings.reactEmailEditor.mod

import typings.reactEmailEditor.anon.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Design extends StObject {
  
  val body: Rows = js.native
  
  val counters: js.UndefOr[js.Object] = js.native
}
object Design {
  
  @scala.inline
  def apply(body: Rows): Design = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  
  @scala.inline
  implicit class DesignMutableBuilder[Self <: Design] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Rows): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounters(value: js.Object): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
  }
}
