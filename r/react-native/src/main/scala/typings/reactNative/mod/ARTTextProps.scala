package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARTTextProps
  extends StObject
     with ARTRenderableMixin {
  
  var alignment: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
}
object ARTTextProps {
  
  @scala.inline
  def apply(): ARTTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTTextProps]
  }
  
  @scala.inline
  implicit class ARTTextPropsMutableBuilder[Self <: ARTTextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
