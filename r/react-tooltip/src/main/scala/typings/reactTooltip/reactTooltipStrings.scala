package typings.reactTooltip

import typings.reactTooltip.mod.Effect
import typings.reactTooltip.mod.Place
import typings.reactTooltip.mod.Type
import typings.reactTooltip.mod._ElementEvents
import typings.reactTooltip.mod._WindowEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTooltipStrings {
  @js.native
  sealed trait MSGestureChange extends _WindowEvents
  
  @js.native
  sealed trait MSGestureDoubleTap extends _WindowEvents
  
  @js.native
  sealed trait MSGestureEnd extends _WindowEvents
  
  @js.native
  sealed trait MSGestureHold extends _WindowEvents
  
  @js.native
  sealed trait MSGestureStart extends _WindowEvents
  
  @js.native
  sealed trait MSGestureTap extends _WindowEvents
  
  @js.native
  sealed trait MSInertiaStart extends _WindowEvents
  
  @js.native
  sealed trait MSPointerCancel extends _WindowEvents
  
  @js.native
  sealed trait MSPointerDown extends _WindowEvents
  
  @js.native
  sealed trait MSPointerEnter extends _WindowEvents
  
  @js.native
  sealed trait MSPointerLeave extends _WindowEvents
  
  @js.native
  sealed trait MSPointerMove extends _WindowEvents
  
  @js.native
  sealed trait MSPointerOut extends _WindowEvents
  
  @js.native
  sealed trait MSPointerOver extends _WindowEvents
  
  @js.native
  sealed trait MSPointerUp extends _WindowEvents
  
  @js.native
  sealed trait abort
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait afterprint extends _WindowEvents
  
  @js.native
  sealed trait animationcancel extends _ElementEvents
  
  @js.native
  sealed trait animationend extends _ElementEvents
  
  @js.native
  sealed trait animationiteration extends _ElementEvents
  
  @js.native
  sealed trait animationstart extends _ElementEvents
  
  @js.native
  sealed trait auxclick extends _ElementEvents
  
  @js.native
  sealed trait beforeprint extends _WindowEvents
  
  @js.native
  sealed trait beforeunload extends _WindowEvents
  
  @js.native
  sealed trait blur
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait bottom extends Place
  
  @js.native
  sealed trait cancel extends _ElementEvents
  
  @js.native
  sealed trait canplay
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait canplaythrough
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait change
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait click
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait close extends _ElementEvents
  
  @js.native
  sealed trait compassneedscalibration extends _WindowEvents
  
  @js.native
  sealed trait contextmenu
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait copy extends _ElementEvents
  
  @js.native
  sealed trait cuechange extends _ElementEvents
  
  @js.native
  sealed trait cut extends _ElementEvents
  
  @js.native
  sealed trait dark extends Type
  
  @js.native
  sealed trait dblclick
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait devicelight extends _WindowEvents
  
  @js.native
  sealed trait devicemotion extends _WindowEvents
  
  @js.native
  sealed trait deviceorientation extends _WindowEvents
  
  @js.native
  sealed trait deviceorientationabsolute extends _WindowEvents
  
  @js.native
  sealed trait div extends js.Object
  
  @js.native
  sealed trait drag
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait dragend
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait dragenter
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait dragexit extends _ElementEvents
  
  @js.native
  sealed trait dragleave
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait dragover
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait dragstart
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait drop
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait durationchange
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait emptied
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait ended
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait error
    extends Type
       with _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait float extends Effect
  
  @js.native
  sealed trait focus
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait focusin extends _ElementEvents
  
  @js.native
  sealed trait focusout extends _ElementEvents
  
  @js.native
  sealed trait fullscreenchange extends _ElementEvents
  
  @js.native
  sealed trait fullscreenerror extends _ElementEvents
  
  @js.native
  sealed trait gotpointercapture extends _ElementEvents
  
  @js.native
  sealed trait hashchange extends _WindowEvents
  
  @js.native
  sealed trait info extends Type
  
  @js.native
  sealed trait input
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait invalid
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait keydown
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait keypress
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait keyup
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait left extends Place
  
  @js.native
  sealed trait light extends Type
  
  @js.native
  sealed trait load
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait loadeddata
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait loadedmetadata
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait loadstart
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait lostpointercapture extends _ElementEvents
  
  @js.native
  sealed trait message extends _WindowEvents
  
  @js.native
  sealed trait mousedown
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mouseenter
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mouseleave
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mousemove
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mouseout
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mouseover
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mouseup
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait mousewheel extends _WindowEvents
  
  @js.native
  sealed trait offline extends _WindowEvents
  
  @js.native
  sealed trait online extends _WindowEvents
  
  @js.native
  sealed trait orientationchange extends _WindowEvents
  
  @js.native
  sealed trait pagehide extends _WindowEvents
  
  @js.native
  sealed trait pageshow extends _WindowEvents
  
  @js.native
  sealed trait paste extends _ElementEvents
  
  @js.native
  sealed trait pause
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait play
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait playing
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait pointercancel extends _ElementEvents
  
  @js.native
  sealed trait pointerdown extends _ElementEvents
  
  @js.native
  sealed trait pointerenter extends _ElementEvents
  
  @js.native
  sealed trait pointerleave extends _ElementEvents
  
  @js.native
  sealed trait pointermove extends _ElementEvents
  
  @js.native
  sealed trait pointerout extends _ElementEvents
  
  @js.native
  sealed trait pointerover extends _ElementEvents
  
  @js.native
  sealed trait pointerup extends _ElementEvents
  
  @js.native
  sealed trait popstate extends _WindowEvents
  
  @js.native
  sealed trait progress
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait ratechange
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait readystatechange extends _WindowEvents
  
  @js.native
  sealed trait reset
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait resize
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait right extends Place
  
  @js.native
  sealed trait scroll
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait securitypolicyviolation extends _ElementEvents
  
  @js.native
  sealed trait seeked
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait seeking
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait select
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait selectionchange extends _ElementEvents
  
  @js.native
  sealed trait selectstart extends _ElementEvents
  
  @js.native
  sealed trait solid extends Effect
  
  @js.native
  sealed trait span extends js.Object
  
  @js.native
  sealed trait stalled
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait storage extends _WindowEvents
  
  @js.native
  sealed trait submit
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait success extends Type
  
  @js.native
  sealed trait suspend
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait timeupdate
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait toggle extends _ElementEvents
  
  @js.native
  sealed trait top extends Place
  
  @js.native
  sealed trait touchcancel extends _ElementEvents
  
  @js.native
  sealed trait touchend extends _ElementEvents
  
  @js.native
  sealed trait touchmove extends _ElementEvents
  
  @js.native
  sealed trait touchstart extends _ElementEvents
  
  @js.native
  sealed trait transitioncancel extends _ElementEvents
  
  @js.native
  sealed trait transitionend extends _ElementEvents
  
  @js.native
  sealed trait transitionrun extends _ElementEvents
  
  @js.native
  sealed trait transitionstart extends _ElementEvents
  
  @js.native
  sealed trait unload extends _WindowEvents
  
  @js.native
  sealed trait volumechange
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait vrdisplayactivate extends _WindowEvents
  
  @js.native
  sealed trait vrdisplayblur extends _WindowEvents
  
  @js.native
  sealed trait vrdisplayconnect extends _WindowEvents
  
  @js.native
  sealed trait vrdisplaydeactivate extends _WindowEvents
  
  @js.native
  sealed trait vrdisplaydisconnect extends _WindowEvents
  
  @js.native
  sealed trait vrdisplayfocus extends _WindowEvents
  
  @js.native
  sealed trait vrdisplaypointerrestricted extends _WindowEvents
  
  @js.native
  sealed trait vrdisplaypointerunrestricted extends _WindowEvents
  
  @js.native
  sealed trait vrdisplaypresentchange extends _WindowEvents
  
  @js.native
  sealed trait waiting
    extends _ElementEvents
       with _WindowEvents
  
  @js.native
  sealed trait warning extends Type
  
  @js.native
  sealed trait wheel extends _ElementEvents
  
  @scala.inline
  def MSGestureChange: MSGestureChange = "MSGestureChange".asInstanceOf[MSGestureChange]
  @scala.inline
  def MSGestureDoubleTap: MSGestureDoubleTap = "MSGestureDoubleTap".asInstanceOf[MSGestureDoubleTap]
  @scala.inline
  def MSGestureEnd: MSGestureEnd = "MSGestureEnd".asInstanceOf[MSGestureEnd]
  @scala.inline
  def MSGestureHold: MSGestureHold = "MSGestureHold".asInstanceOf[MSGestureHold]
  @scala.inline
  def MSGestureStart: MSGestureStart = "MSGestureStart".asInstanceOf[MSGestureStart]
  @scala.inline
  def MSGestureTap: MSGestureTap = "MSGestureTap".asInstanceOf[MSGestureTap]
  @scala.inline
  def MSInertiaStart: MSInertiaStart = "MSInertiaStart".asInstanceOf[MSInertiaStart]
  @scala.inline
  def MSPointerCancel: MSPointerCancel = "MSPointerCancel".asInstanceOf[MSPointerCancel]
  @scala.inline
  def MSPointerDown: MSPointerDown = "MSPointerDown".asInstanceOf[MSPointerDown]
  @scala.inline
  def MSPointerEnter: MSPointerEnter = "MSPointerEnter".asInstanceOf[MSPointerEnter]
  @scala.inline
  def MSPointerLeave: MSPointerLeave = "MSPointerLeave".asInstanceOf[MSPointerLeave]
  @scala.inline
  def MSPointerMove: MSPointerMove = "MSPointerMove".asInstanceOf[MSPointerMove]
  @scala.inline
  def MSPointerOut: MSPointerOut = "MSPointerOut".asInstanceOf[MSPointerOut]
  @scala.inline
  def MSPointerOver: MSPointerOver = "MSPointerOver".asInstanceOf[MSPointerOver]
  @scala.inline
  def MSPointerUp: MSPointerUp = "MSPointerUp".asInstanceOf[MSPointerUp]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def afterprint: afterprint = "afterprint".asInstanceOf[afterprint]
  @scala.inline
  def animationcancel: animationcancel = "animationcancel".asInstanceOf[animationcancel]
  @scala.inline
  def animationend: animationend = "animationend".asInstanceOf[animationend]
  @scala.inline
  def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  @scala.inline
  def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  @scala.inline
  def auxclick: auxclick = "auxclick".asInstanceOf[auxclick]
  @scala.inline
  def beforeprint: beforeprint = "beforeprint".asInstanceOf[beforeprint]
  @scala.inline
  def beforeunload: beforeunload = "beforeunload".asInstanceOf[beforeunload]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def canplay: canplay = "canplay".asInstanceOf[canplay]
  @scala.inline
  def canplaythrough: canplaythrough = "canplaythrough".asInstanceOf[canplaythrough]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def compassneedscalibration: compassneedscalibration = "compassneedscalibration".asInstanceOf[compassneedscalibration]
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def cuechange: cuechange = "cuechange".asInstanceOf[cuechange]
  @scala.inline
  def cut: cut = "cut".asInstanceOf[cut]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  @scala.inline
  def devicelight: devicelight = "devicelight".asInstanceOf[devicelight]
  @scala.inline
  def devicemotion: devicemotion = "devicemotion".asInstanceOf[devicemotion]
  @scala.inline
  def deviceorientation: deviceorientation = "deviceorientation".asInstanceOf[deviceorientation]
  @scala.inline
  def deviceorientationabsolute: deviceorientationabsolute = "deviceorientationabsolute".asInstanceOf[deviceorientationabsolute]
  @scala.inline
  def div: div = "div".asInstanceOf[div]
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def dragend: dragend = "dragend".asInstanceOf[dragend]
  @scala.inline
  def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  @scala.inline
  def dragexit: dragexit = "dragexit".asInstanceOf[dragexit]
  @scala.inline
  def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  @scala.inline
  def dragover: dragover = "dragover".asInstanceOf[dragover]
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  @scala.inline
  def durationchange: durationchange = "durationchange".asInstanceOf[durationchange]
  @scala.inline
  def emptied: emptied = "emptied".asInstanceOf[emptied]
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def focusin: focusin = "focusin".asInstanceOf[focusin]
  @scala.inline
  def focusout: focusout = "focusout".asInstanceOf[focusout]
  @scala.inline
  def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  @scala.inline
  def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  @scala.inline
  def gotpointercapture: gotpointercapture = "gotpointercapture".asInstanceOf[gotpointercapture]
  @scala.inline
  def hashchange: hashchange = "hashchange".asInstanceOf[hashchange]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def loadeddata: loadeddata = "loadeddata".asInstanceOf[loadeddata]
  @scala.inline
  def loadedmetadata: loadedmetadata = "loadedmetadata".asInstanceOf[loadedmetadata]
  @scala.inline
  def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  @scala.inline
  def lostpointercapture: lostpointercapture = "lostpointercapture".asInstanceOf[lostpointercapture]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  @scala.inline
  def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def mousewheel: mousewheel = "mousewheel".asInstanceOf[mousewheel]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def orientationchange: orientationchange = "orientationchange".asInstanceOf[orientationchange]
  @scala.inline
  def pagehide: pagehide = "pagehide".asInstanceOf[pagehide]
  @scala.inline
  def pageshow: pageshow = "pageshow".asInstanceOf[pageshow]
  @scala.inline
  def paste: paste = "paste".asInstanceOf[paste]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def play: play = "play".asInstanceOf[play]
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  @scala.inline
  def pointercancel: pointercancel = "pointercancel".asInstanceOf[pointercancel]
  @scala.inline
  def pointerdown: pointerdown = "pointerdown".asInstanceOf[pointerdown]
  @scala.inline
  def pointerenter: pointerenter = "pointerenter".asInstanceOf[pointerenter]
  @scala.inline
  def pointerleave: pointerleave = "pointerleave".asInstanceOf[pointerleave]
  @scala.inline
  def pointermove: pointermove = "pointermove".asInstanceOf[pointermove]
  @scala.inline
  def pointerout: pointerout = "pointerout".asInstanceOf[pointerout]
  @scala.inline
  def pointerover: pointerover = "pointerover".asInstanceOf[pointerover]
  @scala.inline
  def pointerup: pointerup = "pointerup".asInstanceOf[pointerup]
  @scala.inline
  def popstate: popstate = "popstate".asInstanceOf[popstate]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def ratechange: ratechange = "ratechange".asInstanceOf[ratechange]
  @scala.inline
  def readystatechange: readystatechange = "readystatechange".asInstanceOf[readystatechange]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  @scala.inline
  def securitypolicyviolation: securitypolicyviolation = "securitypolicyviolation".asInstanceOf[securitypolicyviolation]
  @scala.inline
  def seeked: seeked = "seeked".asInstanceOf[seeked]
  @scala.inline
  def seeking: seeking = "seeking".asInstanceOf[seeking]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def selectionchange: selectionchange = "selectionchange".asInstanceOf[selectionchange]
  @scala.inline
  def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  @scala.inline
  def span: span = "span".asInstanceOf[span]
  @scala.inline
  def stalled: stalled = "stalled".asInstanceOf[stalled]
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def suspend: suspend = "suspend".asInstanceOf[suspend]
  @scala.inline
  def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  @scala.inline
  def transitioncancel: transitioncancel = "transitioncancel".asInstanceOf[transitioncancel]
  @scala.inline
  def transitionend: transitionend = "transitionend".asInstanceOf[transitionend]
  @scala.inline
  def transitionrun: transitionrun = "transitionrun".asInstanceOf[transitionrun]
  @scala.inline
  def transitionstart: transitionstart = "transitionstart".asInstanceOf[transitionstart]
  @scala.inline
  def unload: unload = "unload".asInstanceOf[unload]
  @scala.inline
  def volumechange: volumechange = "volumechange".asInstanceOf[volumechange]
  @scala.inline
  def vrdisplayactivate: vrdisplayactivate = "vrdisplayactivate".asInstanceOf[vrdisplayactivate]
  @scala.inline
  def vrdisplayblur: vrdisplayblur = "vrdisplayblur".asInstanceOf[vrdisplayblur]
  @scala.inline
  def vrdisplayconnect: vrdisplayconnect = "vrdisplayconnect".asInstanceOf[vrdisplayconnect]
  @scala.inline
  def vrdisplaydeactivate: vrdisplaydeactivate = "vrdisplaydeactivate".asInstanceOf[vrdisplaydeactivate]
  @scala.inline
  def vrdisplaydisconnect: vrdisplaydisconnect = "vrdisplaydisconnect".asInstanceOf[vrdisplaydisconnect]
  @scala.inline
  def vrdisplayfocus: vrdisplayfocus = "vrdisplayfocus".asInstanceOf[vrdisplayfocus]
  @scala.inline
  def vrdisplaypointerrestricted: vrdisplaypointerrestricted = "vrdisplaypointerrestricted".asInstanceOf[vrdisplaypointerrestricted]
  @scala.inline
  def vrdisplaypointerunrestricted: vrdisplaypointerunrestricted = "vrdisplaypointerunrestricted".asInstanceOf[vrdisplaypointerunrestricted]
  @scala.inline
  def vrdisplaypresentchange: vrdisplaypresentchange = "vrdisplaypresentchange".asInstanceOf[vrdisplaypresentchange]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  @scala.inline
  def wheel: wheel = "wheel".asInstanceOf[wheel]
}

