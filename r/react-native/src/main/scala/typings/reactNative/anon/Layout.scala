package typings.reactNative.anon

import typings.reactNative.mod.LayoutRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends StObject {
  
  var layout: LayoutRectangle = js.native
}
object Layout {
  
  @scala.inline
  def apply(layout: LayoutRectangle): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: LayoutRectangle): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
