package typings.reactFadeIn

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-fade-in", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[FadeInProps, ComponentState, js.Any] {
    def this(props: FadeInProps) = this()
    def this(props: FadeInProps, context: js.Any) = this()
  }
  /**
    * Visually animates content on render with FadeIn.js
    */
  @JSImport("react-fade-in", JSImport.Default)
  @js.native
  val default: ComponentClass[FadeInProps, ComponentState] = js.native
  
  trait FadeInProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Default: 50. Delay between each child's animation in milliseconds.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: 400. Duration of each child's animation in milliseconds.
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object FadeInProps {
    
    inline def apply(): FadeInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeInProps]
    }
    
    extension [Self <: FadeInProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  type _To = ComponentClass[FadeInProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[FadeInProps, ComponentState] = default
}
