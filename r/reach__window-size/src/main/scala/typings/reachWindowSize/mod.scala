package typings.reachWindowSize

import typings.reachWindowSize.anon.Height
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/window-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Measure the current window dimensions.
    *
    * @see Docs   https://reach.tech/window-size
    * @see Source https://github.com/reach/reach-ui/tree/main/packages/window-size
    */
  /**
    * WindowSize
    *
    * @see Docs https://reach.tech/window-size#windowsize
    * @param props
    */
  @JSImport("@reach/window-size", "WindowSize")
  @js.native
  val WindowSize: FC[WindowSizeProps] = js.native
  
  /**
    * useWindowSize
    *
    * @see Docs https://reach.tech/window-size#usewindowsize
    */
  inline def useWindowSize(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowSize")().asInstanceOf[Height]
  
  trait TWindowSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object TWindowSize {
    
    inline def apply(height: Double, width: Double): TWindowSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TWindowSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TWindowSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/window-size#windowsize-props
    */
  trait WindowSizeProps extends StObject {
    
    /**
      * A function that calls back to you with the window size.
      *
      * @see Docs https://reach.tech/window-size#windowsize-children
      */
    def children(size: Height): ReactElement
  }
  object WindowSizeProps {
    
    inline def apply(children: Height => ReactElement): WindowSizeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[WindowSizeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowSizeProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Height => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
