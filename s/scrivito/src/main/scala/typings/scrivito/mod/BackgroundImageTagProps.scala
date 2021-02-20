package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImageTagProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var style: CSSPropsWithoutBackground with BackgroundImageBackgroundProp = js.native
  
  var tag: js.UndefOr[String] = js.native
}
object BackgroundImageTagProps {
  
  @scala.inline
  def apply(style: CSSPropsWithoutBackground with BackgroundImageBackgroundProp): BackgroundImageTagProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageTagProps]
  }
  
  @scala.inline
  implicit class BackgroundImageTagPropsMutableBuilder[Self <: BackgroundImageTagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSPropsWithoutBackground with BackgroundImageBackgroundProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
