package typings.reachWindowSize

import org.scalablytyped.runtime.Shortcut
import typings.reachWindowSize.anon.Height
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@reach/window-size", JSImport.Default)
  @js.native
  val default: FC[WindowSizeProps] = js.native
  
  @js.native
  trait WindowSizeProps extends StObject {
    
    def children(size: Height): ReactNode = js.native
  }
  object WindowSizeProps {
    
    @scala.inline
    def apply(children: Height => ReactNode): WindowSizeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[WindowSizeProps]
    }
    
    @scala.inline
    implicit class WindowSizePropsMutableBuilder[Self <: WindowSizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Height => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type _To = FC[WindowSizeProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[WindowSizeProps] = default
}
