package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorItemProps extends StObject {
  
  var colors: Colors
  
  var subtitle: String
  
  var title: String
}
object ColorItemProps {
  
  inline def apply(colors: Colors, subtitle: String, title: String): ColorItemProps = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorItemProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorItemProps] (val x: Self) extends AnyVal {
    
    inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
