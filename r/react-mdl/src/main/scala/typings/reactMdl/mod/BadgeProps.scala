package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeProps
  extends StObject
     with ClassAttributes[Any] {
  
  var children: js.UndefOr[String | ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var noBackground: js.UndefOr[Boolean] = js.undefined
  
  var overlap: js.UndefOr[Boolean] = js.undefined
  
  var text: String | Double
}
object BadgeProps {
  
  inline def apply(text: String | Double): BadgeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
  
  extension [Self <: BadgeProps](x: Self) {
    
    inline def setChildren(value: String | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setNoBackground(value: Boolean): Self = StObject.set(x, "noBackground", value.asInstanceOf[js.Any])
    
    inline def setNoBackgroundUndefined: Self = StObject.set(x, "noBackground", js.undefined)
    
    inline def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setText(value: String | Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
