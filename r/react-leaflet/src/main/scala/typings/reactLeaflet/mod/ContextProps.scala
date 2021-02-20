package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
}
object ContextProps {
  
  @scala.inline
  def apply(): ContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextProps]
  }
  
  @scala.inline
  implicit class ContextPropsMutableBuilder[Self <: ContextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
  }
}
