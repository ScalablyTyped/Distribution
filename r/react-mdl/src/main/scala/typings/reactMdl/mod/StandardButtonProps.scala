package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardButtonProps extends ButtonProps {
  
  var raised: js.UndefOr[Boolean] = js.native
}
object StandardButtonProps {
  
  @scala.inline
  def apply(): StandardButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardButtonProps]
  }
  
  @scala.inline
  implicit class StandardButtonPropsMutableBuilder[Self <: StandardButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
  }
}
