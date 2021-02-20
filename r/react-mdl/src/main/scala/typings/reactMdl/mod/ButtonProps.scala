package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps
  extends HTMLProps[js.Any]
     with RippleComponent
     with CustomRenderedComponent {
  
  var accent: js.UndefOr[Boolean] = js.native
  
  var colored: js.UndefOr[Boolean] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
}
object ButtonProps {
  
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(value: Boolean): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    @scala.inline
    def setColored(value: Boolean): Self = StObject.set(x, "colored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColoredUndefined: Self = StObject.set(x, "colored", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
  }
}
