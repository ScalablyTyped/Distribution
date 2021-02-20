package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastProps extends StObject {
  
  val accent: js.UndefOr[String] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val color: js.UndefOr[String] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
}
object ToastProps {
  
  @scala.inline
  def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  
  @scala.inline
  implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
