package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps
  extends StObject
     with HTMLProps[js.Any]
     with RippleComponent
     with CustomRenderedComponent {
  
  var accent: js.UndefOr[Boolean] = js.undefined
  
  var colored: js.UndefOr[Boolean] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
    inline def setAccent(value: Boolean): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    inline def setColored(value: Boolean): Self = StObject.set(x, "colored", value.asInstanceOf[js.Any])
    
    inline def setColoredUndefined: Self = StObject.set(x, "colored", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
  }
}
