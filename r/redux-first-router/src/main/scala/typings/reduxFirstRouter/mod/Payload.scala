package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var query: js.UndefOr[Query] = js.undefined
}
object Payload {
  
  @scala.inline
  def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
