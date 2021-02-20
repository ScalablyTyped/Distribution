package typings.rcSlider

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rcSlider.anon.FnCall
import typings.rcSlider.anon.Instantiable
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.rcSlider.rangeMod.RangeProps
import typings.rcSlider.rangeMod.RangeState
import typings.rcSlider.sliderMod.SliderProps
import typings.rcTooltip.tooltipMod.TooltipProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SliderProps, ComponentState, js.Any] {
    def this(props: SliderProps) = this()
    def this(props: SliderProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("rc-slider", JSImport.Default)
    @js.native
    val ^ : CompoundedComponent = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rc-slider", "default.Handle")
    @js.native
    class HandleCls ()
      extends typings.rcSlider.handleMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rc-slider", "default.Range")
    @js.native
    class Range protected ()
      extends Component[RangeProps, RangeState, js.Any] {
      def this(props: RangeProps) = this()
      def this(props: RangeProps, context: js.Any) = this()
    }
    
    type _To = CompoundedComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CompoundedComponent = ^
  }
  
  @JSImport("rc-slider", "Handle")
  @js.native
  class Handle ()
    extends typings.rcSlider.handleMod.default
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider", "Range")
  @js.native
  class Range protected ()
    extends Component[RangeProps, RangeState, js.Any] {
    def this(props: RangeProps) = this()
    def this(props: RangeProps, context: js.Any) = this()
  }
  @JSImport("rc-slider", "Range")
  @js.native
  val Range: ComponentClass[RangeProps, RangeState] = js.native
  
  @JSImport("rc-slider", "SliderTooltip")
  @js.native
  val SliderTooltip: ForwardRefExoticComponent[TooltipProps with RefAttributes[_]] = js.native
  
  @JSImport("rc-slider", "createSliderWithTooltip")
  @js.native
  def createSliderWithTooltip[Props /* <: GenericSliderProps */](Component: ComponentClass[Props, ComponentState]): Instantiable[Props] = js.native
  
  @js.native
  trait CompoundedComponent extends ComponentClass[SliderProps, ComponentState] {
    
    var Handle: Instantiable0[typings.rcSlider.handleMod.default] = js.native
    
    var Range: ComponentClass[RangeProps, RangeState] = js.native
    
    var createSliderWithTooltip: FnCall = js.native
  }
}
