package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.ModifiersNumber
import typings.reactOnsenui.mod.ModifiersString
import typings.reactOnsenui.reactOnsenuiNumbers.`180`
import typings.reactOnsenui.reactOnsenuiNumbers.`270`
import typings.reactOnsenui.reactOnsenuiNumbers.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedWidth extends StObject {
  
  var fixedWidth: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String | ModifiersString] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.native
  
  var size: js.UndefOr[Double | ModifiersNumber] = js.native
  
  var spin: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object FixedWidth {
  
  @scala.inline
  def apply(): FixedWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedWidth]
  }
  
  @scala.inline
  implicit class FixedWidthMutableBuilder[Self <: FixedWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
    
    @scala.inline
    def setIcon(value: String | ModifiersString): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setRotate(value: `90` | `180` | `270`): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setSize(value: Double | ModifiersNumber): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
