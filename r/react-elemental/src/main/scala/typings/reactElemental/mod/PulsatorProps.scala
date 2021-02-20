package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PulsatorProps extends StObject {
  
  val color: js.UndefOr[String] = js.native
  
  val inactive: js.UndefOr[Boolean] = js.native
  
  val size: js.UndefOr[PulsatorSize] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val transparent: js.UndefOr[Boolean] = js.native
}
object PulsatorProps {
  
  @scala.inline
  def apply(): PulsatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsatorProps]
  }
  
  @scala.inline
  implicit class PulsatorPropsMutableBuilder[Self <: PulsatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setSize(value: PulsatorSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
