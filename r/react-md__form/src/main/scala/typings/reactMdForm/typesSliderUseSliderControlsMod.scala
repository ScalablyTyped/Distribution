package typings.reactMdForm

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefCallback
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactMdForm.anon.AnimationDuration
import typings.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typings.reactMdForm.typesSliderTypesMod.SliderEventHandlers
import typings.reactMdForm.typesSliderTypesMod.SliderPresentation
import typings.reactMdForm.typesSliderTypesMod.SliderThumbIndex
import typings.reactMdForm.typesSliderUtilsMod.CombinedSliderControls
import typings.std.Element
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseSliderControlsMod {
  
  @JSImport("@react-md/form/types/slider/useSliderControls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSliderControls(
    hasRefPropThumb1RefPropThumb2RefMinMaxStepDisabledVerticalOnBlurOnKeyDownOnMouseDownOnTouchStartAnimationDurationControls: SliderControlsOptions
  ): SliderAndRangeSliderControls = ^.asInstanceOf[js.Dynamic].applyDynamic("useSliderControls")(hasRefPropThumb1RefPropThumb2RefMinMaxStepDisabledVerticalOnBlurOnKeyDownOnMouseDownOnTouchStartAnimationDurationControls.asInstanceOf[js.Any]).asInstanceOf[SliderAndRangeSliderControls]
  
  trait SliderAndRangeSliderControls extends StObject {
    
    var dragging: Boolean
    
    var draggingIndex: SliderThumbIndex
    
    var onBlur: FocusEventHandler[HTMLSpanElement]
    
    var onKeyDown: KeyboardEventHandler[HTMLSpanElement]
    
    var onMouseDown: MouseEventHandler[HTMLSpanElement]
    
    var onTouchStart: TouchEventHandler[HTMLSpanElement]
    
    var ref: RefCallback[HTMLSpanElement | Null]
    
    var thumb1Percentage: String
    
    var thumb1Ref: RefCallback[HTMLSpanElement | Null]
    
    var thumb1Value: Double
    
    var thumb2Percentage: js.UndefOr[String] = js.undefined
    
    var thumb2Ref: RefCallback[HTMLSpanElement | Null]
    
    var thumb2Value: js.UndefOr[Double] = js.undefined
  }
  object SliderAndRangeSliderControls {
    
    inline def apply(
      dragging: Boolean,
      onBlur: FocusEvent[HTMLSpanElement, Element] => Unit,
      onKeyDown: KeyboardEvent[HTMLSpanElement] => Unit,
      onMouseDown: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit,
      onTouchStart: TouchEvent[HTMLSpanElement] => Unit,
      ref: /* instance */ (HTMLSpanElement | Null) | Null => Unit,
      thumb1Percentage: String,
      thumb1Ref: /* instance */ (HTMLSpanElement | Null) | Null => Unit,
      thumb1Value: Double,
      thumb2Ref: /* instance */ (HTMLSpanElement | Null) | Null => Unit
    ): SliderAndRangeSliderControls = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = js.Any.fromFunction1(ref), thumb1Percentage = thumb1Percentage.asInstanceOf[js.Any], thumb1Ref = js.Any.fromFunction1(thumb1Ref), thumb1Value = thumb1Value.asInstanceOf[js.Any], thumb2Ref = js.Any.fromFunction1(thumb2Ref), draggingIndex = null)
      __obj.asInstanceOf[SliderAndRangeSliderControls]
    }
    
    extension [Self <: SliderAndRangeSliderControls](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingIndex(value: SliderThumbIndex): Self = StObject.set(x, "draggingIndex", value.asInstanceOf[js.Any])
      
      inline def setDraggingIndexNull: Self = StObject.set(x, "draggingIndex", null)
      
      inline def setOnBlur(value: FocusEvent[HTMLSpanElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnTouchStart(value: TouchEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setRef(value: /* instance */ (HTMLSpanElement | Null) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setThumb1Percentage(value: String): Self = StObject.set(x, "thumb1Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb1Ref(value: /* instance */ (HTMLSpanElement | Null) | Null => Unit): Self = StObject.set(x, "thumb1Ref", js.Any.fromFunction1(value))
      
      inline def setThumb1Value(value: Double): Self = StObject.set(x, "thumb1Value", value.asInstanceOf[js.Any])
      
      inline def setThumb2Percentage(value: String): Self = StObject.set(x, "thumb2Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb2PercentageUndefined: Self = StObject.set(x, "thumb2Percentage", js.undefined)
      
      inline def setThumb2Ref(value: /* instance */ (HTMLSpanElement | Null) | Null => Unit): Self = StObject.set(x, "thumb2Ref", js.Any.fromFunction1(value))
      
      inline def setThumb2Value(value: Double): Self = StObject.set(x, "thumb2Value", value.asInstanceOf[js.Any])
      
      inline def setThumb2ValueUndefined: Self = StObject.set(x, "thumb2Value", js.undefined)
    }
  }
  
  type SliderControlsOptions = CombinedSliderControls & SliderPresentation & SliderEventHandlers & DefinedSliderValueOptions & AnimationDuration
}
