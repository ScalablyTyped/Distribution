package typings.rcSlider

import typings.rcSlider.anon.Instantiable
import typings.rcSlider.anon.Overlay
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSliderWithTooltipMod {
  
  @JSImport("rc-slider/lib/createSliderWithTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Props /* <: GenericSliderProps */](Component: ComponentClass[Props, ComponentState]): Instantiable[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[Props]]
  
  trait ComponentWrapperProps extends StObject {
    
    var getTooltipContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, ReactNode]] = js.undefined
    
    var tipProps: js.UndefOr[Overlay] = js.undefined
  }
  object ComponentWrapperProps {
    
    @scala.inline
    def apply(): ComponentWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentWrapperProps]
    }
    
    @scala.inline
    implicit class ComponentWrapperPropsMutableBuilder[Self <: ComponentWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTooltipContainer(value: () => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      @scala.inline
      def setTipFormatter(value: /* value */ Double => ReactNode): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      @scala.inline
      def setTipProps(value: Overlay): Self = StObject.set(x, "tipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipPropsUndefined: Self = StObject.set(x, "tipProps", js.undefined)
    }
  }
  
  trait ComponentWrapperState extends StObject {
    
    var visibles: Record[Double, Boolean]
  }
  object ComponentWrapperState {
    
    @scala.inline
    def apply(visibles: Record[Double, Boolean]): ComponentWrapperState = {
      val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentWrapperState]
    }
    
    @scala.inline
    implicit class ComponentWrapperStateMutableBuilder[Self <: ComponentWrapperState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisibles(value: Record[Double, Boolean]): Self = StObject.set(x, "visibles", value.asInstanceOf[js.Any])
    }
  }
}
