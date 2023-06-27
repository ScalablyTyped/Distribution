package typings.reactNativeListener

import typings.react.mod.Component
import typings.reactNativeListener.anon.Children
import typings.std.AnimationEvent
import typings.std.BeforeUnloadEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.GamepadEvent
import typings.std.HashChangeEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.PageTransitionEvent
import typings.std.PointerEvent
import typings.std.PopStateEvent
import typings.std.ProgressEvent
import typings.std.PromiseRejectionEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.StorageEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.WindowEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-listener", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NativeListenerProps & Children, js.Object, Any]
  
  trait ExtendedWindowEventMap
    extends StObject
       with WindowEventMap {
    
    var doubleclick: MouseEvent
    
    var dragexit: DragEvent
  }
  object ExtendedWindowEventMap {
    
    inline def apply(
      DOMContentLoaded: Event,
      abort: UIEvent,
      afterprint: Event,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      beforeprint: Event,
      beforeunload: BeforeUnloadEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      devicemotion: DeviceMotionEvent,
      deviceorientation: DeviceOrientationEvent,
      doubleclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      gamepadconnected: GamepadEvent,
      gamepaddisconnected: GamepadEvent,
      gotpointercapture: PointerEvent,
      hashchange: HashChangeEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      languagechange: Event,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      message: MessageEvent[Any],
      messageerror: MessageEvent[Any],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      offline: Event,
      online: Event,
      orientationchange: Event,
      pagehide: PageTransitionEvent,
      pageshow: PageTransitionEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      popstate: PopStateEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: Event,
      rejectionhandled: PromiseRejectionEvent,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      storage: StorageEvent,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      unhandledrejection: PromiseRejectionEvent,
      unload: Event,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ExtendedWindowEventMap = {
      val __obj = js.Dynamic.literal(DOMContentLoaded = DOMContentLoaded.asInstanceOf[js.Any], abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], doubleclick = doubleclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedWindowEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedWindowEventMap] (val x: Self) extends AnyVal {
      
      inline def setDoubleclick(value: MouseEvent): Self = StObject.set(x, "doubleclick", value.asInstanceOf[js.Any])
      
      inline def setDragexit(value: DragEvent): Self = StObject.set(x, "dragexit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeListener.reactNativeListenerStrings.Click
    - typings.reactNativeListener.reactNativeListenerStrings.ContextMenu
    - typings.reactNativeListener.reactNativeListenerStrings.DoubleClick
    - typings.reactNativeListener.reactNativeListenerStrings.Drag
    - typings.reactNativeListener.reactNativeListenerStrings.DragEnd
    - typings.reactNativeListener.reactNativeListenerStrings.DragEnter
    - typings.reactNativeListener.reactNativeListenerStrings.DragExit
    - typings.reactNativeListener.reactNativeListenerStrings.DragLeave
    - typings.reactNativeListener.reactNativeListenerStrings.DragOver
    - typings.reactNativeListener.reactNativeListenerStrings.DragStart
    - typings.reactNativeListener.reactNativeListenerStrings.Drop
    - typings.reactNativeListener.reactNativeListenerStrings.Focus
    - typings.reactNativeListener.reactNativeListenerStrings.KeyDown
    - typings.reactNativeListener.reactNativeListenerStrings.KeyPress
    - typings.reactNativeListener.reactNativeListenerStrings.KeyUp
    - typings.reactNativeListener.reactNativeListenerStrings.MouseDown
    - typings.reactNativeListener.reactNativeListenerStrings.MouseEnter
    - typings.reactNativeListener.reactNativeListenerStrings.MouseLeave
    - typings.reactNativeListener.reactNativeListenerStrings.MouseMove
    - typings.reactNativeListener.reactNativeListenerStrings.MouseOut
    - typings.reactNativeListener.reactNativeListenerStrings.MouseOver
    - typings.reactNativeListener.reactNativeListenerStrings.MouseUp
    - typings.reactNativeListener.reactNativeListenerStrings.PointerCancel
    - typings.reactNativeListener.reactNativeListenerStrings.PointerDown
    - typings.reactNativeListener.reactNativeListenerStrings.PointerEnter
    - typings.reactNativeListener.reactNativeListenerStrings.PointerLeave
    - typings.reactNativeListener.reactNativeListenerStrings.PointerMove
    - typings.reactNativeListener.reactNativeListenerStrings.PointerOut
    - typings.reactNativeListener.reactNativeListenerStrings.PointerOver
    - typings.reactNativeListener.reactNativeListenerStrings.PointerUp
    - typings.reactNativeListener.reactNativeListenerStrings.Scroll
    - typings.reactNativeListener.reactNativeListenerStrings.TouchCancel
    - typings.reactNativeListener.reactNativeListenerStrings.TouchEnd
    - typings.reactNativeListener.reactNativeListenerStrings.TouchMove
    - typings.reactNativeListener.reactNativeListenerStrings.TouchStart
  */
  trait NativeEvent extends StObject
  object NativeEvent {
    
    inline def Click: typings.reactNativeListener.reactNativeListenerStrings.Click = "Click".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.Click]
    
    inline def ContextMenu: typings.reactNativeListener.reactNativeListenerStrings.ContextMenu = "ContextMenu".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.ContextMenu]
    
    inline def DoubleClick: typings.reactNativeListener.reactNativeListenerStrings.DoubleClick = "DoubleClick".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DoubleClick]
    
    inline def Drag: typings.reactNativeListener.reactNativeListenerStrings.Drag = "Drag".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.Drag]
    
    inline def DragEnd: typings.reactNativeListener.reactNativeListenerStrings.DragEnd = "DragEnd".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DragEnd]
    
    inline def DragEnter: typings.reactNativeListener.reactNativeListenerStrings.DragEnter = "DragEnter".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DragEnter]
    
    inline def DragExit: typings.reactNativeListener.reactNativeListenerStrings.DragExit = "DragExit".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DragExit]
    
    inline def DragLeave: typings.reactNativeListener.reactNativeListenerStrings.DragLeave = "DragLeave".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DragLeave]
    
    inline def DragOver: typings.reactNativeListener.reactNativeListenerStrings.DragOver = "DragOver".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DragOver]
    
    inline def DragStart: typings.reactNativeListener.reactNativeListenerStrings.DragStart = "DragStart".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.DragStart]
    
    inline def Drop: typings.reactNativeListener.reactNativeListenerStrings.Drop = "Drop".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.Drop]
    
    inline def Focus: typings.reactNativeListener.reactNativeListenerStrings.Focus = "Focus".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.Focus]
    
    inline def KeyDown: typings.reactNativeListener.reactNativeListenerStrings.KeyDown = "KeyDown".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.KeyDown]
    
    inline def KeyPress: typings.reactNativeListener.reactNativeListenerStrings.KeyPress = "KeyPress".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.KeyPress]
    
    inline def KeyUp: typings.reactNativeListener.reactNativeListenerStrings.KeyUp = "KeyUp".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.KeyUp]
    
    inline def MouseDown: typings.reactNativeListener.reactNativeListenerStrings.MouseDown = "MouseDown".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseDown]
    
    inline def MouseEnter: typings.reactNativeListener.reactNativeListenerStrings.MouseEnter = "MouseEnter".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseEnter]
    
    inline def MouseLeave: typings.reactNativeListener.reactNativeListenerStrings.MouseLeave = "MouseLeave".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseLeave]
    
    inline def MouseMove: typings.reactNativeListener.reactNativeListenerStrings.MouseMove = "MouseMove".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseMove]
    
    inline def MouseOut: typings.reactNativeListener.reactNativeListenerStrings.MouseOut = "MouseOut".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseOut]
    
    inline def MouseOver: typings.reactNativeListener.reactNativeListenerStrings.MouseOver = "MouseOver".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseOver]
    
    inline def MouseUp: typings.reactNativeListener.reactNativeListenerStrings.MouseUp = "MouseUp".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.MouseUp]
    
    inline def PointerCancel: typings.reactNativeListener.reactNativeListenerStrings.PointerCancel = "PointerCancel".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerCancel]
    
    inline def PointerDown: typings.reactNativeListener.reactNativeListenerStrings.PointerDown = "PointerDown".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerDown]
    
    inline def PointerEnter: typings.reactNativeListener.reactNativeListenerStrings.PointerEnter = "PointerEnter".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerEnter]
    
    inline def PointerLeave: typings.reactNativeListener.reactNativeListenerStrings.PointerLeave = "PointerLeave".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerLeave]
    
    inline def PointerMove: typings.reactNativeListener.reactNativeListenerStrings.PointerMove = "PointerMove".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerMove]
    
    inline def PointerOut: typings.reactNativeListener.reactNativeListenerStrings.PointerOut = "PointerOut".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerOut]
    
    inline def PointerOver: typings.reactNativeListener.reactNativeListenerStrings.PointerOver = "PointerOver".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerOver]
    
    inline def PointerUp: typings.reactNativeListener.reactNativeListenerStrings.PointerUp = "PointerUp".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.PointerUp]
    
    inline def Scroll: typings.reactNativeListener.reactNativeListenerStrings.Scroll = "Scroll".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.Scroll]
    
    inline def TouchCancel: typings.reactNativeListener.reactNativeListenerStrings.TouchCancel = "TouchCancel".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.TouchCancel]
    
    inline def TouchEnd: typings.reactNativeListener.reactNativeListenerStrings.TouchEnd = "TouchEnd".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.TouchEnd]
    
    inline def TouchMove: typings.reactNativeListener.reactNativeListenerStrings.TouchMove = "TouchMove".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.TouchMove]
    
    inline def TouchStart: typings.reactNativeListener.reactNativeListenerStrings.TouchStart = "TouchStart".asInstanceOf[typings.reactNativeListener.reactNativeListenerStrings.TouchStart]
  }
  
  type NativeListener = Component[NativeListenerProps & Children, js.Object, Any]
  
  /* Inlined {[ EventName in react-native-listener.react-native-listener.NativeEvent as / * template literal string: on${EventName} * / string ]:? (event : react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<EventName>]): any} */
  trait NativeListenerBubbleProps
    extends StObject
       with NativeListenerProps {
    
    var Click: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Click'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var ContextMenu: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'ContextMenu'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DoubleClick: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DoubleClick'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Drag: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drag'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragEnd: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnd'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragEnter: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnter'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragExit: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragExit'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragLeave: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragLeave'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragOver: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragOver'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragStart: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragStart'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Drop: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drop'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Focus: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Focus'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var KeyDown: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyDown'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var KeyPress: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyPress'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var KeyUp: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyUp'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseDown: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseDown'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseEnter: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseEnter'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseLeave: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseLeave'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseMove: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseMove'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseOut: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOut'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseOver: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOver'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseUp: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseUp'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerCancel: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerCancel'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerDown: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerDown'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerEnter: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerEnter'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerLeave: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerLeave'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerMove: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerMove'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerOut: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOut'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerOver: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOver'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerUp: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerUp'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Scroll: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Scroll'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchCancel: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchCancel'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchEnd: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchEnd'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchMove: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchMove'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchStart: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchStart'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
  }
  object NativeListenerBubbleProps {
    
    inline def apply(): NativeListenerBubbleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeListenerBubbleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeListenerBubbleProps] (val x: Self) extends AnyVal {
      
      inline def setClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Click'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'ContextMenu'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "ContextMenu", js.Any.fromFunction1(value))
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "ContextMenu", js.undefined)
      
      inline def setDoubleClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DoubleClick'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DoubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "DoubleClick", js.undefined)
      
      inline def setDrag(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drag'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Drag", js.Any.fromFunction1(value))
      
      inline def setDragEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnd'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragEnd", js.Any.fromFunction1(value))
      
      inline def setDragEndUndefined: Self = StObject.set(x, "DragEnd", js.undefined)
      
      inline def setDragEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnter'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragEnter", js.Any.fromFunction1(value))
      
      inline def setDragEnterUndefined: Self = StObject.set(x, "DragEnter", js.undefined)
      
      inline def setDragExit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragExit'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragExit", js.Any.fromFunction1(value))
      
      inline def setDragExitUndefined: Self = StObject.set(x, "DragExit", js.undefined)
      
      inline def setDragLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragLeave'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragLeave", js.Any.fromFunction1(value))
      
      inline def setDragLeaveUndefined: Self = StObject.set(x, "DragLeave", js.undefined)
      
      inline def setDragOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragOver'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragOver", js.Any.fromFunction1(value))
      
      inline def setDragOverUndefined: Self = StObject.set(x, "DragOver", js.undefined)
      
      inline def setDragStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragStart'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragStart", js.Any.fromFunction1(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "DragStart", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "Drag", js.undefined)
      
      inline def setDrop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drop'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "Drop", js.undefined)
      
      inline def setFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Focus'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "Focus", js.undefined)
      
      inline def setKeyDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyDown'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "KeyDown", js.Any.fromFunction1(value))
      
      inline def setKeyDownUndefined: Self = StObject.set(x, "KeyDown", js.undefined)
      
      inline def setKeyPress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyPress'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "KeyPress", js.Any.fromFunction1(value))
      
      inline def setKeyPressUndefined: Self = StObject.set(x, "KeyPress", js.undefined)
      
      inline def setKeyUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyUp'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "KeyUp", js.Any.fromFunction1(value))
      
      inline def setKeyUpUndefined: Self = StObject.set(x, "KeyUp", js.undefined)
      
      inline def setMouseDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseDown'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseDown", js.Any.fromFunction1(value))
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "MouseDown", js.undefined)
      
      inline def setMouseEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseEnter'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseEnter", js.Any.fromFunction1(value))
      
      inline def setMouseEnterUndefined: Self = StObject.set(x, "MouseEnter", js.undefined)
      
      inline def setMouseLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseLeave'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseLeave", js.Any.fromFunction1(value))
      
      inline def setMouseLeaveUndefined: Self = StObject.set(x, "MouseLeave", js.undefined)
      
      inline def setMouseMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseMove'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseMove", js.Any.fromFunction1(value))
      
      inline def setMouseMoveUndefined: Self = StObject.set(x, "MouseMove", js.undefined)
      
      inline def setMouseOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOut'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseOut", js.Any.fromFunction1(value))
      
      inline def setMouseOutUndefined: Self = StObject.set(x, "MouseOut", js.undefined)
      
      inline def setMouseOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOver'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseOver", js.Any.fromFunction1(value))
      
      inline def setMouseOverUndefined: Self = StObject.set(x, "MouseOver", js.undefined)
      
      inline def setMouseUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseUp'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseUp", js.Any.fromFunction1(value))
      
      inline def setMouseUpUndefined: Self = StObject.set(x, "MouseUp", js.undefined)
      
      inline def setPointerCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerCancel'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerCancel", js.Any.fromFunction1(value))
      
      inline def setPointerCancelUndefined: Self = StObject.set(x, "PointerCancel", js.undefined)
      
      inline def setPointerDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerDown'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerDown", js.Any.fromFunction1(value))
      
      inline def setPointerDownUndefined: Self = StObject.set(x, "PointerDown", js.undefined)
      
      inline def setPointerEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerEnter'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerEnter", js.Any.fromFunction1(value))
      
      inline def setPointerEnterUndefined: Self = StObject.set(x, "PointerEnter", js.undefined)
      
      inline def setPointerLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerLeave'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerLeave", js.Any.fromFunction1(value))
      
      inline def setPointerLeaveUndefined: Self = StObject.set(x, "PointerLeave", js.undefined)
      
      inline def setPointerMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerMove'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerMove", js.Any.fromFunction1(value))
      
      inline def setPointerMoveUndefined: Self = StObject.set(x, "PointerMove", js.undefined)
      
      inline def setPointerOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOut'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerOut", js.Any.fromFunction1(value))
      
      inline def setPointerOutUndefined: Self = StObject.set(x, "PointerOut", js.undefined)
      
      inline def setPointerOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOver'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerOver", js.Any.fromFunction1(value))
      
      inline def setPointerOverUndefined: Self = StObject.set(x, "PointerOver", js.undefined)
      
      inline def setPointerUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerUp'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerUp", js.Any.fromFunction1(value))
      
      inline def setPointerUpUndefined: Self = StObject.set(x, "PointerUp", js.undefined)
      
      inline def setScroll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Scroll'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Scroll", js.Any.fromFunction1(value))
      
      inline def setScrollUndefined: Self = StObject.set(x, "Scroll", js.undefined)
      
      inline def setTouchCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchCancel'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchCancel", js.Any.fromFunction1(value))
      
      inline def setTouchCancelUndefined: Self = StObject.set(x, "TouchCancel", js.undefined)
      
      inline def setTouchEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchEnd'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchEnd", js.Any.fromFunction1(value))
      
      inline def setTouchEndUndefined: Self = StObject.set(x, "TouchEnd", js.undefined)
      
      inline def setTouchMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchMove'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchMove", js.Any.fromFunction1(value))
      
      inline def setTouchMoveUndefined: Self = StObject.set(x, "TouchMove", js.undefined)
      
      inline def setTouchStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchStart'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchStart", js.Any.fromFunction1(value))
      
      inline def setTouchStartUndefined: Self = StObject.set(x, "TouchStart", js.undefined)
    }
  }
  
  /* Inlined {[ EventName in react-native-listener.react-native-listener.NativeEvent as / * template literal string: on${EventName}Capture * / string ]:? (event : react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<EventName>]): any} */
  trait NativeListenerCaptureProps
    extends StObject
       with NativeListenerProps {
    
    var Click: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Click'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var ContextMenu: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'ContextMenu'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DoubleClick: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DoubleClick'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Drag: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drag'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragEnd: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnd'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragEnter: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnter'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragExit: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragExit'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragLeave: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragLeave'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragOver: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragOver'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var DragStart: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragStart'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Drop: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drop'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Focus: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Focus'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var KeyDown: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyDown'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var KeyPress: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyPress'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var KeyUp: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyUp'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseDown: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseDown'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseEnter: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseEnter'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseLeave: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseLeave'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseMove: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseMove'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseOut: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOut'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseOver: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOver'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var MouseUp: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseUp'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerCancel: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerCancel'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerDown: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerDown'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerEnter: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerEnter'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerLeave: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerLeave'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerMove: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerMove'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerOut: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOut'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerOver: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOver'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var PointerUp: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerUp'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var Scroll: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Scroll'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchCancel: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchCancel'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchEnd: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchEnd'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchMove: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchMove'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
    
    var TouchStart: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchStart'>] */ /* event */ js.Any, 
          Any
        ]
      ] = js.undefined
  }
  object NativeListenerCaptureProps {
    
    inline def apply(): NativeListenerCaptureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeListenerCaptureProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeListenerCaptureProps] (val x: Self) extends AnyVal {
      
      inline def setClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Click'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'ContextMenu'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "ContextMenu", js.Any.fromFunction1(value))
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "ContextMenu", js.undefined)
      
      inline def setDoubleClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DoubleClick'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DoubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "DoubleClick", js.undefined)
      
      inline def setDrag(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drag'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Drag", js.Any.fromFunction1(value))
      
      inline def setDragEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnd'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragEnd", js.Any.fromFunction1(value))
      
      inline def setDragEndUndefined: Self = StObject.set(x, "DragEnd", js.undefined)
      
      inline def setDragEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragEnter'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragEnter", js.Any.fromFunction1(value))
      
      inline def setDragEnterUndefined: Self = StObject.set(x, "DragEnter", js.undefined)
      
      inline def setDragExit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragExit'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragExit", js.Any.fromFunction1(value))
      
      inline def setDragExitUndefined: Self = StObject.set(x, "DragExit", js.undefined)
      
      inline def setDragLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragLeave'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragLeave", js.Any.fromFunction1(value))
      
      inline def setDragLeaveUndefined: Self = StObject.set(x, "DragLeave", js.undefined)
      
      inline def setDragOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragOver'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragOver", js.Any.fromFunction1(value))
      
      inline def setDragOverUndefined: Self = StObject.set(x, "DragOver", js.undefined)
      
      inline def setDragStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'DragStart'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "DragStart", js.Any.fromFunction1(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "DragStart", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "Drag", js.undefined)
      
      inline def setDrop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Drop'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "Drop", js.undefined)
      
      inline def setFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Focus'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "Focus", js.undefined)
      
      inline def setKeyDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyDown'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "KeyDown", js.Any.fromFunction1(value))
      
      inline def setKeyDownUndefined: Self = StObject.set(x, "KeyDown", js.undefined)
      
      inline def setKeyPress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyPress'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "KeyPress", js.Any.fromFunction1(value))
      
      inline def setKeyPressUndefined: Self = StObject.set(x, "KeyPress", js.undefined)
      
      inline def setKeyUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'KeyUp'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "KeyUp", js.Any.fromFunction1(value))
      
      inline def setKeyUpUndefined: Self = StObject.set(x, "KeyUp", js.undefined)
      
      inline def setMouseDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseDown'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseDown", js.Any.fromFunction1(value))
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "MouseDown", js.undefined)
      
      inline def setMouseEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseEnter'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseEnter", js.Any.fromFunction1(value))
      
      inline def setMouseEnterUndefined: Self = StObject.set(x, "MouseEnter", js.undefined)
      
      inline def setMouseLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseLeave'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseLeave", js.Any.fromFunction1(value))
      
      inline def setMouseLeaveUndefined: Self = StObject.set(x, "MouseLeave", js.undefined)
      
      inline def setMouseMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseMove'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseMove", js.Any.fromFunction1(value))
      
      inline def setMouseMoveUndefined: Self = StObject.set(x, "MouseMove", js.undefined)
      
      inline def setMouseOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOut'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseOut", js.Any.fromFunction1(value))
      
      inline def setMouseOutUndefined: Self = StObject.set(x, "MouseOut", js.undefined)
      
      inline def setMouseOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseOver'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseOver", js.Any.fromFunction1(value))
      
      inline def setMouseOverUndefined: Self = StObject.set(x, "MouseOver", js.undefined)
      
      inline def setMouseUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'MouseUp'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "MouseUp", js.Any.fromFunction1(value))
      
      inline def setMouseUpUndefined: Self = StObject.set(x, "MouseUp", js.undefined)
      
      inline def setPointerCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerCancel'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerCancel", js.Any.fromFunction1(value))
      
      inline def setPointerCancelUndefined: Self = StObject.set(x, "PointerCancel", js.undefined)
      
      inline def setPointerDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerDown'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerDown", js.Any.fromFunction1(value))
      
      inline def setPointerDownUndefined: Self = StObject.set(x, "PointerDown", js.undefined)
      
      inline def setPointerEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerEnter'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerEnter", js.Any.fromFunction1(value))
      
      inline def setPointerEnterUndefined: Self = StObject.set(x, "PointerEnter", js.undefined)
      
      inline def setPointerLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerLeave'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerLeave", js.Any.fromFunction1(value))
      
      inline def setPointerLeaveUndefined: Self = StObject.set(x, "PointerLeave", js.undefined)
      
      inline def setPointerMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerMove'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerMove", js.Any.fromFunction1(value))
      
      inline def setPointerMoveUndefined: Self = StObject.set(x, "PointerMove", js.undefined)
      
      inline def setPointerOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOut'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerOut", js.Any.fromFunction1(value))
      
      inline def setPointerOutUndefined: Self = StObject.set(x, "PointerOut", js.undefined)
      
      inline def setPointerOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerOver'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerOver", js.Any.fromFunction1(value))
      
      inline def setPointerOverUndefined: Self = StObject.set(x, "PointerOver", js.undefined)
      
      inline def setPointerUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'PointerUp'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "PointerUp", js.Any.fromFunction1(value))
      
      inline def setPointerUpUndefined: Self = StObject.set(x, "PointerUp", js.undefined)
      
      inline def setScroll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'Scroll'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "Scroll", js.Any.fromFunction1(value))
      
      inline def setScrollUndefined: Self = StObject.set(x, "Scroll", js.undefined)
      
      inline def setTouchCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchCancel'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchCancel", js.Any.fromFunction1(value))
      
      inline def setTouchCancelUndefined: Self = StObject.set(x, "TouchCancel", js.undefined)
      
      inline def setTouchEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchEnd'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchEnd", js.Any.fromFunction1(value))
      
      inline def setTouchEndUndefined: Self = StObject.set(x, "TouchEnd", js.undefined)
      
      inline def setTouchMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchMove'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchMove", js.Any.fromFunction1(value))
      
      inline def setTouchMoveUndefined: Self = StObject.set(x, "TouchMove", js.undefined)
      
      inline def setTouchStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-native-listener.react-native-listener.ExtendedWindowEventMap[std.Lowercase<'TouchStart'>] */ /* event */ js.Any => Any
      ): Self = StObject.set(x, "TouchStart", js.Any.fromFunction1(value))
      
      inline def setTouchStartUndefined: Self = StObject.set(x, "TouchStart", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeListener.mod.NativeListenerBubbleProps
    - typings.reactNativeListener.mod.NativeListenerCaptureProps
    - typings.reactNativeListener.mod.NativeListenerStopProps
  */
  trait NativeListenerProps extends StObject
  object NativeListenerProps {
    
    inline def NativeListenerBubbleProps(): typings.reactNativeListener.mod.NativeListenerBubbleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactNativeListener.mod.NativeListenerBubbleProps]
    }
    
    inline def NativeListenerCaptureProps(): typings.reactNativeListener.mod.NativeListenerCaptureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactNativeListener.mod.NativeListenerCaptureProps]
    }
    
    inline def NativeListenerStopProps(): typings.reactNativeListener.mod.NativeListenerStopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactNativeListener.mod.NativeListenerStopProps]
    }
  }
  
  /* Inlined {[ EventName in react-native-listener.react-native-listener.NativeEvent as / * template literal string: stop${EventName} * / string ]:? boolean} */
  trait NativeListenerStopProps
    extends StObject
       with NativeListenerProps {
    
    var Click: js.UndefOr[Boolean] = js.undefined
    
    var ContextMenu: js.UndefOr[Boolean] = js.undefined
    
    var DoubleClick: js.UndefOr[Boolean] = js.undefined
    
    var Drag: js.UndefOr[Boolean] = js.undefined
    
    var DragEnd: js.UndefOr[Boolean] = js.undefined
    
    var DragEnter: js.UndefOr[Boolean] = js.undefined
    
    var DragExit: js.UndefOr[Boolean] = js.undefined
    
    var DragLeave: js.UndefOr[Boolean] = js.undefined
    
    var DragOver: js.UndefOr[Boolean] = js.undefined
    
    var DragStart: js.UndefOr[Boolean] = js.undefined
    
    var Drop: js.UndefOr[Boolean] = js.undefined
    
    var Focus: js.UndefOr[Boolean] = js.undefined
    
    var KeyDown: js.UndefOr[Boolean] = js.undefined
    
    var KeyPress: js.UndefOr[Boolean] = js.undefined
    
    var KeyUp: js.UndefOr[Boolean] = js.undefined
    
    var MouseDown: js.UndefOr[Boolean] = js.undefined
    
    var MouseEnter: js.UndefOr[Boolean] = js.undefined
    
    var MouseLeave: js.UndefOr[Boolean] = js.undefined
    
    var MouseMove: js.UndefOr[Boolean] = js.undefined
    
    var MouseOut: js.UndefOr[Boolean] = js.undefined
    
    var MouseOver: js.UndefOr[Boolean] = js.undefined
    
    var MouseUp: js.UndefOr[Boolean] = js.undefined
    
    var PointerCancel: js.UndefOr[Boolean] = js.undefined
    
    var PointerDown: js.UndefOr[Boolean] = js.undefined
    
    var PointerEnter: js.UndefOr[Boolean] = js.undefined
    
    var PointerLeave: js.UndefOr[Boolean] = js.undefined
    
    var PointerMove: js.UndefOr[Boolean] = js.undefined
    
    var PointerOut: js.UndefOr[Boolean] = js.undefined
    
    var PointerOver: js.UndefOr[Boolean] = js.undefined
    
    var PointerUp: js.UndefOr[Boolean] = js.undefined
    
    var Scroll: js.UndefOr[Boolean] = js.undefined
    
    var TouchCancel: js.UndefOr[Boolean] = js.undefined
    
    var TouchEnd: js.UndefOr[Boolean] = js.undefined
    
    var TouchMove: js.UndefOr[Boolean] = js.undefined
    
    var TouchStart: js.UndefOr[Boolean] = js.undefined
  }
  object NativeListenerStopProps {
    
    inline def apply(): NativeListenerStopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeListenerStopProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeListenerStopProps] (val x: Self) extends AnyVal {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setContextMenu(value: Boolean): Self = StObject.set(x, "ContextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "ContextMenu", js.undefined)
      
      inline def setDoubleClick(value: Boolean): Self = StObject.set(x, "DoubleClick", value.asInstanceOf[js.Any])
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "DoubleClick", js.undefined)
      
      inline def setDrag(value: Boolean): Self = StObject.set(x, "Drag", value.asInstanceOf[js.Any])
      
      inline def setDragEnd(value: Boolean): Self = StObject.set(x, "DragEnd", value.asInstanceOf[js.Any])
      
      inline def setDragEndUndefined: Self = StObject.set(x, "DragEnd", js.undefined)
      
      inline def setDragEnter(value: Boolean): Self = StObject.set(x, "DragEnter", value.asInstanceOf[js.Any])
      
      inline def setDragEnterUndefined: Self = StObject.set(x, "DragEnter", js.undefined)
      
      inline def setDragExit(value: Boolean): Self = StObject.set(x, "DragExit", value.asInstanceOf[js.Any])
      
      inline def setDragExitUndefined: Self = StObject.set(x, "DragExit", js.undefined)
      
      inline def setDragLeave(value: Boolean): Self = StObject.set(x, "DragLeave", value.asInstanceOf[js.Any])
      
      inline def setDragLeaveUndefined: Self = StObject.set(x, "DragLeave", js.undefined)
      
      inline def setDragOver(value: Boolean): Self = StObject.set(x, "DragOver", value.asInstanceOf[js.Any])
      
      inline def setDragOverUndefined: Self = StObject.set(x, "DragOver", js.undefined)
      
      inline def setDragStart(value: Boolean): Self = StObject.set(x, "DragStart", value.asInstanceOf[js.Any])
      
      inline def setDragStartUndefined: Self = StObject.set(x, "DragStart", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "Drag", js.undefined)
      
      inline def setDrop(value: Boolean): Self = StObject.set(x, "Drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "Drop", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "Focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "Focus", js.undefined)
      
      inline def setKeyDown(value: Boolean): Self = StObject.set(x, "KeyDown", value.asInstanceOf[js.Any])
      
      inline def setKeyDownUndefined: Self = StObject.set(x, "KeyDown", js.undefined)
      
      inline def setKeyPress(value: Boolean): Self = StObject.set(x, "KeyPress", value.asInstanceOf[js.Any])
      
      inline def setKeyPressUndefined: Self = StObject.set(x, "KeyPress", js.undefined)
      
      inline def setKeyUp(value: Boolean): Self = StObject.set(x, "KeyUp", value.asInstanceOf[js.Any])
      
      inline def setKeyUpUndefined: Self = StObject.set(x, "KeyUp", js.undefined)
      
      inline def setMouseDown(value: Boolean): Self = StObject.set(x, "MouseDown", value.asInstanceOf[js.Any])
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "MouseDown", js.undefined)
      
      inline def setMouseEnter(value: Boolean): Self = StObject.set(x, "MouseEnter", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterUndefined: Self = StObject.set(x, "MouseEnter", js.undefined)
      
      inline def setMouseLeave(value: Boolean): Self = StObject.set(x, "MouseLeave", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveUndefined: Self = StObject.set(x, "MouseLeave", js.undefined)
      
      inline def setMouseMove(value: Boolean): Self = StObject.set(x, "MouseMove", value.asInstanceOf[js.Any])
      
      inline def setMouseMoveUndefined: Self = StObject.set(x, "MouseMove", js.undefined)
      
      inline def setMouseOut(value: Boolean): Self = StObject.set(x, "MouseOut", value.asInstanceOf[js.Any])
      
      inline def setMouseOutUndefined: Self = StObject.set(x, "MouseOut", js.undefined)
      
      inline def setMouseOver(value: Boolean): Self = StObject.set(x, "MouseOver", value.asInstanceOf[js.Any])
      
      inline def setMouseOverUndefined: Self = StObject.set(x, "MouseOver", js.undefined)
      
      inline def setMouseUp(value: Boolean): Self = StObject.set(x, "MouseUp", value.asInstanceOf[js.Any])
      
      inline def setMouseUpUndefined: Self = StObject.set(x, "MouseUp", js.undefined)
      
      inline def setPointerCancel(value: Boolean): Self = StObject.set(x, "PointerCancel", value.asInstanceOf[js.Any])
      
      inline def setPointerCancelUndefined: Self = StObject.set(x, "PointerCancel", js.undefined)
      
      inline def setPointerDown(value: Boolean): Self = StObject.set(x, "PointerDown", value.asInstanceOf[js.Any])
      
      inline def setPointerDownUndefined: Self = StObject.set(x, "PointerDown", js.undefined)
      
      inline def setPointerEnter(value: Boolean): Self = StObject.set(x, "PointerEnter", value.asInstanceOf[js.Any])
      
      inline def setPointerEnterUndefined: Self = StObject.set(x, "PointerEnter", js.undefined)
      
      inline def setPointerLeave(value: Boolean): Self = StObject.set(x, "PointerLeave", value.asInstanceOf[js.Any])
      
      inline def setPointerLeaveUndefined: Self = StObject.set(x, "PointerLeave", js.undefined)
      
      inline def setPointerMove(value: Boolean): Self = StObject.set(x, "PointerMove", value.asInstanceOf[js.Any])
      
      inline def setPointerMoveUndefined: Self = StObject.set(x, "PointerMove", js.undefined)
      
      inline def setPointerOut(value: Boolean): Self = StObject.set(x, "PointerOut", value.asInstanceOf[js.Any])
      
      inline def setPointerOutUndefined: Self = StObject.set(x, "PointerOut", js.undefined)
      
      inline def setPointerOver(value: Boolean): Self = StObject.set(x, "PointerOver", value.asInstanceOf[js.Any])
      
      inline def setPointerOverUndefined: Self = StObject.set(x, "PointerOver", js.undefined)
      
      inline def setPointerUp(value: Boolean): Self = StObject.set(x, "PointerUp", value.asInstanceOf[js.Any])
      
      inline def setPointerUpUndefined: Self = StObject.set(x, "PointerUp", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "Scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "Scroll", js.undefined)
      
      inline def setTouchCancel(value: Boolean): Self = StObject.set(x, "TouchCancel", value.asInstanceOf[js.Any])
      
      inline def setTouchCancelUndefined: Self = StObject.set(x, "TouchCancel", js.undefined)
      
      inline def setTouchEnd(value: Boolean): Self = StObject.set(x, "TouchEnd", value.asInstanceOf[js.Any])
      
      inline def setTouchEndUndefined: Self = StObject.set(x, "TouchEnd", js.undefined)
      
      inline def setTouchMove(value: Boolean): Self = StObject.set(x, "TouchMove", value.asInstanceOf[js.Any])
      
      inline def setTouchMoveUndefined: Self = StObject.set(x, "TouchMove", js.undefined)
      
      inline def setTouchStart(value: Boolean): Self = StObject.set(x, "TouchStart", value.asInstanceOf[js.Any])
      
      inline def setTouchStartUndefined: Self = StObject.set(x, "TouchStart", js.undefined)
    }
  }
}
