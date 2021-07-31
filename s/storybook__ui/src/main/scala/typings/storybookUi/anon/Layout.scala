package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var layout: String
}
object Layout {
  
  @scala.inline
  def apply(layout: String): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
