package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.ModifiersNumber
import typings.reactOnsenui.mod.ModifiersString
import typings.reactOnsenui.reactOnsenuiNumbers.`180`
import typings.reactOnsenui.reactOnsenuiNumbers.`270`
import typings.reactOnsenui.reactOnsenuiNumbers.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedWidth extends StObject {
  
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String | ModifiersString] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  
  var size: js.UndefOr[Double | ModifiersNumber] = js.undefined
  
  var spin: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
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
