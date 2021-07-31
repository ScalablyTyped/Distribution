package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardActionProps
  extends StObject
     with HTMLProps[js.Any] {
  
  var border: js.UndefOr[Boolean] = js.undefined
}
object CardActionProps {
  
  @scala.inline
  def apply(): CardActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardActionProps]
  }
  
  @scala.inline
  implicit class CardActionPropsMutableBuilder[Self <: CardActionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
