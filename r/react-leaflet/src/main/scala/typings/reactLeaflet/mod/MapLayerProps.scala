package typings.reactLeaflet.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerProps extends MapComponentProps {
  
  var attribution: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[Children] = js.native
}
object MapLayerProps {
  
  @scala.inline
  def apply(): MapLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerProps]
  }
  
  @scala.inline
  implicit class MapLayerPropsMutableBuilder[Self <: MapLayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
