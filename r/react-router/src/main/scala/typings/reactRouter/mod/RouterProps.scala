package typings.reactRouter.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterProps extends StObject {
  
  var history: History[LocationState] = js.native
}
object RouterProps {
  
  @scala.inline
  def apply(history: History[LocationState]): RouterProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterProps]
  }
  
  @scala.inline
  implicit class RouterPropsMutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
  }
}
