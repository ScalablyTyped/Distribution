package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathProps extends CommonPathProps {
  
  var d: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[NumberProp] = js.native
}
object PathProps {
  
  @scala.inline
  def apply(): PathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathProps]
  }
  
  @scala.inline
  implicit class PathPropsMutableBuilder[Self <: PathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
