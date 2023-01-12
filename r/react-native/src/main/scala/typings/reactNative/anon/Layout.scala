package typings.reactNative.anon

import typings.reactNative.mod.LayoutRectangle
import typings.reactNative.mod.NodeHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var layout: LayoutRectangle
  
  var target: js.UndefOr[NodeHandle | Null] = js.undefined
}
object Layout {
  
  inline def apply(layout: LayoutRectangle): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: LayoutRectangle): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: NodeHandle): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
