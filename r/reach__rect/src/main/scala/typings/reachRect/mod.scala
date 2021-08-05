package typings.reachRect

import typings.reachRect.anon.Rect
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@reach/rect", JSImport.Default)
  @js.native
  val default: FC[RectProps] = js.native
  
  inline def useRect(ref: Ref[js.Any]): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(ref.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  inline def useRect(ref: Ref[js.Any], isSelected: Boolean): DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(ref.asInstanceOf[js.Any], isSelected.asInstanceOf[js.Any])).asInstanceOf[DOMRect]
  
  trait RectProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* args */ Rect, ReactNode]] = js.undefined
    
    var observe: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.undefined
  }
  object RectProps {
    
    inline def apply(): RectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectProps]
    }
    
    extension [Self <: RectProps](x: Self) {
      
      inline def setChildren(value: /* args */ Rect => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setObserve(value: Boolean): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
      
      inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      inline def setOnChange(value: /* rect */ DOMRect => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
