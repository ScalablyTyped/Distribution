package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneState extends StObject {
  
  var context: js.UndefOr[LeafletContext | Null] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
}
object PaneState {
  
  @scala.inline
  def apply(): PaneState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneState]
  }
  
  @scala.inline
  implicit class PaneStateMutableBuilder[Self <: PaneState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: LeafletContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
