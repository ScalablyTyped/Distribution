package typings.rjsfUtils.mod

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that defines the props for an Icon button, extending from a basic HTML button attributes */
trait IconButtonProps[T, F]
  extends StObject
     with ButtonHTMLAttributes[HTMLButtonElement] {
  
  /** The name representation or actual react element implementation for the icon */
  var icon: js.UndefOr[String | ReactElement] = js.undefined
  
  /** An alternative specification for the type of the icon button */
  var iconType: js.UndefOr[String] = js.undefined
  
  /** The uiSchema for this widget */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object IconButtonProps {
  
  inline def apply[T, F](): IconButtonProps[T, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonProps[T, F]]
  }
  
  extension [Self <: IconButtonProps[?, ?], T, F](x: Self & (IconButtonProps[T, F])) {
    
    inline def setIcon(value: String | ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconType(value: String): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
