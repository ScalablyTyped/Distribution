package typings.rjsfUtils.mod

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that defines the props for an Icon button, extending from a basic HTML button attributes */
trait IconButtonProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */]
  extends StObject
     with ButtonHTMLAttributes[HTMLButtonElement] {
  
  /** The name representation or actual react element implementation for the icon */
  var icon: js.UndefOr[String | ReactElement] = js.undefined
  
  /** An alternative specification for the type of the icon button */
  var iconType: js.UndefOr[String] = js.undefined
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The uiSchema for this widget */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object IconButtonProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](registry: Registry[T, S, F]): IconButtonProps[T, S, F] = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconButtonProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (IconButtonProps[T, S, F])) extends AnyVal {
    
    inline def setIcon(value: String | ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconType(value: String): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
