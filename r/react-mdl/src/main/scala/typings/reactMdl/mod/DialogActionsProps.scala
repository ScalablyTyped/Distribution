package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogActionsProps
  extends HTMLProps[js.Any] {
  
  var fullWidth: js.UndefOr[Boolean] = js.native
}
object DialogActionsProps {
  
  @scala.inline
  def apply(): DialogActionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogActionsProps]
  }
  
  @scala.inline
  implicit class DialogActionsPropsMutableBuilder[Self <: DialogActionsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
  }
}
