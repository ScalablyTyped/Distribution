package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.bottom
import typings.reactOnsenui.reactOnsenuiStrings.center
import typings.reactOnsenui.reactOnsenuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalAlign extends StObject {
  
  var verticalAlign: js.UndefOr[top | bottom | center] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object VerticalAlign {
  
  @scala.inline
  def apply(): VerticalAlign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlign]
  }
  
  @scala.inline
  implicit class VerticalAlignMutableBuilder[Self <: VerticalAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVerticalAlign(value: top | bottom | center): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
