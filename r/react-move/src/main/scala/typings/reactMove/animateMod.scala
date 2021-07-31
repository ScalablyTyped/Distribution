package typings.reactMove

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactMove.mod.GetInterpolator
import typings.reactMove.mod.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateMod {
  
  @JSImport("react-move/Animate", JSImport.Default)
  @js.native
  class default ()
    extends Component[IAnimateProps, js.Object, js.Any]
  
  type IAnimate = Component[IAnimateProps, js.Object, js.Any]
  
  trait IAnimateProps extends StObject {
    
    def children(state: HashMap): ReactElement
    
    var enter: js.UndefOr[js.Any] = js.undefined
    
    var interpolation: js.UndefOr[GetInterpolator] = js.undefined
    
    var leave: js.UndefOr[js.Any] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var start: js.Any
    
    var update: js.UndefOr[js.Any] = js.undefined
  }
  object IAnimateProps {
    
    @scala.inline
    def apply(children: HashMap => ReactElement, start: js.Any): IAnimateProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAnimateProps]
    }
    
    @scala.inline
    implicit class IAnimatePropsMutableBuilder[Self <: IAnimateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: HashMap => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnter(value: js.Any): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setInterpolation(
        value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
      ): Self = StObject.set(x, "interpolation", js.Any.fromFunction4(value))
      
      @scala.inline
      def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      @scala.inline
      def setLeave(value: js.Any): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: js.Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
