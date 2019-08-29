package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap
  extends GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  var MSGestureChange: Event
  var MSGestureDoubleTap: Event
  var MSGestureEnd: Event
  var MSGestureHold: Event
  var MSGestureStart: Event
  var MSGestureTap: Event
  var MSInertiaStart: Event
  var MSPointerCancel: Event
  var MSPointerDown: Event
  var MSPointerEnter: Event
  var MSPointerLeave: Event
  var MSPointerMove: Event
  var MSPointerOut: Event
  var MSPointerOver: Event
  var MSPointerUp: Event
  var compassneedscalibration: Event
  var devicelight: DeviceLightEvent
  var devicemotion: DeviceMotionEvent
  var deviceorientation: DeviceOrientationEvent
  var deviceorientationabsolute: DeviceOrientationEvent
  var mousewheel: Event
  var orientationchange: Event
  @JSName("progress")
  var progress_WindowEventMap: ProgressEvent[Window]
  var readystatechange: ProgressEvent[Window]
  var vrdisplayactivate: Event
  var vrdisplayblur: Event
  var vrdisplayconnect: Event
  var vrdisplaydeactivate: Event
  var vrdisplaydisconnect: Event
  var vrdisplayfocus: Event
  var vrdisplaypointerrestricted: Event
  var vrdisplaypointerunrestricted: Event
  var vrdisplaypresentchange: Event
}

object WindowEventMap {
  @scala.inline
  def apply(
    MSGestureChange: Event,
    MSGestureDoubleTap: Event,
    MSGestureEnd: Event,
    MSGestureHold: Event,
    MSGestureStart: Event,
    MSGestureTap: Event,
    MSInertiaStart: Event,
    MSPointerCancel: Event,
    MSPointerDown: Event,
    MSPointerEnter: Event,
    MSPointerLeave: Event,
    MSPointerMove: Event,
    MSPointerOut: Event,
    MSPointerOver: Event,
    MSPointerUp: Event,
    abort: UIEvent,
    afterprint: Event,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    compassneedscalibration: Event,
    contextmenu: MouseEvent,
    cuechange: Event,
    dblclick: MouseEvent,
    devicelight: DeviceLightEvent,
    devicemotion: DeviceMotionEvent,
    deviceorientation: DeviceOrientationEvent,
    deviceorientationabsolute: DeviceOrientationEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
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
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    message: MessageEvent,
    messageerror: MessageEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    mousewheel: Event,
    offline: Event,
    online: Event,
    orientationchange: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
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
    progress: ProgressEvent[Window],
    ratechange: Event,
    readystatechange: ProgressEvent[Window],
    rejectionhandled: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    storage: StorageEvent,
    submit: Event,
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
    vrdisplayactivate: Event,
    vrdisplayblur: Event,
    vrdisplayconnect: Event,
    vrdisplaydeactivate: Event,
    vrdisplaydisconnect: Event,
    vrdisplayfocus: Event,
    vrdisplaypointerrestricted: Event,
    vrdisplaypointerunrestricted: Event,
    vrdisplaypresentchange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(MSGestureChange = MSGestureChange, MSGestureDoubleTap = MSGestureDoubleTap, MSGestureEnd = MSGestureEnd, MSGestureHold = MSGestureHold, MSGestureStart = MSGestureStart, MSGestureTap = MSGestureTap, MSInertiaStart = MSInertiaStart, MSPointerCancel = MSPointerCancel, MSPointerDown = MSPointerDown, MSPointerEnter = MSPointerEnter, MSPointerLeave = MSPointerLeave, MSPointerMove = MSPointerMove, MSPointerOut = MSPointerOut, MSPointerOver = MSPointerOver, MSPointerUp = MSPointerUp, abort = abort, afterprint = afterprint, animationcancel = animationcancel, animationend = animationend, animationiteration = animationiteration, animationstart = animationstart, auxclick = auxclick, beforeprint = beforeprint, beforeunload = beforeunload, blur = blur, cancel = cancel, canplay = canplay, canplaythrough = canplaythrough, change = change, click = click, close = close, compassneedscalibration = compassneedscalibration, contextmenu = contextmenu, cuechange = cuechange, dblclick = dblclick, devicelight = devicelight, devicemotion = devicemotion, deviceorientation = deviceorientation, deviceorientationabsolute = deviceorientationabsolute, drag = drag, dragend = dragend, dragenter = dragenter, dragexit = dragexit, dragleave = dragleave, dragover = dragover, dragstart = dragstart, drop = drop, durationchange = durationchange, emptied = emptied, ended = ended, error = error, focus = focus, focusin = focusin, focusout = focusout, gotpointercapture = gotpointercapture, hashchange = hashchange, input = input, invalid = invalid, keydown = keydown, keypress = keypress, keyup = keyup, languagechange = languagechange, load = load, loadeddata = loadeddata, loadedmetadata = loadedmetadata, loadend = loadend, loadstart = loadstart, lostpointercapture = lostpointercapture, message = message, messageerror = messageerror, mousedown = mousedown, mouseenter = mouseenter, mouseleave = mouseleave, mousemove = mousemove, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, mousewheel = mousewheel, offline = offline, online = online, orientationchange = orientationchange, pagehide = pagehide, pageshow = pageshow, pause = pause, play = play, playing = playing, pointercancel = pointercancel, pointerdown = pointerdown, pointerenter = pointerenter, pointerleave = pointerleave, pointermove = pointermove, pointerout = pointerout, pointerover = pointerover, pointerup = pointerup, popstate = popstate, progress = progress, ratechange = ratechange, readystatechange = readystatechange, rejectionhandled = rejectionhandled, reset = reset, resize = resize, scroll = scroll, securitypolicyviolation = securitypolicyviolation, seeked = seeked, seeking = seeking, select = select, selectionchange = selectionchange, selectstart = selectstart, stalled = stalled, storage = storage, submit = submit, suspend = suspend, timeupdate = timeupdate, toggle = toggle, touchcancel = touchcancel, touchend = touchend, touchmove = touchmove, touchstart = touchstart, transitioncancel = transitioncancel, transitionend = transitionend, transitionrun = transitionrun, transitionstart = transitionstart, unhandledrejection = unhandledrejection, unload = unload, volumechange = volumechange, vrdisplayactivate = vrdisplayactivate, vrdisplayblur = vrdisplayblur, vrdisplayconnect = vrdisplayconnect, vrdisplaydeactivate = vrdisplaydeactivate, vrdisplaydisconnect = vrdisplaydisconnect, vrdisplayfocus = vrdisplayfocus, vrdisplaypointerrestricted = vrdisplaypointerrestricted, vrdisplaypointerunrestricted = vrdisplaypointerunrestricted, vrdisplaypresentchange = vrdisplaypresentchange, waiting = waiting, wheel = wheel)
  
    __obj.asInstanceOf[WindowEventMap]
  }
}

