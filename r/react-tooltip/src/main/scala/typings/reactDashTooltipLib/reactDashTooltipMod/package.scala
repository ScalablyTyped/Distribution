package typings
package reactDashTooltipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTooltipMod {
  /**
    * Adding `| string` seems strange but multiple events joined by a space are allowable, i.e. "click focus", so
    * at least using *EventMap will give developers some type hinting, but there's no way we can reliably
    * type this.
    */
  type ElementEvents = java.lang.String
  type GetContent = GetContentCallback | (js.Tuple2[GetContentCallback, scala.Double])
  type GetContentCallback = js.Function1[/* dataTip */ java.lang.String, reactLib.reactMod.ReactNode]
  type ReactTooltip = reactLib.reactMod.Component[Props, js.Object, js.Any]
  /* Rewritten from type alias, can be one of: 
    - reactDashTooltipLib.reactDashTooltipLibStrings.abort
    - reactDashTooltipLib.reactDashTooltipLibStrings.afterprint
    - reactDashTooltipLib.reactDashTooltipLibStrings.beforeprint
    - reactDashTooltipLib.reactDashTooltipLibStrings.beforeunload
    - reactDashTooltipLib.reactDashTooltipLibStrings.blur
    - reactDashTooltipLib.reactDashTooltipLibStrings.canplay
    - reactDashTooltipLib.reactDashTooltipLibStrings.canplaythrough
    - reactDashTooltipLib.reactDashTooltipLibStrings.change
    - reactDashTooltipLib.reactDashTooltipLibStrings.click
    - reactDashTooltipLib.reactDashTooltipLibStrings.compassneedscalibration
    - reactDashTooltipLib.reactDashTooltipLibStrings.contextmenu
    - reactDashTooltipLib.reactDashTooltipLibStrings.dblclick
    - reactDashTooltipLib.reactDashTooltipLibStrings.devicelight
    - reactDashTooltipLib.reactDashTooltipLibStrings.devicemotion
    - reactDashTooltipLib.reactDashTooltipLibStrings.deviceorientation
    - reactDashTooltipLib.reactDashTooltipLibStrings.deviceorientationabsolute
    - reactDashTooltipLib.reactDashTooltipLibStrings.drag
    - reactDashTooltipLib.reactDashTooltipLibStrings.dragend
    - reactDashTooltipLib.reactDashTooltipLibStrings.dragenter
    - reactDashTooltipLib.reactDashTooltipLibStrings.dragleave
    - reactDashTooltipLib.reactDashTooltipLibStrings.dragover
    - reactDashTooltipLib.reactDashTooltipLibStrings.dragstart
    - reactDashTooltipLib.reactDashTooltipLibStrings.drop
    - reactDashTooltipLib.reactDashTooltipLibStrings.durationchange
    - reactDashTooltipLib.reactDashTooltipLibStrings.emptied
    - reactDashTooltipLib.reactDashTooltipLibStrings.ended
    - reactDashTooltipLib.reactDashTooltipLibStrings.error
    - reactDashTooltipLib.reactDashTooltipLibStrings.focus
    - reactDashTooltipLib.reactDashTooltipLibStrings.hashchange
    - reactDashTooltipLib.reactDashTooltipLibStrings.input
    - reactDashTooltipLib.reactDashTooltipLibStrings.invalid
    - reactDashTooltipLib.reactDashTooltipLibStrings.keydown
    - reactDashTooltipLib.reactDashTooltipLibStrings.keypress
    - reactDashTooltipLib.reactDashTooltipLibStrings.keyup
    - reactDashTooltipLib.reactDashTooltipLibStrings.load
    - reactDashTooltipLib.reactDashTooltipLibStrings.loadeddata
    - reactDashTooltipLib.reactDashTooltipLibStrings.loadedmetadata
    - reactDashTooltipLib.reactDashTooltipLibStrings.loadstart
    - reactDashTooltipLib.reactDashTooltipLibStrings.message
    - reactDashTooltipLib.reactDashTooltipLibStrings.mousedown
    - reactDashTooltipLib.reactDashTooltipLibStrings.mouseenter
    - reactDashTooltipLib.reactDashTooltipLibStrings.mouseleave
    - reactDashTooltipLib.reactDashTooltipLibStrings.mousemove
    - reactDashTooltipLib.reactDashTooltipLibStrings.mouseout
    - reactDashTooltipLib.reactDashTooltipLibStrings.mouseover
    - reactDashTooltipLib.reactDashTooltipLibStrings.mouseup
    - reactDashTooltipLib.reactDashTooltipLibStrings.mousewheel
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSGestureChange
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSGestureDoubleTap
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSGestureEnd
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSGestureHold
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSGestureStart
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSGestureTap
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSInertiaStart
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerCancel
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerDown
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerEnter
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerLeave
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerMove
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerOut
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerOver
    - reactDashTooltipLib.reactDashTooltipLibStrings.MSPointerUp
    - reactDashTooltipLib.reactDashTooltipLibStrings.offline
    - reactDashTooltipLib.reactDashTooltipLibStrings.online
    - reactDashTooltipLib.reactDashTooltipLibStrings.orientationchange
    - reactDashTooltipLib.reactDashTooltipLibStrings.pagehide
    - reactDashTooltipLib.reactDashTooltipLibStrings.pageshow
    - reactDashTooltipLib.reactDashTooltipLibStrings.pause
    - reactDashTooltipLib.reactDashTooltipLibStrings.play
    - reactDashTooltipLib.reactDashTooltipLibStrings.playing
    - reactDashTooltipLib.reactDashTooltipLibStrings.popstate
    - reactDashTooltipLib.reactDashTooltipLibStrings.progress
    - reactDashTooltipLib.reactDashTooltipLibStrings.ratechange
    - reactDashTooltipLib.reactDashTooltipLibStrings.readystatechange
    - reactDashTooltipLib.reactDashTooltipLibStrings.reset
    - reactDashTooltipLib.reactDashTooltipLibStrings.resize
    - reactDashTooltipLib.reactDashTooltipLibStrings.scroll
    - reactDashTooltipLib.reactDashTooltipLibStrings.seeked
    - reactDashTooltipLib.reactDashTooltipLibStrings.seeking
    - reactDashTooltipLib.reactDashTooltipLibStrings.select
    - reactDashTooltipLib.reactDashTooltipLibStrings.stalled
    - reactDashTooltipLib.reactDashTooltipLibStrings.storage
    - reactDashTooltipLib.reactDashTooltipLibStrings.submit
    - reactDashTooltipLib.reactDashTooltipLibStrings.suspend
    - reactDashTooltipLib.reactDashTooltipLibStrings.timeupdate
    - reactDashTooltipLib.reactDashTooltipLibStrings.unload
    - reactDashTooltipLib.reactDashTooltipLibStrings.volumechange
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplayactivate
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplayblur
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplayconnect
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplaydeactivate
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplaydisconnect
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplayfocus
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplaypointerrestricted
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplaypointerunrestricted
    - reactDashTooltipLib.reactDashTooltipLibStrings.vrdisplaypresentchange
    - reactDashTooltipLib.reactDashTooltipLibStrings.waiting
    - java.lang.String
  */
  type WindowEvents = _WindowEvents | java.lang.String
}
