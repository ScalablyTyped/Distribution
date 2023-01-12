package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps
  extends StObject
     with HTMLProps[Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  
  var noSpacing: js.UndefOr[Boolean] = js.undefined
}
object GridProps {
  
  inline def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
    
    inline def setNoSpacing(value: Boolean): Self = StObject.set(x, "noSpacing", value.asInstanceOf[js.Any])
    
    inline def setNoSpacingUndefined: Self = StObject.set(x, "noSpacing", js.undefined)
  }
}
