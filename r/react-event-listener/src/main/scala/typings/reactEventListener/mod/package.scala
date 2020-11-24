package typings.reactEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventListener[T /* <: typings.std.EventTarget | typings.reactEventListener.mod.WindowEventTargets */] = typings.react.mod.Component[typings.reactEventListener.mod.EventListenerProps[T], js.Object, js.Any]
  
  type EventListenerThisType[T /* <: typings.std.EventTarget | typings.reactEventListener.mod.WindowEventTargets */] = T | (/* import warning: importer.ImportType#apply Failed type conversion: std.Window[T] */ js.Any)
  
  type OnErrorEventHandlerArgs = js.Array[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactEventListener.reactEventListenerStrings.locationbar
    - typings.reactEventListener.reactEventListenerStrings.onmspointerleave
    - js.UndefOr[scala.Nothing]
    - typings.reactEventListener.reactEventListenerStrings.opener
    - typings.reactEventListener.reactEventListenerStrings.window
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayactivate
    - typings.reactEventListener.reactEventListenerStrings.speechSynthesis
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturechange
    - typings.reactEventListener.reactEventListenerStrings.styleMedia
    - typings.reactEventListener.reactEventListenerStrings.scrollX
    - typings.reactEventListener.reactEventListenerStrings.defaultStatus
    - typings.reactEventListener.reactEventListenerStrings.ondevicelight
    - typings.reactEventListener.reactEventListenerStrings.innerHeight
    - typings.reactEventListener.reactEventListenerStrings.screen
    - typings.reactEventListener.reactEventListenerStrings.statusbar
    - typings.reactEventListener.reactEventListenerStrings.location
    - typings.reactEventListener.reactEventListenerStrings.history
    - typings.reactEventListener.reactEventListenerStrings.status
    - typings.reactEventListener.reactEventListenerStrings.onreadystatechange
    - typings.reactEventListener.reactEventListenerStrings.screenTop
    - typings.reactEventListener.reactEventListenerStrings.offscreenBuffering
    - typings.reactEventListener.reactEventListenerStrings.onmspointerdown
    - typings.reactEventListener.reactEventListenerStrings.name
    - typings.reactEventListener.reactEventListenerStrings.onmspointerout
    - typings.reactEventListener.reactEventListenerStrings.menubar
    - typings.reactEventListener.reactEventListenerStrings.onmspointermove
    - typings.reactEventListener.reactEventListenerStrings.doNotTrack
    - typings.reactEventListener.reactEventListenerStrings.oncompassneedscalibration
    - typings.reactEventListener.reactEventListenerStrings.self
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaypointerrestricted
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaypresentchange
    - typings.reactEventListener.reactEventListenerStrings.onmspointerup
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaydeactivate
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaypointerunrestricted
    - typings.reactEventListener.reactEventListenerStrings.outerWidth
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayfocus
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturedoubletap
    - typings.reactEventListener.reactEventListenerStrings.msContentScript
    - typings.reactEventListener.reactEventListenerStrings.ondevicemotion
    - typings.reactEventListener.reactEventListenerStrings.outerHeight
    - typings.reactEventListener.reactEventListenerStrings.scrollbars
    - typings.reactEventListener.reactEventListenerStrings.frameElement
    - typings.reactEventListener.reactEventListenerStrings.clientInformation
    - typings.reactEventListener.reactEventListenerStrings.devicePixelRatio
    - typings.reactEventListener.reactEventListenerStrings.pageXOffset
    - typings.reactEventListener.reactEventListenerStrings.pageYOffset
    - typings.reactEventListener.reactEventListenerStrings.length
    - typings.reactEventListener.reactEventListenerStrings.toolbar
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturestart
    - typings.reactEventListener.reactEventListenerStrings.onmsinertiastart
    - typings.reactEventListener.reactEventListenerStrings.visualViewport
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayconnect
    - typings.reactEventListener.reactEventListenerStrings.onorientationchange
    - typings.reactEventListener.reactEventListenerStrings.scrollY
    - typings.reactEventListener.reactEventListenerStrings.onmspointerenter
    - typings.reactEventListener.reactEventListenerStrings.navigator
    - typings.reactEventListener.reactEventListenerStrings.orientation
    - typings.reactEventListener.reactEventListenerStrings.onmspointerover
    - typings.reactEventListener.reactEventListenerStrings.event
    - typings.reactEventListener.reactEventListenerStrings.top
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaydisconnect
    - typings.reactEventListener.reactEventListenerStrings.screenY
    - typings.reactEventListener.reactEventListenerStrings.innerWidth
    - typings.reactEventListener.reactEventListenerStrings.applicationCache
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturehold
    - typings.reactEventListener.reactEventListenerStrings.parent
    - typings.reactEventListener.reactEventListenerStrings.customElements
    - typings.reactEventListener.reactEventListenerStrings.document
    - typings.reactEventListener.reactEventListenerStrings.onmousewheel
    - typings.reactEventListener.reactEventListenerStrings.screenX
    - typings.reactEventListener.reactEventListenerStrings.external
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayblur
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturetap
    - typings.reactEventListener.reactEventListenerStrings.frames
    - typings.reactEventListener.reactEventListenerStrings.ondeviceorientation
    - typings.reactEventListener.reactEventListenerStrings.closed
    - typings.reactEventListener.reactEventListenerStrings.onmspointercancel
    - typings.reactEventListener.reactEventListenerStrings.personalbar
    - typings.reactEventListener.reactEventListenerStrings.onmsgestureend
    - typings.reactEventListener.reactEventListenerStrings.ondeviceorientationabsolute
    - typings.reactEventListener.reactEventListenerStrings.screenLeft
  */
  type WindowEventTargets = js.UndefOr[typings.reactEventListener.mod._WindowEventTargets]
}
