package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageTagProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var style: CSSPropsWithoutBackground & BackgroundImageBackgroundProp
  
  var tag: js.UndefOr[String] = js.undefined
}
object BackgroundImageTagProps {
  
  inline def apply(style: CSSPropsWithoutBackground & BackgroundImageBackgroundProp): BackgroundImageTagProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageTagProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImageTagProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setStyle(value: CSSPropsWithoutBackground & BackgroundImageBackgroundProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
