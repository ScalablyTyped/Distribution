package typings.reactTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Adding `| string` seems strange but multiple events joined by a space are allowable, i.e. "click focus", so
    * at least using *EventMap will give developers some type hinting, but there's no way we can reliably
    * type this.
    */
  type ElementEvents = java.lang.String
  type GetContent = typings.reactTooltip.mod.GetContentCallback | (js.Tuple2[typings.reactTooltip.mod.GetContentCallback, scala.Double])
  type GetContentCallback = js.Function1[/* dataTip */ java.lang.String, typings.react.mod.ReactNode]
  type ReactTooltip = typings.react.mod.Component[typings.reactTooltip.mod.Props, js.Object, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.abort
    - typings.reactTooltip.reactTooltipStrings.afterprint
    - typings.reactTooltip.reactTooltipStrings.beforeprint
    - typings.reactTooltip.reactTooltipStrings.beforeunload
    - typings.reactTooltip.reactTooltipStrings.blur
    - typings.reactTooltip.reactTooltipStrings.canplay
    - typings.reactTooltip.reactTooltipStrings.canplaythrough
    - typings.reactTooltip.reactTooltipStrings.change
    - typings.reactTooltip.reactTooltipStrings.click
    - typings.reactTooltip.reactTooltipStrings.compassneedscalibration
    - typings.reactTooltip.reactTooltipStrings.contextmenu
    - typings.reactTooltip.reactTooltipStrings.dblclick
    - typings.reactTooltip.reactTooltipStrings.devicelight
    - typings.reactTooltip.reactTooltipStrings.devicemotion
    - typings.reactTooltip.reactTooltipStrings.deviceorientation
    - typings.reactTooltip.reactTooltipStrings.deviceorientationabsolute
    - typings.reactTooltip.reactTooltipStrings.drag
    - typings.reactTooltip.reactTooltipStrings.dragend
    - typings.reactTooltip.reactTooltipStrings.dragenter
    - typings.reactTooltip.reactTooltipStrings.dragleave
    - typings.reactTooltip.reactTooltipStrings.dragover
    - typings.reactTooltip.reactTooltipStrings.dragstart
    - typings.reactTooltip.reactTooltipStrings.drop
    - typings.reactTooltip.reactTooltipStrings.durationchange
    - typings.reactTooltip.reactTooltipStrings.emptied
    - typings.reactTooltip.reactTooltipStrings.ended
    - typings.reactTooltip.reactTooltipStrings.error
    - typings.reactTooltip.reactTooltipStrings.focus
    - typings.reactTooltip.reactTooltipStrings.hashchange
    - typings.reactTooltip.reactTooltipStrings.input
    - typings.reactTooltip.reactTooltipStrings.invalid
    - typings.reactTooltip.reactTooltipStrings.keydown
    - typings.reactTooltip.reactTooltipStrings.keypress
    - typings.reactTooltip.reactTooltipStrings.keyup
    - typings.reactTooltip.reactTooltipStrings.load
    - typings.reactTooltip.reactTooltipStrings.loadeddata
    - typings.reactTooltip.reactTooltipStrings.loadedmetadata
    - typings.reactTooltip.reactTooltipStrings.loadstart
    - typings.reactTooltip.reactTooltipStrings.message
    - typings.reactTooltip.reactTooltipStrings.mousedown
    - typings.reactTooltip.reactTooltipStrings.mouseenter
    - typings.reactTooltip.reactTooltipStrings.mouseleave
    - typings.reactTooltip.reactTooltipStrings.mousemove
    - typings.reactTooltip.reactTooltipStrings.mouseout
    - typings.reactTooltip.reactTooltipStrings.mouseover
    - typings.reactTooltip.reactTooltipStrings.mouseup
    - typings.reactTooltip.reactTooltipStrings.mousewheel
    - typings.reactTooltip.reactTooltipStrings.MSGestureChange
    - typings.reactTooltip.reactTooltipStrings.MSGestureDoubleTap
    - typings.reactTooltip.reactTooltipStrings.MSGestureEnd
    - typings.reactTooltip.reactTooltipStrings.MSGestureHold
    - typings.reactTooltip.reactTooltipStrings.MSGestureStart
    - typings.reactTooltip.reactTooltipStrings.MSGestureTap
    - typings.reactTooltip.reactTooltipStrings.MSInertiaStart
    - typings.reactTooltip.reactTooltipStrings.MSPointerCancel
    - typings.reactTooltip.reactTooltipStrings.MSPointerDown
    - typings.reactTooltip.reactTooltipStrings.MSPointerEnter
    - typings.reactTooltip.reactTooltipStrings.MSPointerLeave
    - typings.reactTooltip.reactTooltipStrings.MSPointerMove
    - typings.reactTooltip.reactTooltipStrings.MSPointerOut
    - typings.reactTooltip.reactTooltipStrings.MSPointerOver
    - typings.reactTooltip.reactTooltipStrings.MSPointerUp
    - typings.reactTooltip.reactTooltipStrings.offline
    - typings.reactTooltip.reactTooltipStrings.online
    - typings.reactTooltip.reactTooltipStrings.orientationchange
    - typings.reactTooltip.reactTooltipStrings.pagehide
    - typings.reactTooltip.reactTooltipStrings.pageshow
    - typings.reactTooltip.reactTooltipStrings.pause
    - typings.reactTooltip.reactTooltipStrings.play
    - typings.reactTooltip.reactTooltipStrings.playing
    - typings.reactTooltip.reactTooltipStrings.popstate
    - typings.reactTooltip.reactTooltipStrings.progress
    - typings.reactTooltip.reactTooltipStrings.ratechange
    - typings.reactTooltip.reactTooltipStrings.readystatechange
    - typings.reactTooltip.reactTooltipStrings.reset
    - typings.reactTooltip.reactTooltipStrings.resize
    - typings.reactTooltip.reactTooltipStrings.scroll
    - typings.reactTooltip.reactTooltipStrings.seeked
    - typings.reactTooltip.reactTooltipStrings.seeking
    - typings.reactTooltip.reactTooltipStrings.select
    - typings.reactTooltip.reactTooltipStrings.stalled
    - typings.reactTooltip.reactTooltipStrings.storage
    - typings.reactTooltip.reactTooltipStrings.submit
    - typings.reactTooltip.reactTooltipStrings.suspend
    - typings.reactTooltip.reactTooltipStrings.timeupdate
    - typings.reactTooltip.reactTooltipStrings.unload
    - typings.reactTooltip.reactTooltipStrings.volumechange
    - typings.reactTooltip.reactTooltipStrings.vrdisplayactivate
    - typings.reactTooltip.reactTooltipStrings.vrdisplayblur
    - typings.reactTooltip.reactTooltipStrings.vrdisplayconnect
    - typings.reactTooltip.reactTooltipStrings.vrdisplaydeactivate
    - typings.reactTooltip.reactTooltipStrings.vrdisplaydisconnect
    - typings.reactTooltip.reactTooltipStrings.vrdisplayfocus
    - typings.reactTooltip.reactTooltipStrings.vrdisplaypointerrestricted
    - typings.reactTooltip.reactTooltipStrings.vrdisplaypointerunrestricted
    - typings.reactTooltip.reactTooltipStrings.vrdisplaypresentchange
    - typings.reactTooltip.reactTooltipStrings.waiting
    - java.lang.String
  */
  type WindowEvents = typings.reactTooltip.mod._WindowEvents | java.lang.String
}
