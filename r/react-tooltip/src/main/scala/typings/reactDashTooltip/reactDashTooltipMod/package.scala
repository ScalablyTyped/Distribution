package typings.reactDashTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTooltipMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ReactNode

  /**
    * Adding `| string` seems strange but multiple events joined by a space are allowable, i.e. "click focus", so
    * at least using *EventMap will give developers some type hinting, but there's no way we can reliably
    * type this.
    */
  type ElementEvents = String
  type GetContent = GetContentCallback | (js.Tuple2[GetContentCallback, Double])
  type GetContentCallback = js.Function1[/* dataTip */ String, ReactNode]
  type ReactTooltip = Component[Props, js.Object, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashTooltip.reactDashTooltipStrings.abort
    - typings.reactDashTooltip.reactDashTooltipStrings.afterprint
    - typings.reactDashTooltip.reactDashTooltipStrings.beforeprint
    - typings.reactDashTooltip.reactDashTooltipStrings.beforeunload
    - typings.reactDashTooltip.reactDashTooltipStrings.blur
    - typings.reactDashTooltip.reactDashTooltipStrings.canplay
    - typings.reactDashTooltip.reactDashTooltipStrings.canplaythrough
    - typings.reactDashTooltip.reactDashTooltipStrings.change
    - typings.reactDashTooltip.reactDashTooltipStrings.click
    - typings.reactDashTooltip.reactDashTooltipStrings.compassneedscalibration
    - typings.reactDashTooltip.reactDashTooltipStrings.contextmenu
    - typings.reactDashTooltip.reactDashTooltipStrings.dblclick
    - typings.reactDashTooltip.reactDashTooltipStrings.devicelight
    - typings.reactDashTooltip.reactDashTooltipStrings.devicemotion
    - typings.reactDashTooltip.reactDashTooltipStrings.deviceorientation
    - typings.reactDashTooltip.reactDashTooltipStrings.deviceorientationabsolute
    - typings.reactDashTooltip.reactDashTooltipStrings.drag
    - typings.reactDashTooltip.reactDashTooltipStrings.dragend
    - typings.reactDashTooltip.reactDashTooltipStrings.dragenter
    - typings.reactDashTooltip.reactDashTooltipStrings.dragleave
    - typings.reactDashTooltip.reactDashTooltipStrings.dragover
    - typings.reactDashTooltip.reactDashTooltipStrings.dragstart
    - typings.reactDashTooltip.reactDashTooltipStrings.drop
    - typings.reactDashTooltip.reactDashTooltipStrings.durationchange
    - typings.reactDashTooltip.reactDashTooltipStrings.emptied
    - typings.reactDashTooltip.reactDashTooltipStrings.ended
    - typings.reactDashTooltip.reactDashTooltipStrings.error
    - typings.reactDashTooltip.reactDashTooltipStrings.focus
    - typings.reactDashTooltip.reactDashTooltipStrings.hashchange
    - typings.reactDashTooltip.reactDashTooltipStrings.input
    - typings.reactDashTooltip.reactDashTooltipStrings.invalid
    - typings.reactDashTooltip.reactDashTooltipStrings.keydown
    - typings.reactDashTooltip.reactDashTooltipStrings.keypress
    - typings.reactDashTooltip.reactDashTooltipStrings.keyup
    - typings.reactDashTooltip.reactDashTooltipStrings.load
    - typings.reactDashTooltip.reactDashTooltipStrings.loadeddata
    - typings.reactDashTooltip.reactDashTooltipStrings.loadedmetadata
    - typings.reactDashTooltip.reactDashTooltipStrings.loadstart
    - typings.reactDashTooltip.reactDashTooltipStrings.message
    - typings.reactDashTooltip.reactDashTooltipStrings.mousedown
    - typings.reactDashTooltip.reactDashTooltipStrings.mouseenter
    - typings.reactDashTooltip.reactDashTooltipStrings.mouseleave
    - typings.reactDashTooltip.reactDashTooltipStrings.mousemove
    - typings.reactDashTooltip.reactDashTooltipStrings.mouseout
    - typings.reactDashTooltip.reactDashTooltipStrings.mouseover
    - typings.reactDashTooltip.reactDashTooltipStrings.mouseup
    - typings.reactDashTooltip.reactDashTooltipStrings.mousewheel
    - typings.reactDashTooltip.reactDashTooltipStrings.MSGestureChange
    - typings.reactDashTooltip.reactDashTooltipStrings.MSGestureDoubleTap
    - typings.reactDashTooltip.reactDashTooltipStrings.MSGestureEnd
    - typings.reactDashTooltip.reactDashTooltipStrings.MSGestureHold
    - typings.reactDashTooltip.reactDashTooltipStrings.MSGestureStart
    - typings.reactDashTooltip.reactDashTooltipStrings.MSGestureTap
    - typings.reactDashTooltip.reactDashTooltipStrings.MSInertiaStart
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerCancel
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerDown
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerEnter
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerLeave
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerMove
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerOut
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerOver
    - typings.reactDashTooltip.reactDashTooltipStrings.MSPointerUp
    - typings.reactDashTooltip.reactDashTooltipStrings.offline
    - typings.reactDashTooltip.reactDashTooltipStrings.online
    - typings.reactDashTooltip.reactDashTooltipStrings.orientationchange
    - typings.reactDashTooltip.reactDashTooltipStrings.pagehide
    - typings.reactDashTooltip.reactDashTooltipStrings.pageshow
    - typings.reactDashTooltip.reactDashTooltipStrings.pause
    - typings.reactDashTooltip.reactDashTooltipStrings.play
    - typings.reactDashTooltip.reactDashTooltipStrings.playing
    - typings.reactDashTooltip.reactDashTooltipStrings.popstate
    - typings.reactDashTooltip.reactDashTooltipStrings.progress
    - typings.reactDashTooltip.reactDashTooltipStrings.ratechange
    - typings.reactDashTooltip.reactDashTooltipStrings.readystatechange
    - typings.reactDashTooltip.reactDashTooltipStrings.reset
    - typings.reactDashTooltip.reactDashTooltipStrings.resize
    - typings.reactDashTooltip.reactDashTooltipStrings.scroll
    - typings.reactDashTooltip.reactDashTooltipStrings.seeked
    - typings.reactDashTooltip.reactDashTooltipStrings.seeking
    - typings.reactDashTooltip.reactDashTooltipStrings.select
    - typings.reactDashTooltip.reactDashTooltipStrings.stalled
    - typings.reactDashTooltip.reactDashTooltipStrings.storage
    - typings.reactDashTooltip.reactDashTooltipStrings.submit
    - typings.reactDashTooltip.reactDashTooltipStrings.suspend
    - typings.reactDashTooltip.reactDashTooltipStrings.timeupdate
    - typings.reactDashTooltip.reactDashTooltipStrings.unload
    - typings.reactDashTooltip.reactDashTooltipStrings.volumechange
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplayactivate
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplayblur
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplayconnect
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplaydeactivate
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplaydisconnect
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplayfocus
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplaypointerrestricted
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplaypointerunrestricted
    - typings.reactDashTooltip.reactDashTooltipStrings.vrdisplaypresentchange
    - typings.reactDashTooltip.reactDashTooltipStrings.waiting
    - java.lang.String
  */
  type WindowEvents = _WindowEvents | String
}
