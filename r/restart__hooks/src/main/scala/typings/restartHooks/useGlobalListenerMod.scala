package typings.restartHooks

import typings.restartHooks.restartHooksStrings.abort
import typings.restartHooks.restartHooksStrings.animationcancel
import typings.restartHooks.restartHooksStrings.animationend
import typings.restartHooks.restartHooksStrings.animationiteration
import typings.restartHooks.restartHooksStrings.animationstart
import typings.restartHooks.restartHooksStrings.auxclick
import typings.restartHooks.restartHooksStrings.blur
import typings.restartHooks.restartHooksStrings.cancel
import typings.restartHooks.restartHooksStrings.canplay
import typings.restartHooks.restartHooksStrings.canplaythrough
import typings.restartHooks.restartHooksStrings.change
import typings.restartHooks.restartHooksStrings.click
import typings.restartHooks.restartHooksStrings.close
import typings.restartHooks.restartHooksStrings.contextmenu
import typings.restartHooks.restartHooksStrings.copy
import typings.restartHooks.restartHooksStrings.cuechange
import typings.restartHooks.restartHooksStrings.cut
import typings.restartHooks.restartHooksStrings.dblclick
import typings.restartHooks.restartHooksStrings.drag
import typings.restartHooks.restartHooksStrings.dragend
import typings.restartHooks.restartHooksStrings.dragenter
import typings.restartHooks.restartHooksStrings.dragexit
import typings.restartHooks.restartHooksStrings.dragleave
import typings.restartHooks.restartHooksStrings.dragover
import typings.restartHooks.restartHooksStrings.dragstart
import typings.restartHooks.restartHooksStrings.drop
import typings.restartHooks.restartHooksStrings.durationchange
import typings.restartHooks.restartHooksStrings.emptied
import typings.restartHooks.restartHooksStrings.ended
import typings.restartHooks.restartHooksStrings.error
import typings.restartHooks.restartHooksStrings.focus
import typings.restartHooks.restartHooksStrings.focusin
import typings.restartHooks.restartHooksStrings.focusout
import typings.restartHooks.restartHooksStrings.fullscreenchange
import typings.restartHooks.restartHooksStrings.fullscreenerror
import typings.restartHooks.restartHooksStrings.gotpointercapture
import typings.restartHooks.restartHooksStrings.input
import typings.restartHooks.restartHooksStrings.invalid
import typings.restartHooks.restartHooksStrings.keydown
import typings.restartHooks.restartHooksStrings.keypress
import typings.restartHooks.restartHooksStrings.keyup
import typings.restartHooks.restartHooksStrings.load
import typings.restartHooks.restartHooksStrings.loadeddata
import typings.restartHooks.restartHooksStrings.loadedmetadata
import typings.restartHooks.restartHooksStrings.loadstart
import typings.restartHooks.restartHooksStrings.lostpointercapture
import typings.restartHooks.restartHooksStrings.mousedown
import typings.restartHooks.restartHooksStrings.mouseenter
import typings.restartHooks.restartHooksStrings.mouseleave
import typings.restartHooks.restartHooksStrings.mousemove
import typings.restartHooks.restartHooksStrings.mouseout
import typings.restartHooks.restartHooksStrings.mouseover
import typings.restartHooks.restartHooksStrings.mouseup
import typings.restartHooks.restartHooksStrings.paste
import typings.restartHooks.restartHooksStrings.pause
import typings.restartHooks.restartHooksStrings.play
import typings.restartHooks.restartHooksStrings.playing
import typings.restartHooks.restartHooksStrings.pointercancel
import typings.restartHooks.restartHooksStrings.pointerdown
import typings.restartHooks.restartHooksStrings.pointerenter
import typings.restartHooks.restartHooksStrings.pointerleave
import typings.restartHooks.restartHooksStrings.pointerlockchange
import typings.restartHooks.restartHooksStrings.pointerlockerror
import typings.restartHooks.restartHooksStrings.pointermove
import typings.restartHooks.restartHooksStrings.pointerout
import typings.restartHooks.restartHooksStrings.pointerover
import typings.restartHooks.restartHooksStrings.pointerup
import typings.restartHooks.restartHooksStrings.progress
import typings.restartHooks.restartHooksStrings.ratechange
import typings.restartHooks.restartHooksStrings.readystatechange
import typings.restartHooks.restartHooksStrings.reset
import typings.restartHooks.restartHooksStrings.resize
import typings.restartHooks.restartHooksStrings.scroll
import typings.restartHooks.restartHooksStrings.securitypolicyviolation
import typings.restartHooks.restartHooksStrings.seeked
import typings.restartHooks.restartHooksStrings.seeking
import typings.restartHooks.restartHooksStrings.select
import typings.restartHooks.restartHooksStrings.selectionchange
import typings.restartHooks.restartHooksStrings.selectstart
import typings.restartHooks.restartHooksStrings.stalled
import typings.restartHooks.restartHooksStrings.submit
import typings.restartHooks.restartHooksStrings.suspend
import typings.restartHooks.restartHooksStrings.timeupdate
import typings.restartHooks.restartHooksStrings.toggle
import typings.restartHooks.restartHooksStrings.touchcancel
import typings.restartHooks.restartHooksStrings.touchend
import typings.restartHooks.restartHooksStrings.touchmove
import typings.restartHooks.restartHooksStrings.touchstart
import typings.restartHooks.restartHooksStrings.transitioncancel
import typings.restartHooks.restartHooksStrings.transitionend
import typings.restartHooks.restartHooksStrings.transitionrun
import typings.restartHooks.restartHooksStrings.transitionstart
import typings.restartHooks.restartHooksStrings.visibilitychange
import typings.restartHooks.restartHooksStrings.volumechange
import typings.restartHooks.restartHooksStrings.waiting
import typings.restartHooks.restartHooksStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useGlobalListenerMod {
  
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_abort(event: abort, handler: DocumentEventHandler[abort]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_abort(event: abort, handler: DocumentEventHandler[abort], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_abort(event: abort, handler: DocumentEventHandler[abort], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationcancel(
    event: animationcancel,
    handler: DocumentEventHandler[animationcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationend(event: animationend, handler: DocumentEventHandler[animationend]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationiteration(
    event: animationiteration,
    handler: DocumentEventHandler[animationiteration],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_animationstart(
    event: animationstart,
    handler: DocumentEventHandler[animationstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_blur(event: blur, handler: DocumentEventHandler[blur]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_blur(event: blur, handler: DocumentEventHandler[blur], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_blur(event: blur, handler: DocumentEventHandler[blur], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cancel(event: cancel, handler: DocumentEventHandler[cancel]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cancel(event: cancel, handler: DocumentEventHandler[cancel], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cancel(event: cancel, handler: DocumentEventHandler[cancel], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_canplay(event: canplay, handler: DocumentEventHandler[canplay]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_canplaythrough(
    event: canplaythrough,
    handler: DocumentEventHandler[canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_change(event: change, handler: DocumentEventHandler[change]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_change(event: change, handler: DocumentEventHandler[change], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_change(event: change, handler: DocumentEventHandler[change], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_click(event: click, handler: DocumentEventHandler[click]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_click(event: click, handler: DocumentEventHandler[click], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_click(event: click, handler: DocumentEventHandler[click], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_close(event: close, handler: DocumentEventHandler[close]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_close(event: close, handler: DocumentEventHandler[close], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_close(event: close, handler: DocumentEventHandler[close], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_copy(event: copy, handler: DocumentEventHandler[copy]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_copy(event: copy, handler: DocumentEventHandler[copy], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_copy(event: copy, handler: DocumentEventHandler[copy], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cut(event: cut, handler: DocumentEventHandler[cut]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cut(event: cut, handler: DocumentEventHandler[cut], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_cut(event: cut, handler: DocumentEventHandler[cut], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_drag(event: drag, handler: DocumentEventHandler[drag]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_drag(event: drag, handler: DocumentEventHandler[drag], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_drag(event: drag, handler: DocumentEventHandler[drag], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragend(event: dragend, handler: DocumentEventHandler[dragend]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragexit(event: dragexit, handler: DocumentEventHandler[dragexit]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragexit(event: dragexit, handler: DocumentEventHandler[dragexit], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragexit(event: dragexit, handler: DocumentEventHandler[dragexit], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragover(event: dragover, handler: DocumentEventHandler[dragover]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_drop(event: drop, handler: DocumentEventHandler[drop]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_drop(event: drop, handler: DocumentEventHandler[drop], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_drop(event: drop, handler: DocumentEventHandler[drop], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_durationchange(
    event: durationchange,
    handler: DocumentEventHandler[durationchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_emptied(event: emptied, handler: DocumentEventHandler[emptied]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_ended(event: ended, handler: DocumentEventHandler[ended]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_ended(event: ended, handler: DocumentEventHandler[ended], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_ended(event: ended, handler: DocumentEventHandler[ended], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_error(event: error, handler: DocumentEventHandler[error]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_error(event: error, handler: DocumentEventHandler[error], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_error(event: error, handler: DocumentEventHandler[error], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focus(event: focus, handler: DocumentEventHandler[focus]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focus(event: focus, handler: DocumentEventHandler[focus], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focus(event: focus, handler: DocumentEventHandler[focus], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focusin(event: focusin, handler: DocumentEventHandler[focusin]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focusout(event: focusout, handler: DocumentEventHandler[focusout]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_fullscreenchange(
    event: fullscreenchange,
    handler: DocumentEventHandler[fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_fullscreenerror(
    event: fullscreenerror,
    handler: DocumentEventHandler[fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_gotpointercapture(
    event: gotpointercapture,
    handler: DocumentEventHandler[gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_input(event: input, handler: DocumentEventHandler[input]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_input(event: input, handler: DocumentEventHandler[input], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_input(event: input, handler: DocumentEventHandler[input], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_invalid(event: invalid, handler: DocumentEventHandler[invalid]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keydown(event: keydown, handler: DocumentEventHandler[keydown]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keypress(event: keypress, handler: DocumentEventHandler[keypress]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keyup(event: keyup, handler: DocumentEventHandler[keyup]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_load(event: load, handler: DocumentEventHandler[load]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_load(event: load, handler: DocumentEventHandler[load], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_load(event: load, handler: DocumentEventHandler[load], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadedmetadata(
    event: loadedmetadata,
    handler: DocumentEventHandler[loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_lostpointercapture(
    event: lostpointercapture,
    handler: DocumentEventHandler[lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_paste(event: paste, handler: DocumentEventHandler[paste]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_paste(event: paste, handler: DocumentEventHandler[paste], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_paste(event: paste, handler: DocumentEventHandler[paste], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pause(event: pause, handler: DocumentEventHandler[pause]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pause(event: pause, handler: DocumentEventHandler[pause], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pause(event: pause, handler: DocumentEventHandler[pause], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_play(event: play, handler: DocumentEventHandler[play]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_play(event: play, handler: DocumentEventHandler[play], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_play(event: play, handler: DocumentEventHandler[play], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_playing(event: playing, handler: DocumentEventHandler[playing]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_playing(event: playing, handler: DocumentEventHandler[playing], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_playing(event: playing, handler: DocumentEventHandler[playing], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointercancel(
    event: pointercancel,
    handler: DocumentEventHandler[pointercancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerlockchange(
    event: pointerlockchange,
    handler: DocumentEventHandler[pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerlockerror(
    event: pointerlockerror,
    handler: DocumentEventHandler[pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_progress(event: progress, handler: DocumentEventHandler[progress]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_progress(event: progress, handler: DocumentEventHandler[progress], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_progress(event: progress, handler: DocumentEventHandler[progress], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_readystatechange(
    event: readystatechange,
    handler: DocumentEventHandler[readystatechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_reset(event: reset, handler: DocumentEventHandler[reset]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_reset(event: reset, handler: DocumentEventHandler[reset], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_reset(event: reset, handler: DocumentEventHandler[reset], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_resize(event: resize, handler: DocumentEventHandler[resize]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_resize(event: resize, handler: DocumentEventHandler[resize], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_resize(event: resize, handler: DocumentEventHandler[resize], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_scroll(event: scroll, handler: DocumentEventHandler[scroll]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(event: securitypolicyviolation, handler: DocumentEventHandler[securitypolicyviolation]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: Boolean
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_seeked(event: seeked, handler: DocumentEventHandler[seeked]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_seeking(event: seeking, handler: DocumentEventHandler[seeking]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_select(event: select, handler: DocumentEventHandler[select]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_select(event: select, handler: DocumentEventHandler[select], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_select(event: select, handler: DocumentEventHandler[select], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_selectionchange(
    event: selectionchange,
    handler: DocumentEventHandler[selectionchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_stalled(event: stalled, handler: DocumentEventHandler[stalled]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_submit(event: submit, handler: DocumentEventHandler[submit]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_submit(event: submit, handler: DocumentEventHandler[submit], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_submit(event: submit, handler: DocumentEventHandler[submit], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_suspend(event: suspend, handler: DocumentEventHandler[suspend]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_toggle(event: toggle, handler: DocumentEventHandler[toggle]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchend(event: touchend, handler: DocumentEventHandler[touchend]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitioncancel(
    event: transitioncancel,
    handler: DocumentEventHandler[transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionend(
    event: transitionend,
    handler: DocumentEventHandler[transitionend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionrun(
    event: transitionrun,
    handler: DocumentEventHandler[transitionrun],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_transitionstart(
    event: transitionstart,
    handler: DocumentEventHandler[transitionstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_visibilitychange(
    event: visibilitychange,
    handler: DocumentEventHandler[visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_waiting(event: waiting, handler: DocumentEventHandler[waiting]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: AddEventListenerOptions): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_wheel(event: wheel, handler: DocumentEventHandler[wheel]): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: Boolean): Unit = js.native
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Default)
  @js.native
  def default_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: AddEventListenerOptions): Unit = js.native
  
  type DocumentEventHandler[K /* <: fullscreenchange | fullscreenerror | pointerlockchange | pointerlockerror | readystatechange | visibilitychange */] = js.ThisFunction1[
    /* this */ Document, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[K] */ /* ev */ js.Any, 
    js.Any
  ]
}
