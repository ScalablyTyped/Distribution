package typings.reactHammerjs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hammerjs.CssProps
import typings.hammerjs.HammerInput
import typings.hammerjs.HammerListener
import typings.hammerjs.HammerManager
import typings.hammerjs.Recognizer
import typings.hammerjs.RecognizerOptions
import typings.hammerjs.RecognizerTuple
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_ALL
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_DOWN
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_HORIZONTAL
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_LEFT
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_NONE
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_RIGHT
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_UP
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_VERTICAL
import typings.std.EventTarget
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-hammerjs", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Component[ReactHammerProps, ComponentState, Any] {
    def this(props: ReactHammerProps) = this()
    def this(props: ReactHammerProps, context: Any) = this()
  }
  @JSImport("react-hammerjs", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (ComponentClass[ReactHammerProps, ComponentState]) = js.native
  
  /* Inlined std.Omit<hammerjs.HammerOptions, 'recognizers'> & {  recognizers :{[gesture: string] : hammerjs.RecognizerOptions} | undefined} */
  trait HammerOptionsWithRecognizers extends StObject {
    
    var cssProps: js.UndefOr[CssProps] = js.undefined
    
    var domEvents: js.UndefOr[Boolean] = js.undefined
    
    var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ HammerManager, Boolean])] = js.undefined
    
    var inputClass: js.UndefOr[HammerInput] = js.undefined
    
    var inputTarget: js.UndefOr[EventTarget] = js.undefined
    
    var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
    
    var recognizers: js.UndefOr[StringDictionary[RecognizerOptions]] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
  }
  object HammerOptionsWithRecognizers {
    
    inline def apply(): HammerOptionsWithRecognizers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HammerOptionsWithRecognizers]
    }
    
    extension [Self <: HammerOptionsWithRecognizers](x: Self) {
      
      inline def setCssProps(value: CssProps): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
      
      inline def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
      
      inline def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
      
      inline def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
      
      inline def setEnable(value: Boolean | (js.Function1[/* manager */ HammerManager, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableFunction1(value: /* manager */ HammerManager => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setInputClass(value: HammerInput): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      inline def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
      
      inline def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
      
      inline def setPreset(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setPresetVarargs(value: RecognizerTuple*): Self = StObject.set(x, "preset", js.Array(value*))
      
      inline def setRecognizers(value: StringDictionary[RecognizerOptions]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
      
      inline def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait ReactHammerProps extends StObject {
    
    var action: js.UndefOr[HammerListener] = js.undefined
    
    var children: ReactElement
    
    var direction: js.UndefOr[
        DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
      ] = js.undefined
    
    var onDoubleTap: js.UndefOr[HammerListener] = js.undefined
    
    var onPan: js.UndefOr[HammerListener] = js.undefined
    
    var onPanCancel: js.UndefOr[HammerListener] = js.undefined
    
    var onPanEnd: js.UndefOr[HammerListener] = js.undefined
    
    var onPanStart: js.UndefOr[HammerListener] = js.undefined
    
    var onPinch: js.UndefOr[HammerListener] = js.undefined
    
    var onPinchCancel: js.UndefOr[HammerListener] = js.undefined
    
    var onPinchEnd: js.UndefOr[HammerListener] = js.undefined
    
    var onPinchIn: js.UndefOr[HammerListener] = js.undefined
    
    var onPinchOut: js.UndefOr[HammerListener] = js.undefined
    
    var onPinchStart: js.UndefOr[HammerListener] = js.undefined
    
    var onPress: js.UndefOr[HammerListener] = js.undefined
    
    var onPressUp: js.UndefOr[HammerListener] = js.undefined
    
    var onRotate: js.UndefOr[HammerListener] = js.undefined
    
    var onRotateCancel: js.UndefOr[HammerListener] = js.undefined
    
    var onRotateEnd: js.UndefOr[HammerListener] = js.undefined
    
    var onRotateMove: js.UndefOr[HammerListener] = js.undefined
    
    var onRotateStart: js.UndefOr[HammerListener] = js.undefined
    
    var onSwipe: js.UndefOr[HammerListener] = js.undefined
    
    var onSwipeDown: js.UndefOr[HammerListener] = js.undefined
    
    var onSwipeLeft: js.UndefOr[HammerListener] = js.undefined
    
    var onSwipeRight: js.UndefOr[HammerListener] = js.undefined
    
    var onSwipeUp: js.UndefOr[HammerListener] = js.undefined
    
    var onTap: js.UndefOr[HammerListener] = js.undefined
    
    var options: js.UndefOr[HammerOptionsWithRecognizers] = js.undefined
    
    var recognizeWith: js.UndefOr[StringDictionary[Recognizer | String]] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ReactHammerProps {
    
    inline def apply(children: ReactElement): ReactHammerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactHammerProps]
    }
    
    extension [Self <: ReactHammerProps](x: Self) {
      
      inline def setAction(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDirection(
        value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnDoubleTap(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onDoubleTap", js.Any.fromFunction1(value))
      
      inline def setOnDoubleTapUndefined: Self = StObject.set(x, "onDoubleTap", js.undefined)
      
      inline def setOnPan(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      inline def setOnPanCancel(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPanCancel", js.Any.fromFunction1(value))
      
      inline def setOnPanCancelUndefined: Self = StObject.set(x, "onPanCancel", js.undefined)
      
      inline def setOnPanEnd(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPanEnd", js.Any.fromFunction1(value))
      
      inline def setOnPanEndUndefined: Self = StObject.set(x, "onPanEnd", js.undefined)
      
      inline def setOnPanStart(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPanStart", js.Any.fromFunction1(value))
      
      inline def setOnPanStartUndefined: Self = StObject.set(x, "onPanStart", js.undefined)
      
      inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      inline def setOnPinch(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinch", js.Any.fromFunction1(value))
      
      inline def setOnPinchCancel(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchCancel", js.Any.fromFunction1(value))
      
      inline def setOnPinchCancelUndefined: Self = StObject.set(x, "onPinchCancel", js.undefined)
      
      inline def setOnPinchEnd(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchEnd", js.Any.fromFunction1(value))
      
      inline def setOnPinchEndUndefined: Self = StObject.set(x, "onPinchEnd", js.undefined)
      
      inline def setOnPinchIn(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchIn", js.Any.fromFunction1(value))
      
      inline def setOnPinchInUndefined: Self = StObject.set(x, "onPinchIn", js.undefined)
      
      inline def setOnPinchOut(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchOut", js.Any.fromFunction1(value))
      
      inline def setOnPinchOutUndefined: Self = StObject.set(x, "onPinchOut", js.undefined)
      
      inline def setOnPinchStart(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchStart", js.Any.fromFunction1(value))
      
      inline def setOnPinchStartUndefined: Self = StObject.set(x, "onPinchStart", js.undefined)
      
      inline def setOnPinchUndefined: Self = StObject.set(x, "onPinch", js.undefined)
      
      inline def setOnPress(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnPressUp(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPressUp", js.Any.fromFunction1(value))
      
      inline def setOnPressUpUndefined: Self = StObject.set(x, "onPressUp", js.undefined)
      
      inline def setOnRotate(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotate", js.Any.fromFunction1(value))
      
      inline def setOnRotateCancel(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateCancel", js.Any.fromFunction1(value))
      
      inline def setOnRotateCancelUndefined: Self = StObject.set(x, "onRotateCancel", js.undefined)
      
      inline def setOnRotateEnd(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateEnd", js.Any.fromFunction1(value))
      
      inline def setOnRotateEndUndefined: Self = StObject.set(x, "onRotateEnd", js.undefined)
      
      inline def setOnRotateMove(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateMove", js.Any.fromFunction1(value))
      
      inline def setOnRotateMoveUndefined: Self = StObject.set(x, "onRotateMove", js.undefined)
      
      inline def setOnRotateStart(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateStart", js.Any.fromFunction1(value))
      
      inline def setOnRotateStartUndefined: Self = StObject.set(x, "onRotateStart", js.undefined)
      
      inline def setOnRotateUndefined: Self = StObject.set(x, "onRotate", js.undefined)
      
      inline def setOnSwipe(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      inline def setOnSwipeDown(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction1(value))
      
      inline def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
      
      inline def setOnSwipeLeft(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction1(value))
      
      inline def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
      
      inline def setOnSwipeRight(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction1(value))
      
      inline def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
      
      inline def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      inline def setOnSwipeUp(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction1(value))
      
      inline def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
      
      inline def setOnTap(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOptions(value: HammerOptionsWithRecognizers): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRecognizeWith(value: StringDictionary[Recognizer | String]): Self = StObject.set(x, "recognizeWith", value.asInstanceOf[js.Any])
      
      inline def setRecognizeWithUndefined: Self = StObject.set(x, "recognizeWith", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = js.Object & (ComponentClass[ReactHammerProps, ComponentState])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (ComponentClass[ReactHammerProps, ComponentState]) = ^
}
