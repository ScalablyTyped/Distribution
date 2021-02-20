package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FABButtonProps extends ButtonProps {
  
  var mini: js.UndefOr[Boolean] = js.native
}
object FABButtonProps {
  
  @scala.inline
  def apply(): FABButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FABButtonProps]
  }
  
  @scala.inline
  implicit class FABButtonPropsMutableBuilder[Self <: FABButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
  }
}
