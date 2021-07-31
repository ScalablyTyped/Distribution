package typings.reactLeaflet.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneProps extends StObject {
  
  var children: js.UndefOr[Children] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PaneProps {
  
  @scala.inline
  def apply(): PaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneProps]
  }
  
  @scala.inline
  implicit class PanePropsMutableBuilder[Self <: PaneProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
