package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseTableColumnOptions[D /* <: js.Object */] extends StObject {
  
  var Header: js.UndefOr[Renderer[HeaderProps[D]]] = js.undefined
  
  var id: js.UndefOr[IdType[D]] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object UseTableColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseTableColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTableColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseTableColumnOptionsMutableBuilder[Self <: UseTableColumnOptions[?], D /* <: js.Object */] (val x: Self & UseTableColumnOptions[D]) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Renderer[HeaderProps[D]]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    @scala.inline
    def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
