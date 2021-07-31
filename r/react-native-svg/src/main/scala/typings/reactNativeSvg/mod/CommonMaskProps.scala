package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMaskProps extends StObject {
  
  var mask: js.UndefOr[String] = js.undefined
}
object CommonMaskProps {
  
  @scala.inline
  def apply(): CommonMaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMaskProps]
  }
  
  @scala.inline
  implicit class CommonMaskPropsMutableBuilder[Self <: CommonMaskProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
