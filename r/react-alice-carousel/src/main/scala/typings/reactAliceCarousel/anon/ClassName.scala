package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: js.Any = js.native
  
  var item: js.Any = js.native
  
  var styles: js.Any = js.native
}
object ClassName {
  
  @scala.inline
  def apply(className: js.Any, item: js.Any, styles: js.Any): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: js.Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
