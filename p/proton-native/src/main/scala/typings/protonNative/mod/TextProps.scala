package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * The text to display.
    */
  var children: js.UndefOr[String] = js.undefined
}
object TextProps {
  
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  @scala.inline
  implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
