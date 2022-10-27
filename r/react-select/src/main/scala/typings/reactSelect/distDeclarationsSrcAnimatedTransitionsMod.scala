package typings.reactSelect

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactSelect.anon.Component
import typings.reactTransitionGroup.transitionMod.ExitHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedTransitionsMod {
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Collapse(param0: CollapseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collapse")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Fade[ComponentProps /* <: js.Object */](param0: FadeProps[ComponentProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Fade")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", "collapseDuration")
  @js.native
  val collapseDuration: /* 260 */ Double = js.native
  
  trait CollapseProps extends StObject {
    
    var children: ReactNode
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var onExited: js.UndefOr[ExitHandler[js.UndefOr[HTMLElement]]] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setOnExited(value: ExitHandler[js.UndefOr[HTMLElement]]): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    }
  }
  
  type FadeProps[ComponentProps] = Component[ComponentProps] & ComponentProps
}
