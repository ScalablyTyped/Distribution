package typings.recharts.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveContainerProps extends StObject {
  
  var aspect: js.UndefOr[Double] = js.native
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String | Double] = js.native
  
  var debounce: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var maxHeight: js.UndefOr[String | Double] = js.native
  
  var minHeight: js.UndefOr[String | Double] = js.native
  
  var minWidth: js.UndefOr[String | Double] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object ResponsiveContainerProps {
  
  @scala.inline
  def apply(): ResponsiveContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveContainerProps]
  }
  
  @scala.inline
  implicit class ResponsiveContainerPropsMutableBuilder[Self <: ResponsiveContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String | Double): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
