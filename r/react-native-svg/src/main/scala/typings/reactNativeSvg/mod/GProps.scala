package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GProps extends CommonPathProps {
  
  var opacity: js.UndefOr[NumberProp] = js.native
}
object GProps {
  
  @scala.inline
  def apply(): GProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GProps]
  }
  
  @scala.inline
  implicit class GPropsMutableBuilder[Self <: GProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
