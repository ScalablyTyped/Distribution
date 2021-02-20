package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontProps extends FontObject {
  
  var font: js.UndefOr[FontObject] = js.native
}
object FontProps {
  
  @scala.inline
  def apply(): FontProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontProps]
  }
  
  @scala.inline
  implicit class FontPropsMutableBuilder[Self <: FontProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: FontObject): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
