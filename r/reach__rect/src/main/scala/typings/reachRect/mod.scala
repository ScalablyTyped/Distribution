package typings.reachRect

import org.scalablytyped.runtime.Shortcut
import typings.reachRect.anon.Rect
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@reach/rect", JSImport.Default)
  @js.native
  val default: FC[RectProps] = js.native
  
  @JSImport("@reach/rect", "useRect")
  @js.native
  def useRect(ref: Ref[_]): DOMRect = js.native
  @JSImport("@reach/rect", "useRect")
  @js.native
  def useRect(ref: Ref[_], isSelected: Boolean): DOMRect = js.native
  
  @js.native
  trait RectProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* args */ Rect, ReactNode]] = js.native
    
    var observe: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.native
  }
  object RectProps {
    
    @scala.inline
    def apply(): RectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectProps]
    }
    
    @scala.inline
    implicit class RectPropsMutableBuilder[Self <: RectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* args */ Rect => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setObserve(value: Boolean): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* rect */ DOMRect => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  type _To = FC[RectProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[RectProps] = default
}
