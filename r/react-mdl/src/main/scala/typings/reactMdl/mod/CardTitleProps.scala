package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardTitleProps
  extends StObject
     with HTMLProps[js.Any] {
  
  var expand: js.UndefOr[Boolean] = js.undefined
}
object CardTitleProps {
  
  @scala.inline
  def apply(): CardTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTitleProps]
  }
  
  @scala.inline
  implicit class CardTitlePropsMutableBuilder[Self <: CardTitleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
