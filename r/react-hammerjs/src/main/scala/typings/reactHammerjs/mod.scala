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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-hammerjs", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[ReactHammerProps, ComponentState, js.Any] {
    def this(props: ReactHammerProps) = this()
    def this(props: ReactHammerProps, context: js.Any) = this()
  }
  @JSImport("react-hammerjs", JSImport.Namespace)
  @js.native
  val ^ : ComponentClass[ReactHammerProps, ComponentState] = js.native
  
  /* Inlined std.Omit<hammerjs.HammerOptions, 'recognizers'> & {  recognizers :{[gesture: string] : hammerjs.RecognizerOptions} | undefined} */
  @js.native
  trait HammerOptionsWithRecognizers extends StObject {
    
    var cssProps: js.UndefOr[CssProps] = js.native
    
    var domEvents: js.UndefOr[Boolean] = js.native
    
    var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ HammerManager, Boolean])] = js.native
    
    var inputClass: js.UndefOr[HammerInput] = js.native
    
    var inputTarget: js.UndefOr[EventTarget] = js.native
    
    var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.native
    
    var recognizers: js.UndefOr[StringDictionary[RecognizerOptions]] = js.native
    
    var touchAction: js.UndefOr[String] = js.native
  }
  object HammerOptionsWithRecognizers {
    
    @scala.inline
    def apply(): HammerOptionsWithRecognizers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HammerOptionsWithRecognizers]
    }
    
    @scala.inline
    implicit class HammerOptionsWithRecognizersMutableBuilder[Self <: HammerOptionsWithRecognizers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssProps(value: CssProps): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
      
      @scala.inline
      def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean | (js.Function1[/* manager */ HammerManager, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFunction1(value: /* manager */ HammerManager => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setInputClass(value: HammerInput): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      @scala.inline
      def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
      
      @scala.inline
      def setPreset(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setPresetVarargs(value: RecognizerTuple*): Self = StObject.set(x, "preset", js.Array(value :_*))
      
      @scala.inline
      def setRecognizers(value: StringDictionary[RecognizerOptions]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
      
      @scala.inline
      def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait ReactHammerProps extends StObject {
    
    var action: js.UndefOr[HammerListener] = js.native
    
    var direction: js.UndefOr[
        DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
      ] = js.native
    
    var onDoubleTap: js.UndefOr[HammerListener] = js.native
    
    var onPan: js.UndefOr[HammerListener] = js.native
    
    var onPanCancel: js.UndefOr[HammerListener] = js.native
    
    var onPanEnd: js.UndefOr[HammerListener] = js.native
    
    var onPanStart: js.UndefOr[HammerListener] = js.native
    
    var onPinch: js.UndefOr[HammerListener] = js.native
    
    var onPinchCancel: js.UndefOr[HammerListener] = js.native
    
    var onPinchEnd: js.UndefOr[HammerListener] = js.native
    
    var onPinchIn: js.UndefOr[HammerListener] = js.native
    
    var onPinchOut: js.UndefOr[HammerListener] = js.native
    
    var onPinchStart: js.UndefOr[HammerListener] = js.native
    
    var onPress: js.UndefOr[HammerListener] = js.native
    
    var onPressUp: js.UndefOr[HammerListener] = js.native
    
    var onRotate: js.UndefOr[HammerListener] = js.native
    
    var onRotateCancel: js.UndefOr[HammerListener] = js.native
    
    var onRotateEnd: js.UndefOr[HammerListener] = js.native
    
    var onRotateMove: js.UndefOr[HammerListener] = js.native
    
    var onRotateStart: js.UndefOr[HammerListener] = js.native
    
    var onSwipe: js.UndefOr[HammerListener] = js.native
    
    var onTap: js.UndefOr[HammerListener] = js.native
    
    var options: js.UndefOr[HammerOptionsWithRecognizers] = js.native
    
    var recognizeWith: js.UndefOr[StringDictionary[Recognizer | String]] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ReactHammerProps {
    
    @scala.inline
    def apply(): ReactHammerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactHammerProps]
    }
    
    @scala.inline
    implicit class ReactHammerPropsMutableBuilder[Self <: ReactHammerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setDirection(
        value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOnDoubleTap(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onDoubleTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleTapUndefined: Self = StObject.set(x, "onDoubleTap", js.undefined)
      
      @scala.inline
      def setOnPan(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanCancel(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPanCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanCancelUndefined: Self = StObject.set(x, "onPanCancel", js.undefined)
      
      @scala.inline
      def setOnPanEnd(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPanEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanEndUndefined: Self = StObject.set(x, "onPanEnd", js.undefined)
      
      @scala.inline
      def setOnPanStart(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPanStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanStartUndefined: Self = StObject.set(x, "onPanStart", js.undefined)
      
      @scala.inline
      def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      @scala.inline
      def setOnPinch(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchCancel(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchCancelUndefined: Self = StObject.set(x, "onPinchCancel", js.undefined)
      
      @scala.inline
      def setOnPinchEnd(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchEndUndefined: Self = StObject.set(x, "onPinchEnd", js.undefined)
      
      @scala.inline
      def setOnPinchIn(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchInUndefined: Self = StObject.set(x, "onPinchIn", js.undefined)
      
      @scala.inline
      def setOnPinchOut(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchOutUndefined: Self = StObject.set(x, "onPinchOut", js.undefined)
      
      @scala.inline
      def setOnPinchStart(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPinchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPinchStartUndefined: Self = StObject.set(x, "onPinchStart", js.undefined)
      
      @scala.inline
      def setOnPinchUndefined: Self = StObject.set(x, "onPinch", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnPressUp(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onPressUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUpUndefined: Self = StObject.set(x, "onPressUp", js.undefined)
      
      @scala.inline
      def setOnRotate(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateCancel(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateCancelUndefined: Self = StObject.set(x, "onRotateCancel", js.undefined)
      
      @scala.inline
      def setOnRotateEnd(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateEndUndefined: Self = StObject.set(x, "onRotateEnd", js.undefined)
      
      @scala.inline
      def setOnRotateMove(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateMoveUndefined: Self = StObject.set(x, "onRotateMove", js.undefined)
      
      @scala.inline
      def setOnRotateStart(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onRotateStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotateStartUndefined: Self = StObject.set(x, "onRotateStart", js.undefined)
      
      @scala.inline
      def setOnRotateUndefined: Self = StObject.set(x, "onRotate", js.undefined)
      
      @scala.inline
      def setOnSwipe(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* event */ HammerInput => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setOptions(value: HammerOptionsWithRecognizers): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRecognizeWith(value: StringDictionary[Recognizer | String]): Self = StObject.set(x, "recognizeWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecognizeWithUndefined: Self = StObject.set(x, "recognizeWith", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = ComponentClass[ReactHammerProps, ComponentState]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[ReactHammerProps, ComponentState] = ^
}
