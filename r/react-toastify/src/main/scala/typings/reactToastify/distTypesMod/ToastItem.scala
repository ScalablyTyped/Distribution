package typings.reactToastify.distTypesMod

import typings.react.mod.ReactNode
import typings.reactToastify.distComponentsIconsMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastItem[Data] extends StObject {
  
  var containerId: js.UndefOr[Id] = js.undefined
  
  var content: ToastContent[Data]
  
  var data: Data
  
  var icon: js.UndefOr[ToastIcon] = js.undefined
  
  var id: Id
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var status: ToastItemStatus
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var `type`: js.UndefOr[TypeOptions] = js.undefined
}
object ToastItem {
  
  inline def apply[Data](data: Data, id: Id, status: ToastItemStatus): ToastItem[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastItem[Data]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToastItem[?], Data] (val x: Self & ToastItem[Data]) extends AnyVal {
    
    inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContent(value: ToastContent[Data]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* props */ ToastContentProps[Data] => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: ToastIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setStatus(value: ToastItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
