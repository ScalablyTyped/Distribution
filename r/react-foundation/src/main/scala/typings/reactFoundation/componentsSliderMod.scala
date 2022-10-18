package typings.reactFoundation

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSliderMod {
  
  @JSImport("react-foundation/components/slider", "Slider")
  @js.native
  open class Slider () extends Component[SliderProps, SliderState, Any] {
    
    @JSName("componentWillMount")
    def componentWillMount_MSlider(): Unit = js.native
  }
  
  @JSImport("react-foundation/components/slider", "SliderFill")
  @js.native
  val SliderFill: FunctionComponent[SliderFillProps] = js.native
  
  @JSImport("react-foundation/components/slider", "SliderHandle")
  @js.native
  val SliderHandle: FunctionComponent[SliderHandleProps] = js.native
  
  @JSImport("react-foundation/components/slider", "TwoHandleSlider")
  @js.native
  open class TwoHandleSlider () extends Component[TwoHandleSliderProps, TwoHandleSliderState, Any] {
    
    @JSName("componentWillMount")
    def componentWillMount_MTwoHandleSlider(): Unit = js.native
  }
  
  trait SliderCommonProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isVertical: js.UndefOr[Boolean] = js.undefined
  }
  object SliderCommonProps {
    
    inline def apply(): SliderCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderCommonProps]
    }
    
    extension [Self <: SliderCommonProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    }
  }
  
  trait SliderFillProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SliderFillProps {
    
    inline def apply(): SliderFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderFillProps]
    }
    
    extension [Self <: SliderFillProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type SliderHandleProps = HTMLAttributes[HTMLSpanElement]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactFoundation.componentsSliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ trait SliderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var fill: js.UndefOr[SliderFillProps] = js.undefined
    
    var handle: js.UndefOr[SliderHandleProps] = js.undefined
    
    var initialStart: js.UndefOr[Double] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isVertical: js.UndefOr[Boolean] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setFill(value: SliderFillProps): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHandle(value: SliderHandleProps): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setInitialStart(value: Double): Self = StObject.set(x, "initialStart", value.asInstanceOf[js.Any])
      
      inline def setInitialStartUndefined: Self = StObject.set(x, "initialStart", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    }
  }
  
  trait SliderState extends StObject {
    
    var value: Double
  }
  object SliderState {
    
    inline def apply(value: Double): SliderState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderState]
    }
    
    extension [Self <: SliderState](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactFoundation.componentsSliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ trait TwoHandleSliderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var fill: js.UndefOr[SliderFillProps] = js.undefined
    
    var initialEnd: js.UndefOr[Double] = js.undefined
    
    var initialStart: js.UndefOr[Double] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isVertical: js.UndefOr[Boolean] = js.undefined
    
    var maxHandle: js.UndefOr[SliderHandleProps] = js.undefined
    
    var minHandle: js.UndefOr[SliderHandleProps] = js.undefined
  }
  object TwoHandleSliderProps {
    
    inline def apply(): TwoHandleSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwoHandleSliderProps]
    }
    
    extension [Self <: TwoHandleSliderProps](x: Self) {
      
      inline def setFill(value: SliderFillProps): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInitialEnd(value: Double): Self = StObject.set(x, "initialEnd", value.asInstanceOf[js.Any])
      
      inline def setInitialEndUndefined: Self = StObject.set(x, "initialEnd", js.undefined)
      
      inline def setInitialStart(value: Double): Self = StObject.set(x, "initialStart", value.asInstanceOf[js.Any])
      
      inline def setInitialStartUndefined: Self = StObject.set(x, "initialStart", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      inline def setMaxHandle(value: SliderHandleProps): Self = StObject.set(x, "maxHandle", value.asInstanceOf[js.Any])
      
      inline def setMaxHandleUndefined: Self = StObject.set(x, "maxHandle", js.undefined)
      
      inline def setMinHandle(value: SliderHandleProps): Self = StObject.set(x, "minHandle", value.asInstanceOf[js.Any])
      
      inline def setMinHandleUndefined: Self = StObject.set(x, "minHandle", js.undefined)
    }
  }
  
  trait TwoHandleSliderState extends StObject {
    
    var maxValue: Double
    
    var minValue: Double
  }
  object TwoHandleSliderState {
    
    inline def apply(maxValue: Double, minValue: Double): TwoHandleSliderState = {
      val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoHandleSliderState]
    }
    
    extension [Self <: TwoHandleSliderState](x: Self) {
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    }
  }
}
