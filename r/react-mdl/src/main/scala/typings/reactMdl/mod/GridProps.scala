package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridProps
  extends HTMLProps[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  
  var noSpacing: js.UndefOr[Boolean] = js.native
}
object GridProps {
  
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoSpacing(value: Boolean): Self = StObject.set(x, "noSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpacingUndefined: Self = StObject.set(x, "noSpacing", js.undefined)
  }
}
